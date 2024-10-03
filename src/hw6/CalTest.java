package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		try {
			System.out.println("請輸入x的值");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();

			System.out.println("請輸入y的值");
			Scanner sc2 = new Scanner(System.in);
			int y = sc2.nextInt();

			System.out.println(x + "的" + y + "的次方是" + Calculator.powerXY(x, y));

		} catch (CalException ce) {
			System.err.println(ce.getMessage());
		} catch (InputMismatchException ie) {
			System.err.println("輸入格式不正確");
		}

	}
}
