package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework7_1 {

	public static void main(String[] args) throws IOException {
		int i;
		try {

			File inputFile = new File("c:\\javawork\\Sample.txt");
			FileReader fr = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fr);

			String str;
			int chars = 0;
			int lines = 0;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
				chars += str.length();
				lines++;
			}

			System.out.println(
					"========================================================================================");
			System.out.print("Sample.txt檔案共有" + inputFile.length() + "個位元組，");
			System.out.print(chars + "個字元，");
			System.out.print(lines + "列資料");

			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
