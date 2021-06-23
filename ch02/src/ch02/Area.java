package ch02;

public class Area {
	public static void main(String[] args) {
		double pi = 3.141592;
		int r = 5;
		//int area = r * r * pi; // 오류
		double area = r * r * pi; // 연산결과는 범위가 넓은 쪽으로 변경
		System.out.println("면적 : " + area);
	}
}
