package ch02;

public class OpSp1 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		//byte b3 = b1 + b2 연산시에는 데이터값이 디폴트로값(INT)으로 바뀜
		byte b3 = (byte) (b1 + b2);
		int b4 = b1 + b2;
		
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		
		long l1 = 30;
		int i1 = 20;
		// int i2 = l1 + i2 만약 int보다 범위가 넓은 long이 오는 경우 데이터값은 long으로 바뀜
		int i2 = (int)(l1 + i1);
		long l2 = l1 + i1; // long + int => long + long => long
		
		System.out.println("i2 = " + i2);
		System.out.println("l2 = " + l2);
	}
}
