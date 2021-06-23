package ch09_1;

import java.util.GregorianCalendar;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", cal.get(GregorianCalendar.YEAR),
				cal.get(GregorianCalendar.MONTH) + 1, cal.get(GregorianCalendar.DATE));

		// 4/6 : 현재 월중에 몇일
		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH));
		// 31 + 28 + 31 + 6 : 1년 중에 몇일
		System.out.println(cal.get(GregorianCalendar.DAY_OF_YEAR));

		// 년 월일 주어서 생성가능 월은 -1로 입력
		GregorianCalendar cal2 = new GregorianCalendar(2000, 3, 7);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", cal2.get(GregorianCalendar.YEAR),
				cal2.get(GregorianCalendar.MONTH) + 1, cal2.get(GregorianCalendar.DATE));
	}
}
