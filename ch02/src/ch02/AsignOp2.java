package ch02;

public class AsignOp2 {
	public static void main(String[] args) {
		int i1 = 8, i2 = 4;
		i1 += i2; // 8 + 4 = 12
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		i1 -= i2; // 12 - 4 = 8
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		i1 *= i2; // 8 * 4 = 32
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		i1 /= i2; // 32 / 4 = 8
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		i1 %= i2; // 8 % 4 = 0
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		
	}
}
