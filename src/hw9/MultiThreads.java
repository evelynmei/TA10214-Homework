package hw9;

import java.util.Random;

public class MultiThreads implements Runnable{
//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500~3000之間的毫秒數
    int counter = 0;
    String name;

    public MultiThreads() {
    }
    public MultiThreads(String name){
        this.name = name;
    }

    @Override
    public void run(){

        while (counter < 10){
            counter ++;
            System.out.println(name + "吃了第" + counter + "碗飯");
            try{
                Thread.sleep( (int)(Math.random()*2500)+500);
            } catch (Exception e){
        }
        }
        System.out.println(name + "吃完了!");
    }

    public static void main(String[] args) {
        MultiThreads t1 = new MultiThreads("饅頭人");
        Thread james = new Thread(t1);
        MultiThreads t2 = new MultiThreads("詹姆士");
        Thread moon = new Thread(t2);
        System.out.println("--------大胃王快食比賽開始!-------");
        james.start();
        moon.start();
        try{
            james.join();
            moon.join();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("--------大胃王快食比賽結束!-------");
    }
}
