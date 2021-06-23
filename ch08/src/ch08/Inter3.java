package ch08;

interface C1 { // 추상클래스 객체 생성 불가
	String str = "와우 마지막 시간이닷"; // 인터페이스 변수 public static final 생략

	void c1(); // 추상클래스 오버라이딩 필수
}

interface C2 extends C1 { // 인터페이스가 인터페이스를 상속 추상클래스
	void c2();
}

interface C3 extends C2 { // 인터페이스가 인터페이스를 상속 추상클래스
	void c3();
}

class C4 implements C3 {
	public void c1() { // 오버라이딩
		System.out.println("산딸기");
	}

	public void c2() { // 오버라이딩
		System.out.println("판딸기");
	}

	public void c3() { // 오버라이딩
		System.out.println("알카리딸기");
	}

	public void c4() {
		System.out.println("뱀딸기");
	}
}

public class Inter3 {
	public static void main(String[] args) {
		C4 c4 = new C4();
		c4.c1();
		c4.c2();
		c4.c3();
		c4.c4();
		System.out.println(c4.str); // 변수가 static이기 때문에 참조변수명.멤버변수 대신 클래스.멤버변수 사용하는 것을 권장
		System.out.println(C4.str);
	}
}
