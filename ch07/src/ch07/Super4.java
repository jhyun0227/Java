package ch07;
// this(), super() 있으면 해당하는 생성자 작업을 끝내고 호출한 곳으로 돌아와서 아래 실행문을 작업한다.
class H1 {
	// 필드(멤버변수)
	int x;
	
	// 생성자
	H1(int x) { // 7
		this.x = x; // 8
		System.out.println("부모생성자 매개변수 1개"); // 9
	}
	H1(int x, int y) { // 5
		this(x); // 6
		System.out.println("x = " + x); // 10
	}
	
	// 메소드
	void print() {
		System.out.println("x = " + x); // 13
	}
}

class H2 extends H1 {
	// 생성자
	H2(int x, int y) { // 3
		super(x, y); // 4
		System.out.println("자식생성자 매개변수 2개"); // 11
	}
	H2(int x, int y, int z) { // 1
		this(x, y); // 2
		System.out.println("자식생성자 매개변수 3개"); // 12
	}
}

public class Super4 {
	public static void main(String[] args) {
		H2 h = new H2(34, 45, 67);
		h.print();
	}
}