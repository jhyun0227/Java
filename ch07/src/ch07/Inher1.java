package ch07;
// ����� �ϸ� �θ� �����ؼ� �ڵ尣��
// ��������� �޼��带 �ڱ� ��ó�� ���
class A {
	// �ʵ�(�������)
	int a = 10;
	
	// �޼ҵ�
	void m1() {
		System.out.println("�� �θ� �޼���");
	}
}

class A1 extends A { // �ڽ�Ŭ���� extends �θ�Ŭ���� = ���
	// �ʵ�(�������)
	int a1 = 17;
	
	// �޼ҵ�
	void m2() {
		System.out.println("�� �ڽ� �޼��� a1");
	}
}

class A2 extends A {
	// �ʵ�(�������)
	int a2 = 27;
	
	// �޼ҵ�
	void m3() {
		System.out.println("�� �ڽ� �޼��� a2");
	}
}

public class Inher1 {
	public static void main(String[] args) {
		A1 a1 = new A1(); A2 a2 = new A2();
		System.out.println("a = " + a1.a);
		System.out.println("a1 = " + a1.a1);
		a1.m1(); a1.m2();
		System.out.println("a = " + a2.a);
		System.out.println("a2 = " + a2.a2);
		a2.m1(); a2.m3();
	}
}
