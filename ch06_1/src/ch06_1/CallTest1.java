package ch06_1;
class E1 {
	// �������
	int x, y;
	
//  E1() { } <- ������ ����
	
	// �޼ҵ�
	void m1(int a1, int a2) {
		//���� 10�� ���� �� ���
		a1 += 10;
		a2 += 10;	
		System.out.println("x = " + a1);
		System.out.println("y = " + a2);
	}
	
	void m2(E1 e) {
		//e�� x, y�� 10���� �� ���
		e.x += 10;
		e.y += 10;
		System.out.println("e.x = " + e.x);
		System.out.println("e.y = " + e.y);
	}
}
public class CallTest1 {
	public static void main(String[] args) {
		int x = 8, y = 12;
		E1 e1 = new E1();
		//m1�� ȣ���ϰ� x, y ���
		e1.m1(x, y); // callByValue ���� �����ϹǷ� ������ ���� �ٸ� ������ �����Ѵ�.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		//E1 e��ü �����ϰ� ��ü�� x�� y�� 8�� 12�����ϰ�
		//e��ü�� x, y���
		e1.x = 8;
		e1.y = 12;
		e1.m2(e1); // callByReference�� �ּҸ� �����ϹǷ� �ּҿ� �ִ� ���� ���� ���� ����
		System.out.println("e1.x = " + e1.x);
		System.out.println("e1.y = " + e1.y);
	}
}
