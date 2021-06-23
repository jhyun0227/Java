package ch05;

public class Person {
	// 필드(멤버 변수)
	String name; int age; String hobby;
	
	// 생성자 오버 로딩 : 같은 클래스 내에서 생성자가 여러개인 경우
	// 생성자 매개변수의 갯수가 다르거나 데이터 형이 다르다
	Person() {}
	Person(String n) {
		name = n;
	}
	Person(String n, int a) {
		name = n; age =  a;
	}
	Person(String n, int a, String h) {
		name = n; age =  a; hobby = h;
	}
	
	void print() {
		System.out.println("========================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("취미 : " + hobby);
	}
	
}
