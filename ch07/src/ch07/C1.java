package ch07;

// ���� ���ϱ� ���� �� �ҽ����Ͽ� 3���� Ŭ���� ������ ��������� ������ 1���� �ҽ����Ͽ� 1���� Ŭ������ ����ȴ�.
public class C1 { // supertype, parent �θ� Ŭ����
	// �ʵ�
	private String c1 = "���";
	
	// ������
	C1() {
		System.out.println("���� �Ҿƹ��� ������");
	}
	
	// �޼ҵ�
	void c11() { 
		System.out.println("�� �Ҿƹ��� �޼ҵ�");
	}
}

class C2 extends C1 { // supertype(subtype), parent(child) �θ��̸鼭 �ڽ� Ŭ����
	// �ʵ�
	int c2 = 56;
	
	// ������
	C2() {
		System.out.println("���� �ƹ��� ������");
	}
		
	// �޼ҵ�
	private void c21() {
		System.out.println("�� �ƹ��� �޼ҵ�");
	}
}

class C3 extends C2 { // subtype, child �ڽ� Ŭ����
	// �ʵ�
	int c3 = 77;
	
	// ������
	C3() {
		System.out.println("���� �ڽ� ������");
	}
		
	// �޼ҵ�
	void c31() {
		System.out.println("�� �ڽ� �޼ҵ�");
	}
}