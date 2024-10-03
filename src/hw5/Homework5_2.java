package hw5;

public class Homework5_2 {
	// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
	public static void randAvg() {
		int[] random = new int[10];

		System.out.println("本次亂數結果：");
		for (int i = 0; i < random.length; i++) {
			int num = (int) (Math.random() * 100);
			random[i] = num;
			System.out.print(random[i] + "  ");
		}

		int total = 0;
		for (int i = 0; i < random.length; i++) {

			total += random[i];

		}
		System.out.println("\n平均值：");
		System.out.println(total / 10);

	}

	public static void main(String[] args) {
		randAvg();

	}
}
