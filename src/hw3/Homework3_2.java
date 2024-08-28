package hw3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧");

		int Num = (int) (Math.random() * 9);
//		System.out.println(Num);
		int GuessNum = sc.nextInt();

		while (GuessNum != Num) {
			System.out.println("猜錯囉");
			GuessNum = sc.nextInt();
		}
		System.out.println("答對了！答案就是" + Num);
	}

}
