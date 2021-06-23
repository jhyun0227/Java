package ch02;

public class Var1 {
	public static void main(String[] args) {
		int a = 7;
		// 큰 따옴표(" ")안에 있는 것은 문자열
		// a에 값이 없어서 무엇을 출력할지 몰라서 발생되는 에러
		System.out.println("a="+ a); // +a는 앞에 문자 뒤에 메모리 a의 있는 값을 출력한다.
		
		//byte b1 = 400; // 범위를 초과하여 에러
		byte b1 = 45;
		System.out.println("b1="+b1);
	}
}
