package ch06;
class B1 {
	static void multiply(int x, int y) {
		System.out.printf("%d * %d = %d\n", x, y, x*y);
	}
}

public class Add1 {
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
	}
	
	static void minus(int x, int y) {
		System.out.printf("%d - %d = %d\n", x, y, x-y);
	}
	
	public static void main(String[] args) {
		Add1 a1 = new Add1();
		a1.add(10, 20); // main���� ����Ҷ��� �ݵ�� ��ü�� �����ϰ� ��� (�ν��Ͻ�)
		Add1.minus(12, 4);
		// ����Ϸ��� �޼ҵ尡 �ִ� Ŭ������� main(����)���� �ִ� Ŭ�������� ���� ��� ��������
		minus(17,6);	
		
		B1.multiply(12,7); // Ŭ���� ����
		//multiply(10,3) // ����Ϸ��� �޼ҵ尡 �ִ� Ŭ������� ���� �޼ҵ尡 �ִ� Ŭ�������� �޶� ����
	}
}
