package ch08;

public abstract class Car { // �߻�Ŭ����
	abstract void move(); // �߻�޼ҵ�
}

class Ambulance extends Car { // Ambulance�� �߻�Ŭ���� Car�� ��ӹ޾Ѵ�.
	@Override
	void move() { // �߻�޼ҵ�� �� �������̵� �Ǿ�� �Ѵ�.
		System.out.println("ȯ�ڸ� �ư� �����δ�.");
	}
}

class FireEngine extends Car { // ���ϵ���
	@Override
	void move() { // ���ϵ���
		System.out.println("���̷��� �︮�� �޸���.");
	}
}

class Bus extends Car { // ���ϵ���
	@Override
	void move() { // ���ϵ���
		System.out.println("�°��� �ư� �����δ�.");
	}
	
	void inwon() {
		System.out.println("������ 40���̾�.");
	}
}

