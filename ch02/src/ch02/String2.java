package ch02;

public class String2 {
	public static void main(String[] args) {
		String s1 = "�ȳ�";
		int age = 2021 - 1990 - 1;
		System.out.println("s1 = " + s1);
		System.out.println("age = " + age);
		System.out.println(s1 + age); // ���� + ���� ������ �ϸ� ���ڰ� ���ڷ� ����Ǿ� �ڿ� ����
		
		System.out.println("�ȳ�" + 2+0+2+1); // �� ���ں��� ���ʷ� ���ڷ� �����Ͽ� ����
		System.out.println(2+0+2+1 + "�ȳ�"); // ���� �Ŀ� ���ڷ� ����Ǿ� ����
		System.out.println("" + 2+0+2+1 + "�ȳ�"); // ���ڿ� + ������ ��� ���ڰ� ���ڿ��� ����
	}
}
