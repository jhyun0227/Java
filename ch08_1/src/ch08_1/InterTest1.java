package ch08_1;
class D1 {
	// �޼ҵ�
//  ��ȯ�� ���۷�����(������Ÿ�� �Ű�������)	 
	void m1(D2 d) { // ���԰���
		d.b1();
	}
	
	void m1(D3 d) {
		d.b1();
	}
}

class D2 {
	void b1() {
		System.out.println("���");
	}
}

class D3 {
	void b1() {
		System.out.println("�ʹ�");
	}
}

public class InterTest1 {
	public static void main(String[] args) {
		D2 d2 = new D2();
		D1 d1 = new D1();
		d1.m1(d2);
		D3 d3 = new D3();
		d1.m1(d3);
	}
} 

// Spring ���� �� �˰Ե�
