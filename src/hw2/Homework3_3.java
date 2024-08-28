package hw2;

import java.util.Scanner;

public class Homework3_3 {
	public static void main(String[] args) {
//		//3. 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數
		
		Scanner sc=new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		int HatedNum=sc.nextInt();
		System.out.println("以下是可以選的數字");
		
		int i=1,num=0;
		while(i<=7){
			int j=1;
			while(j<=7) {
				num+=1;
				j++;
				if(HatedNum==num) {
					continue;
				}
				if(num>=10&&num/10==HatedNum) {
					continue;
				}
				if(num%10==HatedNum) {
					continue;
				}
				
				System.out.print(num+"  ");
			}System.out.println();
			i++;
		}
		
		
		
	}
}
