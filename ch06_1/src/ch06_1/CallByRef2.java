package ch06_1;
class D2 {
	// 필드(멤버변수)
	int x;
	int y;
	
	// 메소드
	public void m1(D2 d) {
		int temp = d.x;
		d.x = d.y;
		d.y = temp;
		System.out.println("x = " + d.x);
		System.out.println("y = " + d.y);
		}
}

public class CallByRef2 {
	public static void main(String[] args) {
		D2 d1 = new D2();
		d1.x = 7;
		d1.y = 3;
		d1.m1(d1); // 참조형 변수 일때는 주소를 전달
		System.out.println("x = " + d1.x);
		System.out.println("y = " + d1.y);
		}
}
