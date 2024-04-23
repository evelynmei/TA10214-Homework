package module_practice;

public class TestNineNine {
	public static void main(String[] args) {
		//輸出九九乘法表
		
		// for + while loop
		int i = 1;
		while (i <= 9) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
			i++;
		}
		System.out.println("=================");

		// for + do while loop
		int a = 1;
		do {
			for (int b = 1; b <= 9; b++) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
			}
			System.out.println();
			a++;
		} while (a <= 9);
		System.out.println("=================");

		// while + do while loop
		int x = 1;
		while (x <= 9) {
			int y = 1;
			do {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
				y++;
			} while (y <= 9);
			System.out.println();
			x++;
		}
		
	}
}
