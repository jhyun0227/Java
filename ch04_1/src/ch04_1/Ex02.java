package ch04_1;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		// 기본형
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계는 " + sum);
		sum = 0;
		
		// 확장형
		for (int ar : arr) {
			System.out.print(ar +"\t");
			sum += ar;
		}
		System.out.println("합계는 " + sum);
	}
}
