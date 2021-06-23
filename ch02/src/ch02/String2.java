package ch02;

public class String2 {
	public static void main(String[] args) {
		String s1 = "안녕";
		int age = 2021 - 1990 - 1;
		System.out.println("s1 = " + s1);
		System.out.println("age = " + age);
		System.out.println(s1 + age); // 문자 + 숫자 순서로 하면 숫자가 문자로 변경되어 뒤에 연결
		
		System.out.println("안녕" + 2+0+2+1); // 앞 숫자부터 차례로 문자로 변경하여 연결
		System.out.println(2+0+2+1 + "안녕"); // 연산 후에 문자로 변경되어 연결
		System.out.println("" + 2+0+2+1 + "안녕"); // 문자열 + 숫자의 경우 숫자가 문자열로 변경
	}
}
