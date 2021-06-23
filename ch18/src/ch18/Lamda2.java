package ch18;
@FunctionalInterface // 함수적 인터페이스인지 체크 (람다식에는 한개의 추상메소드만)
interface MyFun2 {
	void method(int x);
}

public class Lamda2 {
	public static void main(String[] args) {
		MyFun2 mf2;
		mf2 = (x)-> {
			int result = x * 5;
			System.out.println("결과 : " + result);
		};
		mf2.method(4);
		
		mf2 = (x)-> {System.out.println("결과 : " + x*7);};
		mf2.method(5);
		
		mf2 = x-> {System.out.println("결과 : " + x*3);}; // 매개변수가 1개인 경우 ()생략
		mf2.method(3);
		
		mf2 = x-> System.out.println("결과 : " + x*6); // 문자가 하나인 경우 {}생략
		mf2.method(7);
	}
}
