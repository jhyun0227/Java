package ch06_1;

public class Person { // ��������� private���� �ϰ� �޼��带 public���� �Ͽ� ������ �аų� ����
	// �ʵ�(�������)
	private String name;
	private int age;
	
	// �޼ҵ� (getter setter)
	public int getAge() { // ������ ������
		return age;
	}
	
	public void setAge(int age) { // ������ ������ ����
		if(age < 0) {
			System.out.println("���̰� ������ �����");
			age = 0;
		}
		else this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("======================");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
