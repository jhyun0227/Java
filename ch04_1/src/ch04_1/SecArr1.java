package ch04_1;

public class SecArr1 {
	public static void main(String[] args) {
		// 4행 3열
		int sum = 0;
		int[][] arr = {{1, 2, 3}, {3, 4, 6}, {23, 56, 67}, {12, 4, 6}};
		for (int i = 0; i < arr.length; i++) {
			for (int j= 0; j < arr[i].length; j++) { // 행안에 있는 열을 숫자
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			System.out.println("합 : " + sum);
			sum = 0;
		}
		System.out.println("======================================");
		// 확장형
		for (int[] ar : arr) {
			for (int a : ar) {	
				System.out.print(a + "\t");
				sum += a;
	        }
			System.out.println("합 : " + sum);
			sum = 0;
		}
	}
}
