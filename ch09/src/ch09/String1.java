package ch09;

public class String1 {
	public static void main(String[] args) {
		String str1 = "java"; // �����Ͱ� �⺻�� ó�� ����
		String str2 = "java";
		String str3 = new String("java");
		
		if (str1.equals(str2)) {
			System.out.println("Str1�� Str2�� ����.");
		} else {
			System.out.println("Str1�� Str2�� �ٸ���.");
		}
		
		if (str2.equals(str3)) {
			System.out.println("Str2�� Str3�� ����.");
		} else {
			System.out.println("Str2�� Str3�� �ٸ���.");
		}
		
		System.out.println("======================================");
		
		if (str1 == str2) {
			System.out.println("Str1�� Str2�� ����.");
		} else {
			System.out.println("Str1�� Str2�� �ٸ���.");
		}
		
		if (str2 == str3) {
			System.out.println("Str2�� Str3�� ����.");
		} else {
			System.out.println("Str2�� Str3�� �ٸ���.");
		}
		
//		== �ּұ��� ������, equals�� ��������� ������
	}
}
