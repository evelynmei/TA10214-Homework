package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) throws CalException {

        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("請輸入X的值");
                int x = sc.nextInt();
                System.out.println("請輸入Y的值");
                int y = sc.nextInt();
                System.out.println(c.powerXY(x, y));
                break;
            } catch (CalException e1) {
                System.out.println(e1.getMessage());
            } catch (Exception e) {
                System.out.println("輸入格式不正確");
            }
        }
    }
}