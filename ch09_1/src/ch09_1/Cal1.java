package ch09_1;

import java.util.Calendar;
import java.util.Date;

public class Cal1 {
	public static void main(String[] args) {
//		Calendar cal = new Calender();  calender �� �߻�޼ҵ� ��� �߻�Ŭ���� ��ü ���� x
		// ���� 0�� ... 11�� �̹Ƿ� 1�� �߰�
		Calendar cal = Calendar.getInstance();
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�.\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DATE));
		
		// 4/6 : ���� ���߿� ����
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		// 31 + 28 + 31 + 6 : 1�� �߿� ����
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		Date date = new Date();
		System.out.println(date);
	}
}
