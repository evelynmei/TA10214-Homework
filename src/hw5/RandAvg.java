package hw5;

public class RandAvg {
//請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
//本次亂數結果：
//32 35 15 12 81 28 20 45 40 21
//上列平均數為： 32
int[] randoms = new int[10];
double sum = 0;
    public void randAvg(){
        for (int i = 0; i < 10 ; i++) {

            randoms[i] = (int)(Math.random() *101);
            sum += randoms[i];
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
        System.out.println("上列平均數為： " + sum / 10);
    }
    public static void main(String[] args) {
        RandAvg ra = new RandAvg();
        ra.randAvg();
    }
}


