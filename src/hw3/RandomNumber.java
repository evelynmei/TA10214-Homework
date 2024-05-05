package hw3;
import java.util.Scanner;
public class RandomNumber {
/*請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,
 * 猜錯會顯示錯誤訊息,猜對則顯示正確訊息
 * (提示:Scanner,亂數方法,無窮迴圈)*/
	
	public static void main(String[] args)	{
		System.out.println("開始猜數字(0~9): ");
        Scanner sc = new Scanner(System.in);
        
        //隨機產生0~9的整數
		int random = (int)(Math.random() * 10);
		int input = sc.nextInt();
		
		while (input != random) { //判斷數字
			System.out.println("猜錯了><!");
			input = sc.nextInt();
		}
		System.out.println("答對了^^!");
	}
}
