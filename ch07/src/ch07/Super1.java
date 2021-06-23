package ch07;
class E1 {
	// 필드(멤버변수)
	int k = 7;
	
	// 생성자
	E1() {
		System.out.println("매개변수 없는 부모 생성자");
	}
	E1(String str) {
		this();
		System.out.println("매개변수 하나 : " + str);
	}
}

class E2 extends E1 {
	// 생성자
	E2() { // 1확인, super(매개변수) 있으면 매개변수 갯수나 데이터형에 해당하는 부모 생성자먼저 생성 (상위 클래스)\
		super("대박"); // 없으면 default 생성자를 호출
		System.out.println("매개변수가 없는 자식 생성자");
	}
}

public class Super1 {
	public static void main(String[] args) {
		E2 e2 = new E2();
		System.out.println("k = " + e2.k);
	}
}
