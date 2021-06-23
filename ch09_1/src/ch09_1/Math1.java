package ch09_1;

public class Math1 {
	public static void main(String[] args) {
		float f1 = 4.1f;
		float f2 = 4.7f;
		float f3 = -4.1f;
		float f4 = -4.7f;
		
		// Math 클래스는 메소드가 전부 static(정적)이라 객체 생성할 필요 x
		// round : 반올림 (5이상이면 올리고 4이하면 내림)
		// ceil : 올림 (현재의 숫자 이상인 정수 중에서 가장 작은 수)
		// floor : 내림 (현재의 숫자 이하인 정수 중에서 가장 큰 정수)
		System.out.println("f1 = " + Math.round(f1));
		System.out.println("f1 = " + Math.ceil(f1));
		System.out.println("f1 = " + Math.floor(f1));
		System.out.println("f2 = " + Math.round(f2));
		System.out.println("f2 = " + Math.ceil(f2));
		System.out.println("f2 = " + Math.floor(f2));
		System.out.println("f3 = " + Math.round(f3));
		System.out.println("f3 = " + Math.ceil(f3));
		System.out.println("f3 = " + Math.floor(f3));
		System.out.println("f4 = " + Math.round(f4));
		System.out.println("f4 = " + Math.ceil(f4));
		System.out.println("f4 = " + Math.floor(f4));
	}
}
