package ch05;

class Cal {
	int x = 0, y = 0; // �������, �������� Ŭ���� �ؿ� �ְ� ���� �޼��忡�� ��� ����
	
	// �޼ҵ�
	public void cal() {
		String title = "==================="; // �������� : �޼ҵ� ������ �����ϰ� �� �ȿ��� ���
		System.out.println(title);
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
	}
}

public class CalEx {  // �� �ҽ����� ���� Ŭ������ ����� ��� public�� �Ѱ����� ���
// main �޼ҵ尡 �ִ� ���� main�޼ҵ尡 �ִ� Ŭ������ public�� �����ϰ� Ŭ�������� �ҽ����ϸ�� �����ؾ���
	public static void main(String[] args) {
//		String str = "�����"; // ��������
//		x = 10; y = 4; �������� // ���๮(main)�� ���������� ����ϱ� ���ؼ��� ��ü�� �����ؾ���
		Cal c1 = new Cal(); c1.x = 10; c1.y = 4;
//		c1.title = "���";
		c1.cal();
	}
}
