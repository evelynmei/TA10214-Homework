package hw1;

public class OP {
	public static void main(String[] args) {

		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int sum = 12 + 6;
		int product = 12 * 6;
		System.out.println("和:" + sum + '\n' + "積:" + product);
		System.out.println("===============");

		// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int num1 = 200 / 12;
		int num2 = 200 % 12;
		System.out.println(num1 + "打" + num2 + "顆");
		System.out.println("===============");

		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalS = 256559;
		int sPerDay = 24 * 60 * 60;
		int day = totalS / sPerDay;
		int leftS = totalS % sPerDay;
		int sPerHour = 60 * 60;
		int hour = leftS / sPerHour;
		int leftM = leftS % sPerHour;
		int sPerM = 60;
		int minute = leftM / sPerM;
		int second = leftM % sPerM;
		System.out.printf("%d天 %d時 %d分 %d秒%n", day, hour, minute, second);
		System.out.println("===============");

		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積(r^2*pi)與圓周長(2r*pi)
		final double PI = 3.1415;
		double area = 5 * 5 * PI;
		double circumference = 2 * 5 * PI;
		System.out.printf("圓面積:%.4f 圓周長:%.4f%n", area, circumference);
		System.out.println("===============");

		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
		// (用複利計算,公式: 本利和=本金*(1+利率)^期數
		int p = 1500000;
		int n = 10;
		double i = 0.02;
		double s = p * Math.pow(1 + i, n);
		System.out.println("本利和: " + Math.round(s));
		System.out.println("===============");

		/*
		 * 請寫一隻程式,利用System.out.println()印出以下三個運算式結果: 5 + 5, 5 + ‘5’, 5 + “5”
		 * 並請用註解各別說明答案的產生原因
		 */
		// 數學加法結果, 5+5=10
		System.out.println(5 + 5);
		// '5'為char, 但與前面的int 5相加時, 位元較小的char晉升為int, 在ASCII中char 5的int值為53, 故5+53=58
		System.out.println(5 + '5');
		// 串接相加, 結果為55
		System.out.println(5 + "5");
	}

}
