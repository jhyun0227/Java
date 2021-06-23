package ch12;

public class AccountUser extends Thread {
	// �޼ҵ�
	boolean flag; // default false
	Account act;
	String name;

	// ������
	public AccountUser(Account act, String name) {
//		super(name); // Thread �̸�
		this.act = act;
		this.name = name;
	}

	// �޼ҵ�
	@Override
	public void run() {
		// �Աݰ� ����� ����� 5�� ����
		// false�� true�� ������ ���
		for (int i = 0; i < 5; i++) {
			int amt = (int) (Math.random() * 10000) + 1;
			if (flag) { // true �Ա�
				act.depoist(amt, name);
			} else { // false ���
				act.withdraw(amt, name);
			}	
			flag = !flag; // true�� false, false�� true
			act.print();
		}
	}
}