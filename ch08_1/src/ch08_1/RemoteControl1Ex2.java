package ch08_1;

public class RemoteControl1Ex2 {
	public static void main(String[] args) {
		// Ŭ������ �������̽��� �������� �ʰ� �ٷ� main���� �߻�޼��带 �������ؼ� ��ü ���� ����
		// ��ü�� �����Ϸ��� ��ü��(��������, ���۷��� ������)
		// RemoteControl1Ex2$1 Ŭ������ ���� ��ü�� ������ ����
		// RemoteControl1Ex2$1�� ����Ŭ����
		RemoteControl1 rc1 = new RemoteControl1() {
			public void turnOn() {
				System.out.println("����Ŀ�� �մϴ�.");
			}
			public void turnOff( ) {
				System.out.println("����Ŀ�� ���ϴ�.");
			}
		}; // ��ü �����ϴ� ���� ����, �������� ������ �ٽ��ϴ°� �������̽��� ��ü������ �� �� ���⶧���� �����ڰ� ����
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setMute(true);
		RemoteControl1.changeBattery();
		
		// RemoteControl1Ex2$2�� ����Ŭ����
		RemoteControl1 rc2 = new RemoteControl1() {
			public void turnOn() {
				System.out.println("����Ŀ�� �մϴ�.");
			}
			public void turnOff( ) {
				System.out.println("����Ŀ�� ���ϴ�.");
			}
		}; // ��ü �����ϴ� ���� ����, �������� ������ �ٽ��ϴ°� �������̽��� ��ü������ �� �� ���⶧���� �����ڰ� ����
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setMute(true);
		RemoteControl1.changeBattery();
	}
}

// ���� ũ�� ����� ����
