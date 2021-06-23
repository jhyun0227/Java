package ch06_1;
class A1 {
	public void m1(int a, int b) {
		a += 7; // 전달된 값을 저장한 변수의 값을 변경
		b += 7;
		System.out.println("x = " + a);
		System.out.println("y = " + b);
	}	
}

public class CallByValue1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		int x =  10, y = 20; // 데이터가 기본형인 경우
		a1.m1(x, y); // a1.m1(10, 20); 변수 x y를 전달한 것이 아니라 값을 전달한것
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

// 데이터가 기본형인 경우 변수 자제를 전달하는것이 아니라 변수의 값만을 전달하는 것