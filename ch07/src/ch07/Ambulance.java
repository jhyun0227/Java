package ch07;

public class Ambulance extends Car { // Car�� ��ӹ޾���
	// ������
	public Ambulance(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	
	// �޼ҵ�
	void printAm() {
		print();
		System.out.println("ȯ�ڸ� �¿�� ����.");
	}	
}
