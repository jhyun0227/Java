package ch10;
import java.util.Scanner;
public class Except2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0; // num1, num2 사용가능한 지역을 확장
		while(true) {
			System.out.println("첫번째 숫자를 입력하세요");
			String str = sc.nextLine();
			if (str.equals("x")) break;
//			// try catch로 예외하면 그 경우를 제외하고 계속 진행할 수 있다.
			try { // try, catch 절
				num1 = Integer.parseInt(str);
				System.out.println("두번째 숫자를 입력하세요");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다");
			} catch (NumberFormatException e) { // 문자열을 숫자로 변경할 수 없을 때
				System.out.println("숫자로 변경할 수 없는 문자입니다");
			} catch (Exception e) { // 범위가 넓은 처리를 아래에 배치
				System.out.println(e.getMessage());
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}