package hw5;

public class Homework5_3 {

	public static void main(String[] args) {
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		
		Homework5_3 w = new Homework5_3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

	public int maxElement(int[][] Array) {
		int maxNum=0;
		for(int i = 0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length;j++) {
				if(maxNum<Array[i][j]) {
					maxNum=Array[i][j];
				}
			}
		}
		
		return maxNum;
	}
	
	public double maxElement(double[][] Array) {
		double maxNum=0;
		for(int i = 0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length;j++) {
				if(maxNum<Array[i][j]) {
					maxNum=Array[i][j];
				}
			}
		}
		
		return maxNum;
	}

}
