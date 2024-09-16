package hw4;

public class Homework4_3 {
	public static void main(String[] args) {
		/*
		 * 有個字串陣列如下(八大行星)： {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,
		 * “uranus”, “neptune”} 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) (提示：字元比對，String方法)
		 */

		String[] stars = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int result = 0;

		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[i].length(); j++) {
				switch (stars[i].charAt(j)) {
				case 'a':
					result += 1;
					break;
				case 'e':
					result += 1;
					break;
				case 'i':
					result += 1;
					break;
				case 'o':
					result += 1;
					break;
				case 'u':
					result += 1;
					break;
				}
			}
		}
		System.out.println("這陣列裡面共有" + result + "個母音");

	}
}
