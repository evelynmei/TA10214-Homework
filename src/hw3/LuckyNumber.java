package hw3;

import java.util.Scanner;

public class LuckyNumber {
	/*
	 * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
	 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇 的號碼與總數
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入不想要的數字(1~9): ");
		int input = sc.nextInt();

		//
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i != input && i / 10 != input && i != input + 10 && i != input + 20 && i != input + 30
					&& i != input + 40) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共:" + count + "個");
	}
}
