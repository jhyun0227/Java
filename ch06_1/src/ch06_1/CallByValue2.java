package ch06_1;
class A2 {
	public void m1(int x, int y) {
		// ������ ��ȯ 
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}	
}

public class CallByValue2 {
	public static void main(String[] args) {
		A2 a1 = new A2();
		int x =  10, y = 20; // �����Ͱ� �⺻���� ���
		a1.m1(x, y); // a1.m1(10, 20); ���� x y�� ������ ���� �ƴ϶� ���� �����Ѱ�
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
