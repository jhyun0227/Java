package ch06_1;
class A1 {
	public void m1(int a, int b) {
		a += 7; // ���޵� ���� ������ ������ ���� ����
		b += 7;
		System.out.println("x = " + a);
		System.out.println("y = " + b);
	}	
}

public class CallByValue1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		int x =  10, y = 20; // �����Ͱ� �⺻���� ���
		a1.m1(x, y); // a1.m1(10, 20); ���� x y�� ������ ���� �ƴ϶� ���� �����Ѱ�
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

// �����Ͱ� �⺻���� ��� ���� ������ �����ϴ°��� �ƴ϶� ������ ������ �����ϴ� ��