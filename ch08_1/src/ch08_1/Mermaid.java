package ch08_1;
class Person2 {
	// �ʵ�(�������)
	int leg = 2;
	
	// �޼ҵ�
	void move() {
		System.out.println("�� �ٸ��� �ȴ´�.");
	}
}

interface Fish {
	// �߻�޼ҵ�
	void swim();
}

public class Mermaid extends Person2 implements Fish { // ����� ���ϻ��, �������̽��� ���߻���� ����
	@Override
	public void swim() { // �������̵�
		System.out.println("���ӿ��� ��ð� ���ģ��.");
	}
	
	public static void main(String[] args) { // �� �κ��� ��Ȯ�����ڸ� MermaidEx Ŭ������ ���� ������ ������ ���� ������ ����� �׳� �� Ŭ�������� �ۼ���
		Mermaid mr = new Mermaid();
		mr.move();
		mr.swim();
		System.out.println("�ٸ� ���� : " + mr.leg);
	}
}
