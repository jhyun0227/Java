package ch09_1;

import java.util.GregorianCalendar;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�.\n", cal.get(GregorianCalendar.YEAR),
				cal.get(GregorianCalendar.MONTH) + 1, cal.get(GregorianCalendar.DATE));

		// 4/6 : ���� ���߿� ����
		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH));
		// 31 + 28 + 31 + 6 : 1�� �߿� ����
		System.out.println(cal.get(GregorianCalendar.DAY_OF_YEAR));

		// �� ���� �־ �������� ���� -1�� �Է�
		GregorianCalendar cal2 = new GregorianCalendar(2000, 3, 7);
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�.\n", cal2.get(GregorianCalendar.YEAR),
				cal2.get(GregorianCalendar.MONTH) + 1, cal2.get(GregorianCalendar.DATE));
	}
}
