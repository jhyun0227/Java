package ch02;

public class Cast1 {
	public static void mani(String[] args) {
		byte b1 = 25;
		int i1 = b1;  // byte < int 문제 없음
		
		int i2 = 70;
		// byte b2 = i2; // byte < int 문제 있음
		byte b2 = (byte)i2; // 앞에 바꿔줌
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
	}
}
