package ch03;

import java.io.IOException;

public class While3 {
	public static void main(String[] args) throws IOException {
		System.out.println("������� ������ ��ȣ��?");
		int num = System.in.read() - '0';
		System.out.println("������ " + num + "��");
		
		int i = 1;
		while (i <= 9) {
			// System.out.printf("%d * %d = %d\n", num, i, num*i);
			System.out.print(num + " * " + i + " = " + num*i);
			System.out.println();
			i++;
		}
	}
}
