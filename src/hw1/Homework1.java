package hw1;

public class Homework1 {
	public static void main(String[] args){
//		請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a=12, b=6;
		int sum=a+b;
		int multiply=a*b;
		System.out.println("12、6的和是："+sum);
		System.out.println("12、6的積是："+multiply);
		System.out.println("============================");
		
//		請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int c=200, d=12;
		int num1=c/d;
		int num2=c%d;
		System.out.println("200顆蛋="+num1+"打"+num2+"顆");
		System.out.println("============================");
	
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int min=60, hr=min*60, day=hr*24, total=256559;
		int e=total/day;
		int f=(total%day)/hr;
		int g=(total%hr)/min;
		int h=total%min;
		System.out.println("256559秒="+e+"天"+f+"時"+g+"分"+h+"秒");
		System.out.println("============================");
		
//		請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI=3.1415, i=5;
		int j=(int)(i*i*PI);
		int k=(int)((i+i)*PI);
		System.out.println("半徑為五的圓面積="+j);
		System.out.println("圓周長="+k);
		System.out.println("============================");
		
//		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢(用複利計算，公式請自行google)
//		FV ＝ PV×（1 ＋ R）n 次方  
//		期末本利和＝期初本金×（1＋利率）期數次方
		int principal=1500000;
		float rate=0.02f;
		int FV=(int)(principal*Math.pow((1+rate),10));
		System.out.println("本金加利息="+FV+"元");
		System.out.println("============================");

//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5+5); //算術運算，兩int整數相加
		System.out.println(5 + '5'); //用Unicode編碼十六進位'5'是十進位53，相加後是58
		System.out.println(5 + "5"); //int整數5跟字串5相接為55
		System.out.println("============================");
		
	}
	
}
