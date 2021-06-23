package ch04;

public class Arr3 {
	public static void main(String[] args) {
		// 정수 배열 arr(배열명) 5개 생성
		// 각각 1~10 사이의 random한 숫자를 넣고 출력
		int[] arr = new int[5]; // 배열명 arr 데이터 값이 5개인 배열을 선언함
		
		// 데이터 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
		// 데이터 출력, 기본 for
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr{" + i + "] = " + arr[i]);
		}
		
		System.out.println("=========================");
		// 확장 for, 참조형에서 사용
		for (int i : arr/*배열명*/) {
			System.out.println(i);
		}
	}
}
