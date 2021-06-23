package ch06;

public class Shape {
	public void draw() {
		System.out.println("�׸���");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
	
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
	
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
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