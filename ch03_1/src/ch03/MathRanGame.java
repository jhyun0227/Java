package ch03;

import java.util.Scanner;

public class MathRanGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random() * 100) + 1; // 1~100 ���� ����
		int num = 0, cnt = 0;
		do {
			System.out.println("���ڸ� ���� ������.");
			num = sc.nextInt();
			if(num > number) {
				System.out.println("���� ���� �Է��ϼ���.");
			} else if (num < number) {
				System.out.println("ū ���� �Է��ϼ���.");
			}
			cnt++;
		} while (number != num);
		System.out.println(number + "�� " + cnt + "���� ������ϴ�.");
		sc.close();
	}
}
