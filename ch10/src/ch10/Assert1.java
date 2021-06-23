package ch10;

import java.util.Scanner;

public class Assert1 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수를 입력하세요.");
			num = sc.nextInt();
			// Run configuration의 vm에 -ea를 입력하고 실행해야 한다.
			// 조건에 맞지 않으면 에러를 발생시킨다.
			assert (num < 100 && num >= 0) : "잘못된 점수 입니다.";
			System.out.println("입력한 점수 : " + num);
		} catch (Exception e) {
			System.out.println("예외야");
		}
		sc.close();
	}
}
