package ch08_1;
class Person2 {
	// 필드(멤버변수)
	int leg = 2;
	
	// 메소드
	void move() {
		System.out.println("두 다리로 걷는다.");
	}
}

interface Fish {
	// 추상메소드
	void swim();
}

public class Mermaid extends Person2 implements Fish { // 상속은 단일상속, 인터페이스는 다중상속이 가능
	@Override
	public void swim() { // 오버라이드
		System.out.println("물속에서 장시간 헤엄친다.");
	}
	
	public static void main(String[] args) { // 이 부분은 정확히하자면 MermaidEx 클래스를 따로 만들어야 하지만 보기 불편한 관계로 그냥 한 클래스에서 작성함
		Mermaid mr = new Mermaid();
		mr.move();
		mr.swim();
		System.out.println("다리 갯수 : " + mr.leg);
	}
}
