package ch07;

public class FireEngine extends Car {
	// ������
	public FireEngine(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}

	// �޼ҵ�
	void printFe() {
		print();
		System.out.println("���� ���� ���� �⵿�Ѵ�.");
	}	
}
