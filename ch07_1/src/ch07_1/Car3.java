package ch07_1;

public class Car3 {
	// �ʵ�(�������)
	String color = "�Ķ�";
	
	// �޼ҵ�(�������̵�)
	void drive() {
		System.out.println("�޸��� �ų���");
	}
}

class FireEngine3 extends Car3 {
	// �ʵ�(�������)
	String color = "����";
	
	// �޼ҵ�
	// (�������̵�)
	void drive() {
		System.out.println("���� �ư� �޸���.");
	}
	void fire() {
		System.out.println("�� ���� ���� ����.");
	}
}

class Ambulance3 extends Car3 {
	// �ʵ�(�������)
	String color = "����";
	
	// �޼ҵ�(�������̵�)
	void drive() {
		System.out.println("ȯ�ڸ� �ư� �޸���.");
	}
}

class Bus3 extends Car3{
	// �޼ҵ�(�������̵�)
	void drive() {
		System.out.println("45����� �ư� �޸���.");
	}
}