package ch03;

import java.io.IOException;

public class IO1 {
	public static void main(String[] args) throws IOException {
		System.out.println("���� ���ڸ��� �Է��ϼ���");
		// �ֿܼ� �Է��� ���ڸ� ���ڸ� �д´�.
		int num = System.in.read() - '0';//48;
		System.out.println("�Է��� ���� : " + num);
	}
}
