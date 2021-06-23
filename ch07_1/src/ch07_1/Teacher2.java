package ch07_1;

public class Teacher2 extends Person2{ // Techer2 클래스는 Person2 클래스에 상속 
	// 필드(멤버변수)
	private String subject;
	
	// 생성자
	public Teacher2(String name, int age, String subject) { // Person2 생성자에 들어감
		super(name, age); this.subject = subject;
	}

	// 메소드(getter setter)
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	void print() { // 오버라이딩
		super.print();
		System.out.println("과목 : " + subject);
	}
}
