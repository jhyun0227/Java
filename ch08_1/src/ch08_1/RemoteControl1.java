package ch08_1;

public interface RemoteControl1 {
	// ���
	// ����� �빮�� �� ����, �������̽��� ������ public static final�� ����
	int MAX_VOUME = 10; // ������ �빮�� �� ����, �������̽��� ������ public static final�� ����
	int MIN_VOUME = 0;
	
	// �߻�޼ҵ�
	//public abstract ����
	void turnOn();
	void turnOff();
	
	// ����Ʈ�޼ҵ�
	// ����Ʈ �޼��� ����θ� ���� �� �ִ�.
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� ���� �մϴ�.");
		}
	}
	
	// ����(static)�޼ҵ�
	// �����޼��嵵 ����θ� ���� �� �ִ�.
	static void changeBattery() {
		System.out.println("�������� ��ȯ �մϴ�.");
	}
}
