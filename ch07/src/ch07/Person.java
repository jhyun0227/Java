package ch07;

public class Person {
	// 필드(멤버변수)
	private String name;
	private int age;
	
	// 메소드 (getter setter)
	public String getName() { // 이름을 읽음
		return name;
	}
	public void setName(String name) { // 이름을 저장
		this.name = name;
	}
	public int getAge() { // 나이를 읽음
		return age;
	}
	public void setAge(int age) { // 나이를 저장
		this.age = age;
	}
	
	void print() {
		System.out.println("========================");
		System.out.println("이름 + " + name);
		System.out.println("나이 + " + age);
	}
}
