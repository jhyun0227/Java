package ch06_1;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		System.out.println("�̸� : "+p1.getName());
//		p1.age = -35; �޼ҵ带 ������� �ʰ� �����ϸ� �޼��忡�� �����͸� üũ�� �� ����.
		
		Person p2 = new Person();
		p2.setName("����");
		p2.setAge(-25); // üũ �� �� �ִ�.
		
//		p1.print();
		p2.print();
	}
}
