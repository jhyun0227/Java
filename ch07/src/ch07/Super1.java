package ch07;
class E1 {
	// �ʵ�(�������)
	int k = 7;
	
	// ������
	E1() {
		System.out.println("�Ű����� ���� �θ� ������");
	}
	E1(String str) {
		this();
		System.out.println("�Ű����� �ϳ� : " + str);
	}
}

class E2 extends E1 {
	// ������
	E2() { // 1Ȯ��, super(�Ű�����) ������ �Ű����� ������ ���������� �ش��ϴ� �θ� �����ڸ��� ���� (���� Ŭ����)\
		super("���"); // ������ default �����ڸ� ȣ��
		System.out.println("�Ű������� ���� �ڽ� ������");
	}
}

public class Super1 {
	public static void main(String[] args) {
		E2 e2 = new E2();
		System.out.println("k = " + e2.k);
	}
}
