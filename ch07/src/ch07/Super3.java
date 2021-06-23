package ch07;
class G1 {
	// 필드(멤버변수)
	String msg = "대박";

	
	// 생성자
	G1() {
		System.out.println("매개변수가 없는 생성자");
	}
	G1(String str) {
		this();
		System.out.println("매개변수가 하나 : " + str);
	}
	
	
	// 메소드
	void g1() {
		System.out.println("부모 메소드");
	}
}

class G2 extends G1 {
	// 필드(멤버변수)
	String msg = "쪽박";
	
	// 생성자
	G2(String str) {
		super(str);
		System.out.println("난 자식 생성자");
	}
	
	// 메소드
	void g1() {
		System.out.println("자식 메소드");
	}
    
	void print() {
		System.out.println("super.msg = " + super.msg);
		System.out.println("msg = " + msg);
		super.g1();
		g1();
	}
}


public class Super3 {
	public static void main(String[] args) {
		G2 g2 = new G2("헐~");
		System.out.println("msg = " + g2.msg);
		g2.g1();
		g2.print();
	}	
}
