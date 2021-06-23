package ch02;

public class Mono2 {
	public static void main(String[] args) {
		int a1 = 5, a2 = 5; // 초기화
		int c1 = ++a1 * 3 + (a2-- + 2) * 3; // a1 a2는 초기값에서 변화되어 6,4라는 값이 나온다
		// c1 = 6 * 3 + (5 + 2) * 3
		// 위의 계산이 종료된 후에 a2값이 감소
		System.out.println("a1 = " + a1); 
		System.out.println("a2 = " + a2);
		System.out.println("c1 = " + c1);
	}
}