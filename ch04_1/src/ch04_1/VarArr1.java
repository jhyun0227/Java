package ch04_1;

public class VarArr1 {
	public static void main(String[] args) {
		int[][] score = {{67, 89, 98, 88}, {56, 78}, {67, 88, 99}, {34, 67, 78, 99, 100}};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.println("ÇÕ°è´Â " + sum);
			sum = 0;	
		}
	}
}
