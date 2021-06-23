package ch03;

public class If2 { // if else 문
	public static void main(String[] args) {
		int i1 = -10;
		// Integer.parseInt(args[0])는 args[0]에 있는 문자를 정수로 바꿔라
		// int i1 = Integer.parseInt(args[0]);
		if (i1 > 0) {
			System.out.println("양수입니다.");
			System.out.println("숫자는 " + i1 + "입니다.");
		} else {
			System.out.println("음수입니다.");
			System.out.println("절대값은 " + -i1 + "입니다.");
		}
	}
}
