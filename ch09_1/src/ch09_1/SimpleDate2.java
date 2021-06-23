package ch09_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDate2 {
	public static void main(String[] args) {
//		Date today = new Date();   // date 객체 생성해서 날짜 추가
//		System.out.println(today);

		// 2013년 3월 5일 12시 25분 30초 생성
		GregorianCalendar gc = new GregorianCalendar(2013,2,5,13,25,30);
		
		// 년도 2자리 - 월2- 일 시:분:초   HH:24 /hh:12s
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd HH:mm:ss"); // 날짜 생성했으니 포맷 추가
		// (요일)년도 4자리/월/일 (오전/오후)시:분:초
		SimpleDateFormat sdf2 = new SimpleDateFormat("(E) yyyy/MM/dd (a)hh:mm:ss");
		
		Date date = gc.getTime();
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
	}
}
