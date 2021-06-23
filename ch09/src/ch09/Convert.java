package ch09;

public class Convert {
	public static void main(String[] args) {
		String str1 = 4 + " "; // 숫자에 공란 문자를 넣어서 숫자로 만들어버림
		String str2 = String.valueOf(4); // 문자를 숫자로 변경
		
		String str3 = "123";
		int i1 = Integer.parseInt(str3); // 문자열로 숫자로 변경
		int i2 = Integer.valueOf(str3); // 문자열을 숫자로 변경
		int i3 = str3.charAt(0) - '0'; // 아스키코드로
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
	}
}
