package ch08_1;

public class RemoteControl1Ex {
	public static void main(String[] args) {
		RemoteControl1[] rc = new RemoteControl1[2];
		rc[0] = new TV1();
		rc[1] = new Radio1();
		
		for (int i = 0; i < rc.length; i++) {
			rc[i].turnOn(); // �߻�޼ҵ� ������ ���
			rc[i].turnOff(); // �߻�޼ҵ� ������ ���
			rc[i].setMute(false); // ����Ʈ�޼ҵ� ������ ��� x
			RemoteControl1.changeBattery(); // �����޼ҵ� ������ ��� x
			System.out.println("�ִ뺼�� : " + RemoteControl1.MAX_VOUME);
			System.out.println("�ּҺ��� : " + RemoteControl1.MIN_VOUME);
		}
	}
}
