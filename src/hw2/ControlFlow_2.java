package hw2;

public class ControlFlow_2 {
	public static void main(String[] args) {
		/* 阿文很熱衷大樂透 (1~49),但他不喜歡有4的數字,不論是個位數或是十位數。
		請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個? */
		int count = 0;
		for(int i = 1; i < 40 ; i++) {
			if (i == 4 || i == 14 || i == 24 || i == 34) {
				continue;
			}
			count++;
			System.out.print(i + " ");			
		}
		System.out.println();
		System.out.println("總共:" + count + "個");
		System.out.println("--------------");
		
		/* 請設計一隻Java程式,輸出結果為以下:
		1 2 3 4 5 6 7 8 9 10  
		1 2 3 4 5 6 7 8 9                 
		1 2 3 4 5 6 7 8
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1 */
		for( int i = 10; i >= 0; i--) {
			for( int j = 1; j<=i ; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();	
		}
		System.out.println("--------------");
		
		/* 請設計一隻Java程式,輸出結果為以下:
		A
		BB
		CCC
		DDDD
		EEEEE
		FFFFFF */
		
		for( int y = 0; y < 5; y++) {
			for(int x = 0; x<=y; x++) {
				System.out.print((char)(65 + y));
			}
			System.out.println();
		}				
	}
}
