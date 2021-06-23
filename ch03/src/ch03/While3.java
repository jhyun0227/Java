package ch03;

import java.io.IOException;

public class While3 {
	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단 번호는?");
		int num = System.in.read() - '0';
		System.out.println("구구단 " + num + "단");
		
		int i = 1;
		while (i <= 9) {
			// System.out.printf("%d * %d = %d\n", num, i, num*i);
			System.out.print(num + " * " + i + " = " + num*i);
			System.out.println();
			i++;
		}
	}
}
