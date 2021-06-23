package ch04_1;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		
		// for(;;) {
		do {
			System.out.println("4자리 연도를 입력하세요.");
			year = sc.nextInt();
			if (year == 0) {
				break;
			}
			else if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
				System.out.println(year + "는 윤년입니다.");
			} else {
				System.out.println(year + "는 평년입니다.");
			}
		} while (true);
		// }
		sc.close();
		System.out.println("프로그램 종료");
	}
}
