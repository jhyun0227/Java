package ch07;

public class Bus extends Car{
	// ������
	public Bus(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}

	// �޼ҵ�
	void printBus() {
		print();
		System.out.println("���� �մ��� �ư� ����Ѵ�.");
	}	
}
