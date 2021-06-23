package ch05;
class Car4 {
	// 멤버변수
	String color;
	int displacement; 
	String kind;
	
	// 생성자 / 모든 클래스는 생성자가 있어야한다.
	// 생성자가 하나도 없으면 compile 할 때 자동으로 default 생성자를 만들어 준다.
	// default 생성자 : 매개변수가 하나도 없는 생성자
	Car4(/*여기 들어가는 값이 매개변수*/) { }  // 얘가 default 생성자
	Car4(String color, int displacement, String kind) {
		this.color = color; this.displacement = displacement; this.kind = kind;
	} // 매개변수가 있는 생성자, 생성자를 통해 맴버변수 초기화
	// 생성자 이름이 같지만 매개변수가 다른 경우를 생성자 오버로딩이라고 함
	
	// 메소드
	void print() {
		System.out.println("===================================");
		System.out.println("종류 : " + kind);
		System.out.println("배기량 : " + displacement);
		System.out.println("색깔 : " + color);
		System.out.println("===================================");
	}
}

public class Const1 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.color = "파랑";
		c1.displacement = 1000;
		c1.kind = "모닝";
		c1.print();
		
		Car4 c2 = new Car4("노랑", 2000, "소나타");
		c2.print();
	}
}
