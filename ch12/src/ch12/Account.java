package ch12;

public class Account {
	// �ʵ�
	private int total;
	
	// ������
	public Account(int total) {
		this.total = total;
	}
	
	// �޼ҵ�
	// synchronized ���ÿ� �޼ҵ带 ����ϴ� ���� ����
	// synchronized�� �޼ҵ� �տ��� ����ϴ� ���
	synchronized void depoist(int amt, String name) {
		total += amt;
		System.out.println(name + "�Ա� : " + amt);
	}
	
	synchronized void withdraw(int amt, String name) {
		if (amt <= total) {
			total -= amt;
			System.out.println(name + "��� : " + amt);
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	
	void print() {
		System.out.println("�ܾ� : " + total);
	}
}
