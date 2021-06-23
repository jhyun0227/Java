package ch07;
class F1 {
	// 필드(멤버변수)
	int x = 1000;
	
	// 메서드
	void display() {
		System.out.println("부모 메서드입니다");
	}
}

class F2 extends F1 {
	// 필드(멤버변수)
	int x = 2000;
	
	// 메소드
	void display() {
		System.out.println("자식 메서드입니다");
	}
	void print() {
		display();
		super.display();
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
	}
}

public class Super2 {
	public static void main(String[] args) {
		F2 f2 = new F2(); // 이름이 같으면 : F2에 가까운 것 즉 자식것 출력
		System.out.println("x = " + f2.x);
		f2.display();
		f2.print();
	}
}