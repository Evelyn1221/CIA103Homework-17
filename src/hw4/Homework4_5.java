package hw4;

import java.util.Scanner;

public class Homework4_5 {
	public static void main(String[] args) {
		/*
		 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天 例：輸入1984 9 8
		 * 三個號碼後，程式會顯示「輸入的日期為該年第252天」 (提示1：Scanner，陣列) (提示2：需將閏年條件加入)
		 * (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入yyyy年");
		int year = sc.nextInt();
		System.out.println("請輸入mm月");
		int month = sc.nextInt();
		System.out.println("請輸入dd日");
		int day = sc.nextInt();

		int[] date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			sum += 1;
		}

		if (month > 2) {
			for (int i = 0; i < month - 1; i++) {
				sum += date[i];
			}
			sum += day;
			System.out.println("輸入的日期為該年第" + sum + "天");

		} else if (month == 1) {
			sum += day;
			System.out.println("輸入的日期為該年第" + sum + "天");
		}

		if (month == 2 && day <= 29) {
			for (int i = 0; i < month - 1; i++) {
				sum += date[i];
			}
			sum += day;
			System.out.println("輸入的日期為該年第" + sum + "天");
		} else if (month == 2 && day > 29) {
			System.out.println("2月份日期不該超過29，請重新輸入");
		}

	}
}
