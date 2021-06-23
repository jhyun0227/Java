package ch06_1;
class E1 {
	// 멤버변수
	int x, y;
	
//  E1() { } <- 생성자 생략
	
	// 메소드
	void m1(int a1, int a2) {
		//각각 10씩 증가 후 출력
		a1 += 10;
		a2 += 10;	
		System.out.println("x = " + a1);
		System.out.println("y = " + a2);
	}
	
	void m2(E1 e) {
		//e의 x, y에 10증가 후 출력
		e.x += 10;
		e.y += 10;
		System.out.println("e.x = " + e.x);
		System.out.println("e.y = " + e.y);
	}
}
public class CallTest1 {
	public static void main(String[] args) {
		int x = 8, y = 12;
		E1 e1 = new E1();
		//m1을 호출하고 x, y 출력
		e1.m1(x, y); // callByValue 값을 전달하므로 변수는 서로 다른 변수로 생각한다.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		//E1 e객체 생성하고 객체의 x와 y에 8과 12대입하고
		//e객체의 x, y출력
		e1.x = 8;
		e1.y = 12;
		e1.m2(e1); // callByReference는 주소를 전달하므로 주소에 있는 실제 값은 같이 변경
		System.out.println("e1.x = " + e1.x);
		System.out.println("e1.y = " + e1.y);
	}
}
