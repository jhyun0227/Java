package ch05;

public class Final {
	public static void main(String[] args) {
		// final�� �ִ� ������ �빮�ڷ� ǥ���Ͽ� �˸�
		// final �� �ִ� ���� ���� �Ұ�
		final float PI = 3.14f; // PI = 3.141592;
		int r = 10;
		r = 20; // final ��� r �� 20�� ���� ����
		System.out.println("�������� " + r + "�� ���� ���� : " + r*r*PI);
	}
}
