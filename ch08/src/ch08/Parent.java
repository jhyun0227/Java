package ch08;
// class ���� �տ� final�� ���̸� ����� �� ����. final Ŭ����
public /*final*/ class Parent {
	int a = 7;
	/*final*/ int B = 8;
	
	void m1() {
		a = 10;
// final�� �ִ� ������ ����̰� ������ �� ����. line 5		
		B = 20;
		System.out.println("���");
	}
	/*final*/ void m2() {
		System.out.println("�� final");
	}
}


class child extends Parent {
	void m1() {
		System.out.println("������ ���");
	}

	//	final�� �ִ� �޼���� �����ǰ� �Ұ� line 7
	void m2() {
		System.out.println("������ �ȵ�");
	}	
}