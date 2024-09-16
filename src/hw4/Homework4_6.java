package hw4;

import java.util.Arrays;

public class Homework4_6 {
	public static void main(String[] args) {
		//請算出每位同學考最高分的次數
		
		int[][] test = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{47, 75, 77, 89, 64, 75, 70, 95},
				{100, 75, 77, 89, 64, 75, 70, 95},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90,},
				{90, 80, 100, 75, 50, 20, 99, 75}
		};
		
		int[] student = new int[8];
		int stu=0;
		
		for(int i = 0 ; i<6 ; i++) {
			int sc = 0;
			for(int j = 0 ; j<8 ; j++) {
				if(test[i][j]>sc) {
					sc = test[i][j];
					stu = j;
					
				} 
			}
			if(stu!=-1) {
				student[stu]++;
			}
		}
		
		for (int i = 0; i<student.length;i++) {
			System.out.println(i+1+"號同學考最高分的次數"+student[i]);
		}
		
		
	}

}
