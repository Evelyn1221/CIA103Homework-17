package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Homework7_4 {
//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//	注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String[] args) throws Exception {

		try {
			
			File dir = new File("C:\\data");
			if(!dir.exists()) {
				dir.mkdirs();
			}
			File file = new File("C:\\data\\Object.ser");

			
			Dog d1 = new Dog("Bob");
			Dog d2 = new Dog("Sam");
			Cat c1 = new Cat("Mimi");
			Cat c2 = new Cat("Kiki");
			
			Object[] Pets = new Object[4];
			Pets[0] = d1;
			Pets[1] = d2;
			Pets[2] = c1;
			Pets[3] = c2;
		
			//輸出
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(int i = 0; i < Pets.length; i++) {
				oos.writeObject(Pets[i]);
			}
			oos.close();
			fos.close();
			
			
		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
