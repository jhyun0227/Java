package ch03;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("정수를 입력하세요.");
			num = sc.nextInt();
			System.out.println("입력한 숫자는 " + num + "입니다.");
		} while (num != 0);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
