package ch07;
class B {
	// �ʵ�(�������)
	int age = 20;
	
	// �޼���
	void b() {
		System.out.println("���");
	}
}

class B1 extends B { // B1 Ŭ������ B Ŭ������ ��ӹ޾Ѵ� 
	// �ʵ�(�������)
	String hobby = "���";
	
	// �޼���
	void b1() {
		System.out.println("�����̾�");
	}
}

class B2 extends B {  // B2 Ŭ������ B Ŭ������ ��ӹ޾Ѵ�
	// �ʵ�(�������)
	String part = "û��";
	
	// �޼���
	void b2() {
		System.out.println("������ �ð��̴�.");
	}
}

public class Inher2 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		System.out.println("���� : " + b1.age);
		System.out.println("��� : " + b1.hobby);
		b1.b(); b1.b1();
		
		B2 b2 = new B2();
		System.out.println("���� : " + b2.age);
		System.out.println("��� : " + b2.part);
		b2.b(); b2.b2();
	   
	    
	}
}  

// �θ� Ŭ������ �ִ� �ڽ� Ŭ������ �ν��Ͻ�ȭ �Ͽ� ��ü�� ���������� �θ�Ŭ������ ��������� �޼ҵ带 �̿��� �� �ִ�.
