package ch08;
class Over1 {
	void m1() { // �������̵�
		System.out.println("�� �θ� �޼���");
	}
}

class Over2 extends Over1 {
	void m1() { // �������̵�
		System.out.println("���� ������ �� �޼���");
	}
}

public class Over1Ex {
	public static void main(String[] args) {
		Over1 o1 = new Over1();
		Over1 o2 = new Over2();
		
		o1.m1();
		o2.m1();
	}
}
