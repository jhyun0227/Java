package ch09;

public class String2 {
	public static void main(String[] args) {
		System.out.println(2 + 0 + 2 + 0 + "월드컵");
		System.out.println("월드컵" + 2 + 0 + 0 + 2);
		
		String str1 = new String("대박");
		String str2 = "쪽박";
		char[] ch = {'즐', '거', '움'};
		String str3 = new String(ch);
		
		System.out.println(str1 + str2 + str3);
		
		String str4 = "오늘은, 월요일, 즐거우냐";
		String[] str5 = str4.split(", ");
		for (int i = 0; i < str5.length; i++) {
			System.out.println(str5[i]);
		}
		 // str4에서 인덱스 2부터 인덱스 7번 알까지 추출
		String str6  = str4.substring(2, 7);
		System.out.println(str6);
	}
}
