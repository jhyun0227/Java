package ch07_1;

public class Manager2 extends Person2{
	// 필드(멤버변수)
	private String part;
	
	// 생성자
	public Manager2(String name, int age, String part) {
		super(name, age); this.part = part;
	}

	// 메소드(getter setter)
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	void disp() {
		System.out.println("난 먹방 체질이야");
	}
	void print() { // 오버라이딩
		super.print();
		System.out.println("파트 : " + part);
	}
}
