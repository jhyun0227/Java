package ch06;
class B1 {
	static void multiply(int x, int y) {
		System.out.printf("%d * %d = %d\n", x, y, x*y);
	}
}

public class Add1 {
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
	}
	
	static void minus(int x, int y) {
		System.out.printf("%d - %d = %d\n", x, y, x-y);
	}
	
	public static void main(String[] args) {
		Add1 a1 = new Add1();
		a1.add(10, 20); // main에서 사용할때는 반드시 객체를 생성하고 사용 (인스턴스)
		Add1.minus(12, 4);
		// 사용하려는 메소드가 있는 클래스명과 main(실행)문이 있는 클래스명이 같을 경우 생략가능
		minus(17,6);	
		
		B1.multiply(12,7); // 클래스 변수
		//multiply(10,3) // 사용하려는 메소드가 있는 클래스명과 메인 메소드가 있는 클래스명이 달라서 에러
	}
}
