package ch05;
class Car3 {
	// static ����, Ŭ���� ����, ����(�����ϳ� �ٲ�� �ٰ��� �ٲ��)
	// ��ü�� �������� �ʰ� Ŭ������.���� �Ǵ� ��ü ���� �� �Ŀ� ����������.����
	// static ������ �ν��Ͻ� ����, �ݵ�� ��ü�� ������ �Ŀ� ���
	static String color;
	int displacement;
	String kind;

	// �޼ҵ�
	void print() {
		System.out.println("===========================");
		System.out.println("���� : " + color);
		System.out.println("��ⷮ : " + displacement);
		System.out.println("���� : " + kind);
	}
}

public class Var1Ex {
	public static void main(String[] args) {
		Car3.color = "���"; // Ŭ���� ������ color�� �������
		//Car3.kind = "�ҳ�Ÿ" // �ν��Ͻ� ������ ��ü ������ ����ؾ���
		
		Car3 c1 = new Car3();
		// c1.color = "����"; //���� �޼ҵ� ������ ������� Ŭ���� ������ ���������� �Ʒ��� �������� �ٲٸ� �ٸ� �ν��Ͻ� �������� ���� �������� �ٲ��.
		c1.displacement = 1500;
		c1.kind = "���";
	    c1.print();
		
		Car3 c2 = new Car3();
		c2.print();
		
		Car3 c3 = new Car3();
		c3.print();
	}
}