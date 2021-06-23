package ch07;

// 보기 편하기 위해 한 소스파일에 3개의 클래스 파일을 만들었지만 원래는 1개의 소스파일에 1개의 클래스가 권장된다.
public class C1 { // supertype, parent 부모 클래스
	// 필드
	private String c1 = "대박";
	
	// 생성자
	C1() {
		System.out.println("내가 할아버지 생성자");
	}
	
	// 메소드
	void c11() { 
		System.out.println("난 할아버지 메소드");
	}
}

class C2 extends C1 { // supertype(subtype), parent(child) 부모이면서 자식 클래스
	// 필드
	int c2 = 56;
	
	// 생성자
	C2() {
		System.out.println("내가 아버지 생성자");
	}
		
	// 메소드
	private void c21() {
		System.out.println("난 아버지 메소드");
	}
}

class C3 extends C2 { // subtype, child 자식 클래스
	// 필드
	int c3 = 77;
	
	// 생성자
	C3() {
		System.out.println("내가 자식 생성자");
	}
		
	// 메소드
	void c31() {
		System.out.println("난 자식 메소드");
	}
}