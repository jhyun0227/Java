package ch07;

public class Teacher extends Person {
	// 필드(멤버변수)
	private String subject;
	
	// 생성자
	public Teacher(String name, int age, String subject) {
		setName(name); setAge(age); this.subject = subject;
	}

	// 메소드
	public String getSubject() { // 전공을 읽음
		return subject;
	}
	public void setSubject(String subject) { // 전공을 저장
		this.subject = subject;
	}
	
	void printTh() {
		print();
		System.out.println("전공 : " + subject);
	}
}
