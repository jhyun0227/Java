package ch06;

public class Shape {
	public void draw() {
		System.out.println("그린다");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
	
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}
	
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
	}	
}

class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle();
		shapes[1] = new Rectangle();
		shapes[2] = new Triangle();
		
		for (Shape shape : shapes) {
			shape.draw();
		}
	}	
}