package ch08;

interface C1 { // �߻�Ŭ���� ��ü ���� �Ұ�
	String str = "�Ϳ� ������ �ð��̴�"; // �������̽� ���� public static final ����

	void c1(); // �߻�Ŭ���� �������̵� �ʼ�
}

interface C2 extends C1 { // �������̽��� �������̽��� ��� �߻�Ŭ����
	void c2();
}

interface C3 extends C2 { // �������̽��� �������̽��� ��� �߻�Ŭ����
	void c3();
}

class C4 implements C3 {
	public void c1() { // �������̵�
		System.out.println("�����");
	}

	public void c2() { // �������̵�
		System.out.println("�ǵ���");
	}

	public void c3() { // �������̵�
		System.out.println("��ī������");
	}

	public void c4() {
		System.out.println("�����");
	}
}

public class Inter3 {
	public static void main(String[] args) {
		C4 c4 = new C4();
		c4.c1();
		c4.c2();
		c4.c3();
		c4.c4();
		System.out.println(c4.str); // ������ static�̱� ������ ����������.������� ��� Ŭ����.������� ����ϴ� ���� ����
		System.out.println(C4.str);
	}
}
