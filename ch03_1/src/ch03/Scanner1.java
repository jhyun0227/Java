package ch03;
import java.util.Scanner;
public class Scanner1 {
// ���� �� ==, !=
// ���ں� ����.equals("����"), !����.equals("����")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("���ڿ��� �Է��ϼ���");
			str = sc.nextLine(); // ���� 1�� �б�
			System.out.println("�Է��� ���ڴ� "+str+"�Դϴ�");
			if (str.equals("x"))
				break; // �ݺ��� ����
		}while(true);
	//	}while(!str.equals("x"));
		System.out.println("���α׷� ����");
		sc.close();
	}
}