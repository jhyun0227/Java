package ch05;

public class Account {
	// �������, �ʵ�, �Ӽ�
	String accountNo; // ���¹�ȣ
	String name;	// ������
	int balance;	// �ܾ�
	
	// ������
	public Account(String acNo, String na, int bal) {
		accountNo =  acNo; name = na; balance = bal;
	}
	
	// �޼ҵ�
	void deposit(int money) { // ����
		balance += money;
		System.out.println(name + "�Ա� : " + money);
	}
	
	void withdraw(int money) { // ���
		if (balance >= money) { // �ܾ��� ��� �ݾ׺��� Ŀ����
			balance -= money;
			System.out.println(name + "��� : " + money);
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	
	void disp() {
		System.out.println("=== ���¹�ȣ ===" + accountNo);
		System.out.println("������ : " + name);
		System.out.println("�ܾ� : " + balance);
	}
}
