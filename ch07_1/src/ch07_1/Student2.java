package ch07_1;

public class Student2 extends Person2 {
	// �ʵ�(�������)
	private String ban;
	
	// ������
	public Student2(String name, int age, String ban) {
		super(name, age); this.ban = ban;
	}

	// �޼ҵ�(getter setter)
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	void print() { // �������̵�
		super.print();
		System.out.println("�� : " + ban);
	}
}
