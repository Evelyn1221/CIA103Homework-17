package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework7_3 {
//	請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案
	public static void copyFile(String srcFile, String dtFile) {
		try {
			File f1 = new File(srcFile);
			File f2 = new File(dtFile);

			FileInputStream in = new FileInputStream(f1);
			FileOutputStream out = new FileOutputStream(f2);

			int c;
			byte[] buffer = new byte[1024];

			// 從來源檔案讀取資料至緩衝區
			while ((c = in.read(buffer)) != -1) {
				out.write(buffer, 0, c); // 將陣列資料寫入目的檔案
			}
			
			out.close();
			in.close();
			System.out.println("檔案複製成功");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		copyFile("Class FileOutputStream.txt", "Class FileOutputStream2.txt");
	}

}
