package ch02;

public class OpSp2 {
	public static void main(String[] args) {
		int i1 = 1000000, i2 = 2000000;
		long l1 = i1 * i2;  // int * int => int�̹Ƿ� ������ ���� �� ���¸� long�� ����
		l1 = (long)i1 * i2; // long * int => long * long => long
		System.out.println("l1 = " + l1);
	}
}
