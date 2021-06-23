package ch05;
class Car3 {
	// static 정적, 클래스 변수, 공유(누구하나 바뀌면 다같이 바뀐다)
	// 객체를 생성하지 않고 클래스명.변수 또는 객체 생성 한 후에 참조변수명.변수
	// static 없으면 인스턴스 변수, 반드시 객체를 생성한 후에 사용
	static String color;
	int displacement;
	String kind;

	// 메소드
	void print() {
		System.out.println("===========================");
		System.out.println("색깔 : " + color);
		System.out.println("배기량 : " + displacement);
		System.out.println("종류 : " + kind);
	}
}

public class Var1Ex {
	public static void main(String[] args) {
		Car3.color = "노랑"; // 클래스 변수인 color를 노랑으로
		//Car3.kind = "소나타" // 인스턴스 변수라 객체 생성후 사용해야함
		
		Car3 c1 = new Car3();
		// c1.color = "빨강"; //메인 메소드 맨위에 노랑으로 클래스 변수를 지정했지만 아래에 빨강으로 바꾸면 다른 인스턴스 변수들의 값도 빨강으로 바뀐다.
		c1.displacement = 1500;
		c1.kind = "모닝";
	    c1.print();
		
		Car3 c2 = new Car3();
		c2.print();
		
		Car3 c3 = new Car3();
		c3.print();
	}
}