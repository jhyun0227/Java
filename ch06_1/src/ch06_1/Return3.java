package ch06_1;

public class Return3 {
	public static void main(String[] args) {
		String[] name = {"����", "����", "��", "����"};
		for (String n : name) {
			String msg = Return3.call(n);  // ������ �ִ� Ŭ������� �޼ҵ尡 �ִ� �޼ҵ���� ���⶧���� Return3�� ������ ����
			System.out.println(msg);
		}
	}
	
	private static String call (String name) {
		return name + "�� �ȳ��ϼ���";
	}
}
