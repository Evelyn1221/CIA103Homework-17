package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Homework7_2 {
//	請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
//	(請使用append功能讓每次執行結果都能被保存起來)

	public static void main(String args[]) throws IOException {
		try {
			// 當append=true，新增資料將附加於原始資料之後
			FileOutputStream fos = new FileOutputStream("c:\\javawork\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			int[] Array = new int[10];
			for (int i = 0; i < Array.length; i++) {
				Array[i] = (int) (Math.random() * 1000) + 1;
				ps.print(Array[i] + "  ");
			}
			ps.println();
//			ps.println("Hello World 世界你好 ! 天氣真好"); // 若檔案已存在，則內容會被新的內容覆蓋掉

			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
