package hw2;

public class Homework2_2 {
	public static void main(String[] args) {
//		7. 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		int a = 'A', b;
		for (b = 65; b<=70 ; b++) {
			for (a = 65; a<=b; a++) {
				System.out.print((char)b);
			}
			System.out.println();
		}

	}
}
