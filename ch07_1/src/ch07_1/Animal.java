package ch07_1;

public class Animal {
	// 필드(멤버변수) 
	int x = 7;
	
	// 메소드(오버라이딩)
	void move() {
		System.out.println("움직인다.");
	}
}

class Pig extends Animal {
	// 필드(멤버변수)
	int x = 10;
	
	// 메소드(오버라이딩)
	void move() {
		System.out.println("네 발로 움직인다.");
	}
}

class Bird extends Animal {
	// 메소드(오버라이딩)
	void move() {
		System.out.println("날개로 나른다.");
	}
	
	void eat() {
		System.out.println("부리로 쪼아 먹는다.");
	}
}

class Fish extends Animal {
	// 메소드(오버라이딩)
	void move() {
		System.out.println("지느러미로 헤엄친다.");
	}
}