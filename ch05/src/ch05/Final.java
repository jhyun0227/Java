package ch05;

public class Final {
	public static void main(String[] args) {
		// final이 있는 변수는 대문자로 표시하여 알림
		// final 이 있는 값은 변경 불가
		final float PI = 3.14f; // PI = 3.141592;
		int r = 10;
		r = 20; // final 없어서 r 에 20의 값이 저장
		System.out.println("반지름이 " + r + "인 원의 면적 : " + r*r*PI);
	}
}
