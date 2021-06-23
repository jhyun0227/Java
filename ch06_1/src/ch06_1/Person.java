package ch06_1;

public class Person { // 멤버변수는 private으로 하고 메서드를 public으로 하여 데이터 읽거나 저장
	// 필드(멤버변수)
	private String name;
	private int age;
	
	// 메소드 (getter setter)
	public int getAge() { // 데이터 읽을때
		return age;
	}
	
	public void setAge(int age) { // 데이터 변수값 저장
		if(age < 0) {
			System.out.println("나이가 음수가 어딨어");
			age = 0;
		}
		else this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("======================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
