package ch03;

public class If1 { // ���ǹ�
	public static void main(String[] args) {
		int a = -7;
		if(a > 0) 
			// ������ ���̸� �Ʒ� �ѹ��� ���� ����
			System.out.println("a�� ����̰� ���ڴ� " + a + "�Դϴ�.");
		System.out.println("���α׷� ����");
		
		int b = -7;
		if(b > 0) 
			// ������ ���̸� �Ʒ� �ѹ��� ���� ����
			System.out.println("b�� ����Դϴ�.");
			System.out.println("���ڴ� " + b + "�Դϴ�.");
		System.out.println("���α׷� ����");
		
		int c = -7;
		if(c > 0) { 
			// �߰�ȣ�� ���� ������ ������ �� ����
			System.out.println("c�� ����Դϴ�.");
			System.out.println("���ڴ� " + c + "�Դϴ�.");
		} else { 
			// if�� �����϶� else ���� ������ ����
			System.out.println("c�� �����Դϴ�.");
			System.out.println("���ڴ� " + c + "�Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}
}
