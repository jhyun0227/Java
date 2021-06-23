package ch07;

public class Inher4 {
	public static void main(String[] args) {
		// 객체 생성
		// 부모클래스의 생성자
		// 생성자는 부모클래스 먼저 실행됨
		D3 d3 = new D3();
		
		// 부모클래스의 필드(멤버변수) 사용
		System.out.println("str1 = " + d3.str1);
		System.out.println("str2 = " + d3.str2);
		System.out.println("str3 = " + d3.str3);
		
		// 부모클래스의 메소드 사용
		d3.m1();
		d3.m2();
		d3.m3();
		
		System.out.println("=======================");
		
		// 자식 클래스의 필드(멤버변수)와 메소드는 사용이 불가능하다.
		D1 d1 = new D1();
		System.out.println("str1 = " + d1.str1);
//		System.out.println("str2 = " + d1.str2);
//		System.out.println("str3 = " + d1.str3);
		
		d1.m1();
//		d1.m2();
//		d1.m3();
	}
}
