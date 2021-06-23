package ch07_1;

public class Car3 {
	// 필드(멤버변수)
	String color = "파랑";
	
	// 메소드(오버라이딩)
	void drive() {
		System.out.println("달린다 신나게");
	}
}

class FireEngine3 extends Car3 {
	// 필드(멤버변수)
	String color = "빨강";
	
	// 메소드
	// (오버라이딩)
	void drive() {
		System.out.println("물을 싣고 달린다.");
	}
	void fire() {
		System.out.println("불 끄러 가는 차다.");
	}
}

class Ambulance3 extends Car3 {
	// 필드(멤버변수)
	String color = "빨강";
	
	// 메소드(오버라이딩)
	void drive() {
		System.out.println("환자를 싣고 달린다.");
	}
}

class Bus3 extends Car3{
	// 메소드(오버라이딩)
	void drive() {
		System.out.println("45명까지 싣고 달린다.");
	}
}