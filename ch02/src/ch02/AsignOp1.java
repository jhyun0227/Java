package ch02;

public class AsignOp1 {
	public static void main(String[] args) {
		int i1 = 10;
		System.out.println("i1 = " + i1);
		i1 += 4; // 10 + 4 = 14
		System.out.println("i1 = " + i1);
		i1 -= 3; // 14 - 3 = 11
		System.out.println("i1 = " + i1);
		i1 *= 2; // 11 * 2 = 22
		System.out.println("i1 = " + i1);
		i1 /= 2; // 22 / 2 = 11
		System.out.println("i1 = " + i1);
		i1 %= 5; // 11 % 5 = 1
		System.out.println("i1 = " + i1);
	}
}