package ch03;
import java.io.IOException;
public class Do3 {
	public static void main(String[] args) throws IOException {
		int num; // ���⿡ �����ϸ� main�޼��� �������� ���
		do { // 7+enter , enter=> \r\n => CR(Ŀ�� ������ ����), LF(�ٹٲ��)
			 // CR�� 13,  LF�� 10
			System.out.println("���ڸ� ¦���� �Է��ϼ���");
			// num�� �������� do { ���� } // ��������
			num = System.in.read() - '0'; // 13 -48=> -35, 10-48=> -38
			System.in.read(); // CR \r ó��
			System.in.read(); // LF \n ó��
		}while(num % 2 == 1);
		System.out.println("�Է��� ¦�� : " + num);
	}
}