package ch08;
interface B1 { // �߻�Ŭ����
	int K1 = 10; // �ʵ�(�������)�� public static final ����
	
	void m1(); // �߻�޼ҵ� �������̵� �ʼ�
}

interface B2 extends B1 { // �������̽������� implement�� �ƴϰ� extends�� ����Ѵ�.
	void m2();
}

interface B3 extends B1 { // �������̽������� implement�� �ƴϰ� extends�� ����Ѵ�.
	void m3();
}

interface B4 extends B2, B3 { // �������̽��� ���߻���� ����
	void m4();	
}

class B5 implements B4 {  // ����ϱ� ���ؼ��� Ŭ������ �����ؾ� ��� ����
	public void m1() {  // �������̵�
		System.out.println("��Ǹ��");
	}
	public void m2() { // �������̵�
		System.out.println("�̰ǹ���");
	}
	public void m3() {  // �������̵�
		System.out.println("�㰢, ���, ���");	
	}
	public void m4() {  // �������̵�
		System.out.println("�ֺҷ�, ��ҷ�, ������");
	}	
}

public class Inter2 {
	public static void main(String[] args) {
		B5 b5 = new B5();
		b5.m1(); b5.m2(); b5.m3(); b5.m4();
		System.out.println("K = " + b5.K1);
		System.out.println("K = " + B5.K1);
	}
}
