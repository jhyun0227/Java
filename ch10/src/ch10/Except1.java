package ch10;

public class Except1 {
	public static void main(String[] args) {
		int number = 100, result = 0;
		
		for (int i = 0; i < 10; i++) {
											// 0 ~ 9
			try { // try, catch 절
				result = number / (int) (Math.random() * 10);
			} catch (ArithmeticException e) { // e는 크게 신경안써도 돼
				System.out.println("0으로 못나눠" + e.getMessage());
			}
			System.out.println("나눗셈 결과 : " + result);
		}
	}
}

// ArithmeticException 오류 : 0으로 나누어짐