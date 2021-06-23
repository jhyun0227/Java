package ch03;

import java.io.IOException;

public class Do7 {
	public static void main(String[] args) throws IOException {
    System.out.println("구구단");
    System.out.println("=============");
    
	int i = 1, j = 2;
	do {
		do {
			System.out.printf("%d * %d = %d\t", j, i, j*i);
			j++;
		} while (j <= 9);
		i++;
		j = 2;
		System.out.println();
	} while (i <= 9);
	
	/* ------------------------------------------------
	System.out.println("구구단 숫자 입력하세요");
	int num = System.in.read() - '0';
	System.out.println("구구단" + num + "단");
	
	int i = 1;
	if (num > 1) {
		do {
			// System.out.printf("%d * %d = %d\n", num, i, num*i);
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		} while (i <= 9);
	}*/  // 내가 한거
	}
}
