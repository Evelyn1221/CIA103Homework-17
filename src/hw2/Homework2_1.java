package hw2;

public class Homework2_1 {
	public static void main(String[] args) {
//		1. 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum1 = 0, count=2;
		while (count <= 1000) {
			sum1 += count;
			count+=2;
		}
		System.out.println("1～1000的偶數和是"+sum1);
		System.out.println("============================");
		
//		2. 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int a=1;
		for(int b=1;b<=10;b++) {
			a=a*b;
		}
		System.out.println("1～10的連乘積是"+a);
		System.out.println("============================");
		
//		3. 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int c=1, d=1;
		while(d<=10) {
			c=c*d;
			d++;
		}
		System.out.println("1～10的連乘積是"+c);
		System.out.println("============================");
		
//		4. 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		int e=0, f=1;
		while(e<100) {
			e=e+f;
			System.out.println(e);
			f+=2;
		}
		System.out.println("============================");
		
//		5. 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int g;
		for(g=1;g<=39;g++) {
			switch(g) {
			case 4:
				break;
			case 14:
				break;
			case 24:
				break;
			case 34:
				break;

			default:
				System.out.print(g+"  ");
				
			}

		}
		System.out.println();
		System.out.println("============================");
		
//		6. 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int i;
		for (i = 10; i > 0; i--) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			
		}
		System.out.println("============================");
		

		


	
	}
}
