package ch10;

import java.util.Scanner;

public class Assert1 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("������ �Է��ϼ���.");
			num = sc.nextInt();
			// Run configuration�� vm�� -ea�� �Է��ϰ� �����ؾ� �Ѵ�.
			// ���ǿ� ���� ������ ������ �߻���Ų��.
			assert (num < 100 && num >= 0) : "�߸��� ���� �Դϴ�.";
			System.out.println("�Է��� ���� : " + num);
		} catch (Exception e) {
			System.out.println("���ܾ�");
		}
		sc.close();
	}
}
