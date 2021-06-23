package ch03;

import java.util.Scanner;

public class MathRanGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random() * 100) + 1; // 1~100 사이 정수
		int num = 0, cnt = 0;
		do {
			System.out.println("숫자를 맞춰 보세요.");
			num = sc.nextInt();
			if(num > number) {
				System.out.println("작은 수를 입력하세요.");
			} else if (num < number) {
				System.out.println("큰 수를 입력하세요.");
			}
			cnt++;
		} while (number != num);
		System.out.println(number + "를 " + cnt + "번에 맞췄습니다.");
		sc.close();
	}
}
