package hw4;

public class PlanetsStringArray {
	public static void main(String[] args) {
		/*
		 * 有個字串陣列如下 (八大行星): {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,
		 * “uranus”, “neptune”} 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		 */
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		
		int count = 0;
		for (int i = 0; i < planets.length; i++) { // 行星string array的y軸
			for (int j = 0; j < planets[i].length(); j++) { // 行星string array的x軸 
				for (int k = 0; k < vowels.length; k++) { //取出母音char array中所有的char
					if (vowels[k] == planets[i].charAt(j)) { //母音第k個char == 行星第i個String的第j個char
						count++;
					}
				}
			}
		}
		System.out.println("共有" + count + "個母音");
	}
}
