package ch07_1;
class Parent {
	// 필드(멤버변수)
	int x = 100;
	
	// 생성자
	Parent() { // 4
		this(200); // Parent(int x)를 호출 // 5
	}
	Parent(int x) { // 6
		this.x = x;
	}
	
	// 메소드(getter)
	int getX() {
		return x;
	}
}

class Child extends Parent {
	// 필드(멤버변수)
	int x = 3000; // 1000
	
	// 생성자
	Child() { // 2
		this(1000); // Child(int x)를 호출
	}
	Child(int x) { // 3
		System.out.println("c 1 x = " + this.x);
		System.out.println("c 1 x = " + super.x);
		this.x = x;
		System.out.println("c 2 x = " + this.x);
		System.out.println("c 2 x = " + super.x);
	} 
}

public class ParentEx {
	public static void main(String[] args) {
		Child c = new Child(); //1
		// 생성자가 모두 정리되어야 객체를 사용 가능
		System.out.println("x=" + c.getX());
	}
}