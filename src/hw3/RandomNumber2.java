package hw3;
import java.util.Scanner;
public class RandomNumber2 {
/*設計一隻程式,會產生0~100亂數,每次猜就會提示你是大於還是小於正確答案,
 * 猜錯會顯示錯誤訊息,猜對則顯示正確訊息*/
	public static void main(String[] args) {
		System.out.println("開始猜數字(0~100): ");
        Scanner sc = new Scanner(System.in);
        
      //隨機產生0~100的整數
        int random = (int)(Math.random()*101);
        
        int input = sc.nextInt();
        while(input != random) {
        	if(input > random) {
        		System.out.println("再小一點");
        	}
        	if(input < random) {
        		System.out.println("再大一點");
        	}
        	input = sc.nextInt();
        }
        System.out.println("答對了!");
	}
}
