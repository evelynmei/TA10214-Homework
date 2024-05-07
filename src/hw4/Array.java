package hw4;

public class Array {
	public static void main(String[] args) {

		/*
		 * 有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		 */
		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		int avg;

		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];

		}
		avg = sum / intArray.length;
		System.out.println("平均值: " + avg);
		System.out.print("大於平均值的元素: ");
		for (int i = 0; i < intArray.length; i++) {
			if (avg < intArray[i]) {
				System.out.print(intArray[i] + " ");
			}

		}

	}

}
