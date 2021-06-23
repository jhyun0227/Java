package ch07;

public class D1 {
	// 필드(멤버변수)
	String str1 = "허걱";
	
	// 생성자
	D1() {
		System.out.println("내가 대장이야");
	}
	
	//메소드
	void m1() {
		System.out.println("내가 첫번째 메소드");
    }
}

class D2 extends D1 {
	// 필드(멤버변수)
	String str2 = "허각";
		
	// 생성자
	D2() {
		System.out.println("내가 중간보스");
	}
		
	//메소드
	void m2() {
		System.out.println("내가 중간 메소드");
	}
}

class D3 extends D2 {
	// 필드(멤버변수)
	String str3 = "허공";
		
	// 생성자
	D3() {
		System.out.println("내가 막내");
	}
		
	//메소드
	void m3() {
		System.out.println("내가 막 메소드");
	}
}

	
