package ch07_1;

public class Teacher2 extends Person2{ // Techer2 Ŭ������ Person2 Ŭ������ ��� 
	// �ʵ�(�������)
	private String subject;
	
	// ������
	public Teacher2(String name, int age, String subject) { // Person2 �����ڿ� ��
		super(name, age); this.subject = subject;
	}

	// �޼ҵ�(getter setter)
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	void print() { // �������̵�
		super.print();
		System.out.println("���� : " + subject);
	}
}
