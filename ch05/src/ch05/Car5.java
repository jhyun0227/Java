package ch05;

public class Car5 {
	// �������
	String carNO; // ������ȣ
	int inTime;   // �����ð�
	int outTime;  // �����ð�
	int fee;	  // �������
	final int moneyPerHour = 5000; // �ð��� ��� final�� ���� ������
	
	// ������
	Car5(String carNo, int inTime, int outTime) {
		this.carNO = carNo; this.inTime = inTime; this.outTime = outTime; 
	}
	
	// �޼���
	void carFee() {
		fee = (outTime - inTime) * moneyPerHour;
	}
	
	void print() {
		System.out.println("=====================");
		System.out.println("������ȣ : " + carNO);
		System.out.println("�����ð� : " + inTime);
		System.out.println("�����ð� : " + outTime);
		System.out.println("������� : " + fee);
	}
}
