package ch07_1;

public class Manager2 extends Person2{
	// �ʵ�(�������)
	private String part;
	
	// ������
	public Manager2(String name, int age, String part) {
		super(name, age); this.part = part;
	}

	// �޼ҵ�(getter setter)
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	void disp() {
		System.out.println("�� �Թ� ü���̾�");
	}
	void print() { // �������̵�
		super.print();
		System.out.println("��Ʈ : " + part);
	}
}
