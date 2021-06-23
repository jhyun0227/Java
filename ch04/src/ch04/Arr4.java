package ch04;

public class Arr4 {
	public static void main(String[] args) {
		int[] a = {34, 78, 99, 56, 66}; // 정수 배열 5개를 생성하고 값 대입 /선언과 대입을 함께 함
		// int[] a = new int[] {34, 78, 99, 56, 66};
		// 기본형 for
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("===========================");
		// 확장형 for / 배열에서 하나씩 추출하여 변수에 넣고 변수 값을 출력
		for (int i : a) {
			System.out.println(i);
		}
	}
}
