package ch07;
class B {
	// 필드(멤버변수)
	int age = 20;
	
	// 메서드
	void b() {
		System.out.println("대박");
	}
}

class B1 extends B { // B1 클래스는 B 클래스를 상속받앗다 
	// 필드(멤버변수)
	String hobby = "놀기";
	
	// 메서드
	void b1() {
		System.out.println("봄날이야");
	}
}

class B2 extends B {  // B2 클래스는 B 클래스를 상속받앗다
	// 필드(멤버변수)
	String part = "청소";
	
	// 메서드
	void b2() {
		System.out.println("마지막 시간이다.");
	}
}

public class Inher2 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		System.out.println("나이 : " + b1.age);
		System.out.println("취미 : " + b1.hobby);
		b1.b(); b1.b1();
		
		B2 b2 = new B2();
		System.out.println("나이 : " + b2.age);
		System.out.println("담당 : " + b2.part);
		b2.b(); b2.b2();
	   
	    
	}
}  

// 부모 클래스가 있는 자식 클래스를 인스턴스화 하여 객체를 생성했을때 부모클래스의 멤버변수와 메소드를 이용할 수 있다.
