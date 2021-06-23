package ch07;

public class Manager extends Person {
	// 필드(멤버변수)
	private String part;
	
	// 생성자
	public Manager(String name, int age, String part) {
		setName(name); setAge(age); this.part = part;
	}

	// 메소드
	public String getPart() { // 직책을 읽음
		return part;
	}
	public void setPart(String part) { // 직책을 저장
		this.part = part;
	}
	
	void printMg() {
		print();
		System.out.println("파트 : " + part);
	}	
}
