package ch02;

public class Oper1 {
	public static void main(String[] args) {
		int i1 = 7, i2 = 5, i3 = 7; // �ʱⰪ
		int c1 = ((i1 + 2) * 3) % 6 + (i2++ + 2) * 2 + --i3;
		// 3 + 14 + 6
		
		System.out.println("i1 = " + i1); // 7
		System.out.println("i2 = " + i2); // 6
		System.out.println("i3 = " + i3); // 6
		System.out.println("c1 = " + c1); // 3 + 14 + 6
	}
}
