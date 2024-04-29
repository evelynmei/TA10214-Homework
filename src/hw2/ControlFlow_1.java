package hw2;

public class ControlFlow_1 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("偶數和:" + sum);
		System.out.println("--------------");

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int product = 1;
		for (int count = 1; count <= 10; count++) {
			product *= count;
		}
		System.out.println("連乘積:" + product);
		System.out.println("--------------");

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int p = 1;
		int c = 1;
		while (c <= 10) {
			p *= c;
			c++;
		}
		System.out.println("連乘積:" + p);
		System.out.println("--------------");

		// 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		// 1^2 2^2 3^2 4^2...10^2
		int exponent = 2;
		for (int base = 1; base <= 10; base++) {
			System.out.print((int) Math.pow(base, exponent) + " ");
		}
	}
}
