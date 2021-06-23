package ch07;

public class Inher3 {
	public static void main(String[] args) {
		// 상속 : 부모 클래스부터 생성자를 생성시키고
		// 부모의 필드(멤버변수)와 메서드를 자기의 것처럼 사용이 가능
		C3 c3= new C3(); // 생성자는 위부터 상속
		// 따로 상위클래스의 상속자 호출이 없을경우 자동으로 기본생성자 호출이 생성되어진다.
		
		//private이 있는 메서드 또는 멤버변수는 상속이 안된다.
		
		// System.out.println("c1 = " + c3.c1); // 할아버지의 필드 사용 but private 상속 불가
		System.out.println("c2 = " + c3.c2); // 아버지의 필드 사용
		System.out.println("c3 = " + c3.c3);
		
		c3.c11(); // 할아버지의 메소드 사용
		// c3.c21(); // 아버지의 메소드 사용 but private 상속 불가
		c3.c31();
	}
}