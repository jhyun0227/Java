package ch09;

public class Convert {
	public static void main(String[] args) {
		String str1 = 4 + " "; // ���ڿ� ���� ���ڸ� �־ ���ڷ� ��������
		String str2 = String.valueOf(4); // ���ڸ� ���ڷ� ����
		
		String str3 = "123";
		int i1 = Integer.parseInt(str3); // ���ڿ��� ���ڷ� ����
		int i2 = Integer.valueOf(str3); // ���ڿ��� ���ڷ� ����
		int i3 = str3.charAt(0) - '0'; // �ƽ�Ű�ڵ��
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
	}
}
