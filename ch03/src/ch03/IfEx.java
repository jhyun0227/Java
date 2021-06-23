package ch03;

public class IfEx {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		String str = "";
		if (i < 10) {
			str = "10 미만의 값입니다.";
		} else if (i < 100) {
			str = "10이상 100미만의 값입니다.";
		} else if (i < 1000) {
			str = "100이상 1000미만의 값입니다.";
		} else if (i > 1000) {
			str = "1000이상의 값입니다.";
		}
		System.out.println("숫자는 " + i + "이고 값의 범위는 " + str);
	}
}