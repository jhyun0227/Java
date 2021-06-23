package ch18;
interface MyFunction1 { // 람다식에는 하나의 메소드만
	public void method();
}

class MyFun1Class implements MyFunction1 {
	@Override
	public void method() {
		System.out.println("난 재정의한 클래스");
	}
	
}

public class Lamda1Ex {
	public static void main(String[] args) {
		MyFunction1 mc1 = new MyFun1Class();
		mc1.method();
		mc1 = new MyFunction1() { // 무명(익명) 클래스
			@Override
			public void method() {
				System.out.println("난 인터페이스 직접 재정의");
			}		
		};
		mc1.method();
		mc1 = ()-> {System.out.println("난 람다로 처리한 메서드");}; // 람다식
		mc1.method();
	}
}
