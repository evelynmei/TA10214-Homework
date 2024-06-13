package hw9;

//媽媽只要看到熊大帳戶的餘額超過3000元,就會停止匯款給熊大;
//但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。
//如果帳戶餘額低於要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
//假設媽媽一次匯款2000元,熊大一次提款1000元,
//寫一個Java程式模擬匯款10次與提款10次的情形。
class Account {
    private int balance = 0; //帳戶餘額

    synchronized public void deposit(int amount) { //匯款
        while (balance >= 3000) {
            try {
                System.out.println("媽媽看到餘額在3000以上, 暫停匯款");
                wait();
            } catch (InterruptedException ie) {

                System.out.println("媽媽可以結束匯款惹～");
                return; //中斷迴圈且不向下執行(break會中斷並向下執行)
            }
        }
        balance += amount;
        System.out.println("媽媽存了" + amount + ", 帳戶共有: " + balance);
        notify();
    }

    synchronized public void withdraw(int amount) { //提款
        while (balance <= 2000) {
            System.out.println("熊大看到餘額在2000以下, 要求匯款");
            System.out.println("媽媽被熊大要求匯款!");
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("熊大領了" + amount + ", 帳戶共有: " + balance);

        if (balance < 1000) {
            System.out.println("熊大看到帳戶沒錢, 暫停提款");
        } else if (balance > 0) {
            System.out.println("熊大被老媽告知帳戶已經有錢!");
            notify();
        }
    }
}

class Mom extends Thread {
    Account account;

    public Mom(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.deposit(2000);
        }
    }
}

class Brown extends Thread {
    Account account;

    public Brown(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.withdraw(1000);
        }
    }
}

public class BrownAskForMoney {
    public static void main(String[] args) {
        Account account = new Account();
        Mom mom = new Mom(account);
        Brown brown = new Brown(account);
        mom.start();
        brown.start();

        while (true) {
            // 熊大執行緒跑完了而且媽媽還在就中斷wait
            if (!brown.isAlive() && mom.isAlive()) {
                mom.interrupt();
            }
            try {
                // 讓無窮迴圈睡一下，把執行權讓出來
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } catch (IllegalMonitorStateException e) {
                e.printStackTrace();
            }

            // 兩個執行緒都結束了，main也可以結束
            if (!brown.isAlive() && !mom.isAlive())
                break;
        }
    }
}
