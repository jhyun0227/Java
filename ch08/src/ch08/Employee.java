package ch08;

public class Employee {
	// �ʵ�(�������)
	public final double INCENTIVE_RATE = 0.1; // �μ�Ƽ��� 10% ����
	private String name;
	
	
	// ������
	public Employee() {}
	Employee(String name) {
		this.name = name;
	}
	
	// �޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	int computePay() { // �������̵� �� �޼ҵ�, ������ �ؼ� ����ض�
		return 0;
	}
	final int computrIncentive() { // ������ �Ұ�
		int result = 0;
		int pay = computePay();
		if (pay >= 100000) {
			result = (int)(pay * INCENTIVE_RATE);
		}
		return result;
	}
}
