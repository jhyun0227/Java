package ch02;

public class OpSp2 {
	public static void main(String[] args) {
		int i1 = 1000000, i2 = 2000000;
		long l1 = i1 * i2;  // int * int => int이므로 쓰레기 값이 된 상태를 long에 대입
		l1 = (long)i1 * i2; // long * int => long * long => long
		System.out.println("l1 = " + l1);
	}
}
