package ch06_1;

public class Score1 {
	// this만 있으면 객체 자신, this() 클래스 내에 다른 생성자
	// this(매개변수, ...) 같은 클래스에서 다른 생성자 호출
	// this() 생성자명 바로 아래 위치
	public Score1() { // 5
		System.out.println("매개변수가 없는 생성자"); // 6
	}
	
	public Score1(String name) { // 3
		this(); // 4
		System.out.println("매개변수 이름 : " + name); // 7
	// this(); 생성자 내에서 첫번째 줄에 있어야 한다.
	}
	
	public Score1(String name, int kor) { // 1
		this(name); // 2
		
		System.out.println("매개변수 이름 : " + name + ", 국어 : " + kor); // 8
	}
	
	void print() {
		System.out.println("고뤠"); // 9
	}
}
