package ch02;

public class Mono1 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 5;
		int i3 = ++i1; // i1�� 1 ������ �Ŀ� i3�� ����
		int i4 = i2++; // i4�� ������ �Ŀ� i2�� 1 ����
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
	}
}
