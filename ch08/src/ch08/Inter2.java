package ch08;
interface B1 { // 추상클래스
	int K1 = 10; // 필드(멤버변수)는 public static final 생략
	
	void m1(); // 추상메소드 오버라이딩 필수
}

interface B2 extends B1 { // 인터페이스끼리는 implement가 아니고 extends를 사용한다.
	void m2();
}

interface B3 extends B1 { // 인터페이스끼리는 implement가 아니고 extends를 사용한다.
	void m3();
}

interface B4 extends B2, B3 { // 인터페이스는 다중상속이 가능
	void m4();	
}

class B5 implements B4 {  // 사용하기 위해서는 클래스로 구현해야 사용 가능
	public void m1() {  // 오버라이딩
		System.out.println("김건모야");
	}
	public void m2() { // 오버라이딩
		System.out.println("이건뭐야");
	}
	public void m3() {  // 오버라이딩
		System.out.println("허각, 허공, 허걱");	
	}
	public void m4() {  // 오버라이딩
		System.out.println("왜불러, 배불러, 배터져");
	}	
}

public class Inter2 {
	public static void main(String[] args) {
		B5 b5 = new B5();
		b5.m1(); b5.m2(); b5.m3(); b5.m4();
		System.out.println("K = " + b5.K1);
		System.out.println("K = " + B5.K1);
	}
}
