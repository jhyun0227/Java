package ch03;

import java.io.IOException;

public class Do4 {
	public static void main(String[] args) throws IOException {
		// ������ ���ڸ� �Է¹޾Ƽ� �ش��ϴ� ������ ��� do ~ while �ۼ�
		System.out.println("���� ���� ������ ���ڸ� �Է��ϼ���");
		int num = System.in.read() - '0';
		System.out.println("������ " + num + "��");
		int i = 1;
		do {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			i++;
		} while (i <= 9);
	}
} 
