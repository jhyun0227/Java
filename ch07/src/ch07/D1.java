package ch07;

public class D1 {
	// �ʵ�(�������)
	String str1 = "���";
	
	// ������
	D1() {
		System.out.println("���� �����̾�");
	}
	
	//�޼ҵ�
	void m1() {
		System.out.println("���� ù��° �޼ҵ�");
    }
}

class D2 extends D1 {
	// �ʵ�(�������)
	String str2 = "�㰢";
		
	// ������
	D2() {
		System.out.println("���� �߰�����");
	}
		
	//�޼ҵ�
	void m2() {
		System.out.println("���� �߰� �޼ҵ�");
	}
}

class D3 extends D2 {
	// �ʵ�(�������)
	String str3 = "���";
		
	// ������
	D3() {
		System.out.println("���� ����");
	}
		
	//�޼ҵ�
	void m3() {
		System.out.println("���� �� �޼ҵ�");
	}
}

	
