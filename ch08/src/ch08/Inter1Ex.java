package ch08;
interface A1 { // �߻�Ŭ������ ��ü�� ������ �� ����. (�޼ҵ尡 �߻�޼ҵ� �̱⋚���� �߻�Ŭ������ ��)
	int K = 7; // ������� 'public static final'�� ���� ��� ���̳� ����
	
	void m1(); // ��� �޼��� 'public abstract'�� ���� ��� �߻�޼ҵ�
	void m2();
}

class A2 implements A1 { // �Ϲݻ���� extedns, �������̽��� implements �����ϴ�
	public void m1() { // �������̵�
		System.out.println("�Ϳ� �ݿ����̴�.");
	}
	public void m2() { // �������̵�
		System.out.println("��ǽð��� ���� ���������");
	}
}

public class Inter1Ex {
	public static void main(String[] args) {
		A1 a1 = new A2(); // ������ �ȵ����� ������ ����
		A2 a2 = new A2();
		a1.m1(); a2.m2();
//		a1.K = 12; �������, �߻�Ŭ������ ������ static final
		System.out.println("K = " + a1.K);
		System.out.println("K = " + A1.K);
	}
}
