package ch02;

public class OpSp1 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		//byte b3 = b1 + b2 ����ÿ��� �����Ͱ��� ����Ʈ�ΰ�(INT)���� �ٲ�
		byte b3 = (byte) (b1 + b2);
		int b4 = b1 + b2;
		
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		
		long l1 = 30;
		int i1 = 20;
		// int i2 = l1 + i2 ���� int���� ������ ���� long�� ���� ��� �����Ͱ��� long���� �ٲ�
		int i2 = (int)(l1 + i1);
		long l2 = l1 + i1; // long + int => long + long => long
		
		System.out.println("i2 = " + i2);
		System.out.println("l2 = " + l2);
	}
}
