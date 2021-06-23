package ch12;

public class AccountUser2 extends Thread {
	// �޼ҵ�
	boolean flag; // default false
	Account2 act;
	String name;

	// ������
	public AccountUser2(Account2 act, String name) {
		this.act = act;
		this.name = name;
	}

	// �޼ҵ�
	@Override
	public void run() {
		// �Աݰ� ����� ����� 5�� ����
		// false�� true�� ������ ���
		for (int i = 0; i < 5; i++) {
			// synchronized�� ��ü �տ��� ����ϴ� ���
			// ���¸� ���ÿ� ����ϴ� ���� ����
			synchronized (act) {
				int amt = (int) (Math.random() * 10000) + 1;
				if (flag) { // true �Ա�
					act.depoist(amt, name);
				} else { // false ���
					act.withdraw(amt, name);
				}
			}
			flag = !flag; // true�� false, false�� true
			act.print();
		}
	}
}