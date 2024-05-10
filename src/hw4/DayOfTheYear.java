package hw4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
// 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
// (提示1：Scanner，陣列) (提示2：需將閏年條件加入) (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
public class DayOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入西元年(yyyy): ");
        int yyyy = sc.nextInt();
        System.out.println("月份(1-12): ");
        int mm = sc.nextInt();
        System.out.println("日期(1-31): ");
        int dd = sc.nextInt();

        //每月的天數(非閏年)
        int[] dayPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean isInputAvailable = true;
        //檢查年份是否有效
        if (yyyy < 1 || yyyy > 10000) {
            System.out.println("無效的年份");
            isInputAvailable = false;
        }
        //判斷閏年, 二月要多一天
        if (yyyy % 4 == 0) {
            dayPerMonth[1] = 29;
        }
        //檢查月份是否有效
        if (mm < 1 || mm > 12) {
            System.out.println("無效的月份");
            isInputAvailable = false;
        }
        //檢查日期是否有效
        if (dd < 1 || dd > dayPerMonth[mm - 1]) {
            System.out.println("無效的日期");
            isInputAvailable = false;
        }
        int sum = dd;
        for (int i = 1; i < mm; i++) {
            sum += dayPerMonth[i - 1];
        }
        if (isInputAvailable) {
            System.out.println("輸入的日期為該年第" + sum + "天");
        }
    }
}
