package ch02;

public class OpSp3 {
	public static void main(String[] args) {
		long l1 = 1000000 * 1000000; // long 변수를 선언했지만 값 뒤에 L을 붙이지 않아 INT로 계산되어 쓰레기값이 나옴
		
		l1 = 1000000 * 1000000L;
		System.out.println("l1 = " + l1);
		
		// 곱한 결과가 int형 범위를 벗어났기 때문에 쓰레기 값이 되어버림 (연산 우선순위)
		int i1 = 1000000 * 1000000 / 1000000;
		System.out.println("i1 = " + i1);
		int i2 = 1000000 / 1000000 * 1000000;
		System.out.println("i2 = " + i2);
	}
}
