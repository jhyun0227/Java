package ch10;

public class Throw1 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

	private static void m2() /*throws Exception*/ {
		// 여기서 예외를 발생 시키겠다.
		try {
			throw new Exception("대박 에러"); // throw는 일반적으로 개발할때 사용하지않고 강제로 오류를 일으켜 체크할때만 사용
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
