package ch07_1;

public class Person2 {
	// �ʵ�(�������)
	private String name;
	private int age;
	
	// ������
	public Person2() {}
	Person2(String name, int age) {
		this.name = name; this.age = age;
	}
	
	// �޼ҵ� (getter setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void print() { // �������̵�
		System.out.println("=============================");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
