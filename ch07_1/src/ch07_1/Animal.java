package ch07_1;

public class Animal {
	// �ʵ�(�������) 
	int x = 7;
	
	// �޼ҵ�(�������̵�)
	void move() {
		System.out.println("�����δ�.");
	}
}

class Pig extends Animal {
	// �ʵ�(�������)
	int x = 10;
	
	// �޼ҵ�(�������̵�)
	void move() {
		System.out.println("�� �߷� �����δ�.");
	}
}

class Bird extends Animal {
	// �޼ҵ�(�������̵�)
	void move() {
		System.out.println("������ ������.");
	}
	
	void eat() {
		System.out.println("�θ��� �ɾ� �Դ´�.");
	}
}

class Fish extends Animal {
	// �޼ҵ�(�������̵�)
	void move() {
		System.out.println("�������̷� ���ģ��.");
	}
}