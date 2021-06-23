package ch07;
// 상속을 하면 부모를 재사용해서 코드간편
// 멤버변수와 메서드를 자기 것처럼 사용
class A {
	// 필드(멤버변수)
	int a = 10;
	
	// 메소드
	void m1() {
		System.out.println("난 부모 메서드");
	}
}

class A1 extends A { // 자식클래스 extends 부모클래스 = 상속
	// 필드(멤버변수)
	int a1 = 17;
	
	// 메소드
	void m2() {
		System.out.println("난 자식 메서드 a1");
	}
}

class A2 extends A {
	// 필드(멤버변수)
	int a2 = 27;
	
	// 메소드
	void m3() {
		System.out.println("난 자식 메서드 a2");
	}
}

public class Inher1 {
	public static void main(String[] args) {
		A1 a1 = new A1(); A2 a2 = new A2();
		System.out.println("a = " + a1.a);
		System.out.println("a1 = " + a1.a1);
		a1.m1(); a1.m2();
		System.out.println("a = " + a2.a);
		System.out.println("a2 = " + a2.a2);
		a2.m1(); a2.m3();
	}
}
