package ch07;

public class Manager extends Person {
	// �ʵ�(�������)
	private String part;
	
	// ������
	public Manager(String name, int age, String part) {
		setName(name); setAge(age); this.part = part;
	}

	// �޼ҵ�
	public String getPart() { // ��å�� ����
		return part;
	}
	public void setPart(String part) { // ��å�� ����
		this.part = part;
	}
	
	void printMg() {
		print();
		System.out.println("��Ʈ : " + part);
	}	
}
