package ch08;

public class Shape {
	void draw() { // 오버라이딩	
	}
}

class Circle extends Shape {
	void draw() { // 부모의 메서드 내용을 재정의(변경) 오버라이딩
		System.out.println("원을 그린다.");
	}
}

class Triangle extends Shape {
	void draw() { // 오버라이딩
		System.out.println("삼각형을 그린다.");
	}
}

class Rectangle extends Shape {
	void draw() { // 오버라이딩
		System.out.println("사각형을 그린다.");
	}
}