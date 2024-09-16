package hw4;

import java.util.Scanner;

public class Homework4_4 {
	public static void main(String[] args) {
		/*
		 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列 表如下：
		 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事 有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
		 * 員工編號: 25 19 27 共3 人!」
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("小華請輸入欲借的金額？");
		int money=sc.nextInt();
		
		int sum = 0;

		int[][] Array = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		System.out.print("有錢可借的員工編號: ");
		for (int j = 0; j < Array[1].length; j++) {
			if (Array[1][j] > money) {
				System.out.print(Array[0][j]+"  ");
				sum+=1;
			}
		} System.out.print("共 "+sum+" 人");
		

	}

}
