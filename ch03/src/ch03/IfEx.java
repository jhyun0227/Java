package ch03;

public class IfEx {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		String str = "";
		if (i < 10) {
			str = "10 �̸��� ���Դϴ�.";
		} else if (i < 100) {
			str = "10�̻� 100�̸��� ���Դϴ�.";
		} else if (i < 1000) {
			str = "100�̻� 1000�̸��� ���Դϴ�.";
		} else if (i > 1000) {
			str = "1000�̻��� ���Դϴ�.";
		}
		System.out.println("���ڴ� " + i + "�̰� ���� ������ " + str);
	}
}