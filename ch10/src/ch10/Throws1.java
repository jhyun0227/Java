package ch10;

public class Throws1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			try {
				m1(i);
			} catch (ArithmeticException e) {
				// System.out.println("영으로 못나눠");
				// System.out.println(e.getMessage()); // 가지고 있는 에러 메세지
				e.printStackTrace(); 				   // 에러가 발생한 흔적을 추적하여 출력한다
			}
		}
	}

	// throws는 예외가 발생하면 이 메소드를 호출한 곳으로 예외로 던진다
	private static void m1(int i) throws ArithmeticException, NumberFormatException {
		m2(i);
		
	}

	// throws는 예외가 발생하면 이 메소드를 호출한 곳으로 예외로 던진다
	private static void m2(int i) throws ArithmeticException {
		int k =12;
			System.out.printf("%d / %d = %d\n", k, i, k/i);
	}
}
