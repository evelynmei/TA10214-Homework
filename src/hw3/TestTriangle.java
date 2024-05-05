package hw3;
import java.util.Scanner;
import java.util.Arrays;

/*請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、
等腰三角形、其它三角形或不是三角形*/
public class TestTriangle {

	public static void main(String[] args) {
		
		System.out.println("輸入三個正整數: ");
		Scanner sc = new Scanner(System.in);
		
		TestTriangle t = new TestTriangle();
		
		//宣告Array object, 將使用者輸入的數字指定給它
		int[] sideLength = new int[3];
		for( int i = 0; i < 3; i++) {
			sideLength[i] = sc.nextInt();
		}
		
		//將數字陣列由小至大排序
		Arrays.sort(sideLength);
		
		String answer = t.triangleJudgement(sideLength);
		System.out.println(answer);
	}
	//宣告判斷三角形的方法:	
	public String triangleJudgement(int[] sideLength) {
		
		if (sideLength[0] + sideLength[1] <= sideLength[2]) {
			return "不是三角形";
			
		} else if (sideLength[0] == sideLength[1] && sideLength[0] == sideLength[2]) {
			return "正三角形";
			
		} else if (sideLength[0] == sideLength[1]) {
			return "等腰三角形";
			
		} else if (Math.pow(sideLength[0], 2) + Math.pow(sideLength[1], 2) == Math.pow(sideLength[2], 2)) {
			return "直角三角形";
			
		} else
			return "其他三角形";
		
	}	
}
