package ch07;

public class Teacher extends Person {
	// �ʵ�(�������)
	private String subject;
	
	// ������
	public Teacher(String name, int age, String subject) {
		setName(name); setAge(age); this.subject = subject;
	}

	// �޼ҵ�
	public String getSubject() { // ������ ����
		return subject;
	}
	public void setSubject(String subject) { // ������ ����
		this.subject = subject;
	}
	
	void printTh() {
		print();
		System.out.println("���� : " + subject);
	}
}
