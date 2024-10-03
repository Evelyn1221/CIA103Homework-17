package hw5;

import java.util.Random;

public class Homework5_5 {
	public static void genAuthCode() {
//		身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//		genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//		與數字的亂數組合，如圖：

//		String[] Array= new String[8];

		// ASCII數字48~57代表數字0~9
		// ASCII數字65~90代表A~Z
		// ASCII數字97~122 代表a~z

		int[] Array = new int[62];
		for (int i = 0; i < Array.length; i++) {
			if (i <= 9) {
				Array[i] = 48 + i;
			} else if (9 < i && i <= 35) {
				Array[i] = 55 + i;
			} else {
				Array[i] = 61 + i;
			}
//			System.out.println(Array[i]);
		}

		System.out.print("本次隨機產生驗證碼為 ");
		int[] Array2 = new int[8];
		Random r = new Random();
		for (int i = 0; i < Array2.length; i++) {
			Array2[i] = Array[r.nextInt(62)];
			System.out.print((char) Array2[i]);
		}

	}

	public static void main(String[] args) {
		genAuthCode();
	}
}
