package ch02;

public class String1 {
	public static void main(String[] args) {
		String name = "�浿";
		String greeting = "�ȳ�"; // '�ȳ�'; ���� ����ǥ�� ����
		String a = name + greeting; // ���ڿ��� ���� ����
		System.out.println("a = " + a);
		
		// 0 12 3 : index
		// �浿�ȳ�
		// substring(���� index, index ��)  ������ �Ϻ� ���� 1, 2 �����̶� "����"�� ����
		System.out.println(a.substring(1,3));
		
		// equals ���ڿ����� ������ �ϴ� ��
		System.out.println(name.equals(greeting));
		System.out.println(name.equals(name));
		System.out.println(name.equals("�浿"));
	}
}
