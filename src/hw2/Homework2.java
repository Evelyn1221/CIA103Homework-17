package hw2;

public class Homework2 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum1 = 0, count=2;
		while (count <= 1000) {
			sum1 += count;
			count+=2;
		}
		System.out.println("1～1000的偶數和是"+sum1);
		System.out.println("============================");
		
//		請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int a=1;
		for(int b=1;b<=10;b++) {
			a=a*b;
		}
		System.out.println("1～10的連乘積是"+a);
		System.out.println("============================");
		
//		請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int c=1, d=1;
		while(d<=10) {
			c=c*d;
			d++;
		}
		System.out.println("1～10的連乘積是"+c);
		System.out.println("============================");
		
//		請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		int e=0, f=1;
		while(e<100) {
			e=e+f;
			System.out.println(e);
			f+=2;
		}
		System.out.println("============================");



	
	}
}
