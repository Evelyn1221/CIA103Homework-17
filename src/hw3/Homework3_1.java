package hw3;

import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Imput a numeber");
//		int data = sc.nextInt();
//		int data1 = sc.nextInt();
//		System.out.println(data+data1);

		// 1. 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入3個的數字");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("不是三角形");
		} else if (a + b < c || a + c < b || b + c < a) {
			System.out.println("不是三角形");
		} else if (a == b && a == c && b == c) {
			System.out.println("正三角形");
		} else if (a == b || a == c || b == c) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}
	}
}
