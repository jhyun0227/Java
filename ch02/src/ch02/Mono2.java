package ch02;

public class Mono2 {
	public static void main(String[] args) {
		int a1 = 5, a2 = 5; // �ʱ�ȭ
		int c1 = ++a1 * 3 + (a2-- + 2) * 3; // a1 a2�� �ʱⰪ���� ��ȭ�Ǿ� 6,4��� ���� ���´�
		// c1 = 6 * 3 + (5 + 2) * 3
		// ���� ����� ����� �Ŀ� a2���� ����
		System.out.println("a1 = " + a1); 
		System.out.println("a2 = " + a2);
		System.out.println("c1 = " + c1);
	}
}