package ch03;

public class If1 { // 조건문
	public static void main(String[] args) {
		int a = -7;
		if(a > 0) 
			// 조건이 참이면 아래 한문장 만을 실행
			System.out.println("a는 양수이고 숫자는 " + a + "입니다.");
		System.out.println("프로그램 종료");
		
		int b = -7;
		if(b > 0) 
			// 조건이 참이면 아래 한문장 만을 실행
			System.out.println("b는 양수입니다.");
			System.out.println("숫자는 " + b + "입니다.");
		System.out.println("프로그램 종료");
		
		int c = -7;
		if(c > 0) { 
			// 중괄호를 통해 범위를 저장할 수 있음
			System.out.println("c는 양수입니다.");
			System.out.println("숫자는 " + c + "입니다.");
		} else { 
			// if가 거짓일때 else 다음 문장을 실행
			System.out.println("c는 음수입니다.");
			System.out.println("숫자는 " + c + "입니다.");
		}
		System.out.println("프로그램 종료");
	}
}
