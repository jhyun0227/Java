package ch07;

public class Person {
	// �ʵ�(�������)
	private String name;
	private int age;
	
	// �޼ҵ� (getter setter)
	public String getName() { // �̸��� ����
		return name;
	}
	public void setName(String name) { // �̸��� ����
		this.name = name;
	}
	public int getAge() { // ���̸� ����
		return age;
	}
	public void setAge(int age) { // ���̸� ����
		this.age = age;
	}
	
	void print() {
		System.out.println("========================");
		System.out.println("�̸� + " + name);
		System.out.println("���� + " + age);
	}
}
