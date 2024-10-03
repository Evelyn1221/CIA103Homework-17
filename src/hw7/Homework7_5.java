package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Homework7_5 {
	
	public static void main(String[] args) throws Exception{
		File file = new File ("c:\\data\\Object.ser");
		
		//輸入
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println(file.getName()+"檔案內容如下：");
		System.out.println("--------------------");
		try {
			while(true) {
				((Pets) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}

}
