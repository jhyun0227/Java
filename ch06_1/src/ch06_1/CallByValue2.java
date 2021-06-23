package ch06_1;
class A2 {
	public void m1(int x, int y) {
		// 데이터 교환 
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}	
}

public class CallByValue2 {
	public static void main(String[] args) {
		A2 a1 = new A2();
		int x =  10, y = 20; // 데이터가 기본형인 경우
		a1.m1(x, y); // a1.m1(10, 20); 변수 x y를 전달한 것이 아니라 값을 전달한것
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
