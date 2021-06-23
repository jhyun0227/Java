package ch02;

public class Var2 {

	public static void main(String[] args) {
		// int pi = 3.141592; // 정수에는 실수를 담을 수 없다
		double pi = 3.141592;
		// float f1 = 3.14; // 실수는 f가 없으면 double로 인식 (default double)
		float f2  = 3.14f; // 대소문자 구별하지 않음
		System.out.println("pi="+pi);
		System.out.println("f2="+f2);
	}

}
