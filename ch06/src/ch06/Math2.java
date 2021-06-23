package ch06;
class A2 {
	void divide(int x, int y) {
		if(y != 0) {
			System.out.printf("%d / %d = %d\n", x, y, x/y);
		} else {
			System.out.println("나눌수 없습니다.");
		}
	}
}

public class Math2 {
	public static void main(String[] args) {
		A2 a1 = new A2();
		a1.divide(10, 2);
		a1.divide(12, 4);
		a1.divide(7, 0);
		a1.divide(16, 4);
	}
}
