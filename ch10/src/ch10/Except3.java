package ch10;

public class Except3 {
	public static void main(String[] args) {
		int[] x = {12, 45, 25, 0, 6};
		for (int i = 0; i <= x.length; i++) {
			try { // try, catch 절
			System.out.printf("%d / %d = %d\n", 100, x[i], 100/x[i]);
			} catch (ArithmeticException e) { // 숫자가 0으로 나누어진다
				System.out.println("0으로 나눌 수 없습니다");
			} catch (ArrayIndexOutOfBoundsException e) { // 인덱스 범위를 벗어났다.
				System.out.println("인덱스 범위를 벗어 났습니다.");
			} catch (Exception e) { // 혹시 다른 예외?
				System.out.println(e.getMessage());
			} finally { // 예외와 관계 없이 무조건 실행한다.
				System.out.println("난 무조건 실행");
			}
		}
	}
}
