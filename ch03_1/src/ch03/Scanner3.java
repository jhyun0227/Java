package ch03;
import java.util.Scanner;
public class Scanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int num = 0;
		do {
			System.out.println("������ �Է��ϼ���");
			// ���ڿ� ���ڸ� ����� ���� ���� ���ڷ� ���� �Ŀ� ���ڷ� ����
			// Integer.parseInt�� ������������ �Է��� ���ڿ��� ������ ����
			num = Integer.parseInt(sc.nextLine()); // 12+\r\n
			// sc.nextInt(); // 12�� �а� \r\n �����.
			System.out.println("�Է��� ���ڴ� "+num+"�Դϴ�");
			System.out.println("���ڿ��� �Է��ϼ���");
			str = sc.nextLine(); // ���� 1�� �б�
			System.out.println("�Է��� ���ڴ� "+str+"�Դϴ�");
			if (str.equals("x"))
				break; // �ݺ��� ����			
		}while(true);
		System.out.println("���α׷� ����");
		sc.close();
	}
}