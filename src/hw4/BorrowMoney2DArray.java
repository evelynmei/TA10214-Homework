package hw4;

import java.util.Scanner;

/*
* 阿文要向同事借錢,共有5個員工編號與身上現金列表如下: 
* 員工編號 25   32  8   19   27 
* 身上現金 2500 800 500 1000 1200
* 設計一個程式,可輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他; 
* 並統計有錢可借的總人數:例如輸入1000就顯示「有錢可借的員工編號: 25 19 27共3人!」
*/
public class BorrowMoney2DArray {
	public static void main(String[] args) {
		int[][] lendersArr = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.println("請輸入要借的金額: ");
		Scanner sc = new Scanner(System.in);
		int borrowAmount = sc.nextInt();
		System.out.println("有錢可借的員工編號：");
		int count = 0;
		for (int i = 0; i < lendersArr.length; i++) {
			if (borrowAmount <= lendersArr[i][1]) {
				System.out.print(lendersArr[i][0] + " "); 
				count++;
			}
		}
		System.out.println("共" + count + "人");
	}
}
