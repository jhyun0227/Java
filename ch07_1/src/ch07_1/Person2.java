package ch07_1;

public class Person2 {
	// 필드(멤버변수)
	private String name;
	private int age;
	
	// 생성자
	public Person2() {}
	Person2(String name, int age) {
		this.name = name; this.age = age;
	}
	
	// 메소드 (getter setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void print() { // 오버라이딩
		System.out.println("=============================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
