package ch07;

public class Student extends Person {
	// 필드
	private String ban;
	
	// 생성자
	public Student(String name, int age, String ban) {
		setName(name); setAge(age); this.ban = ban;
	}

	// 메소드
	public String getBan() { // 반을 읽음
		return ban;
	}
	public void setBan(String ban) { // 반을 저장
		this.ban = ban;
	}
	
	void printSt() {
		print();
		System.out.println("반 : " + ban);
	}
}
