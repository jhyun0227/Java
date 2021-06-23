package ch07_1;

public class Student2 extends Person2 {
	// 필드(멤버변수)
	private String ban;
	
	// 생성자
	public Student2(String name, int age, String ban) {
		super(name, age); this.ban = ban;
	}

	// 메소드(getter setter)
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	void print() { // 오버라이딩
		super.print();
		System.out.println("반 : " + ban);
	}
}
