package ch05;
class Car4 {
	// �������
	String color;
	int displacement; 
	String kind;
	
	// ������ / ��� Ŭ������ �����ڰ� �־���Ѵ�.
	// �����ڰ� �ϳ��� ������ compile �� �� �ڵ����� default �����ڸ� ����� �ش�.
	// default ������ : �Ű������� �ϳ��� ���� ������
	Car4(/*���� ���� ���� �Ű�����*/) { }  // �갡 default ������
	Car4(String color, int displacement, String kind) {
		this.color = color; this.displacement = displacement; this.kind = kind;
	} // �Ű������� �ִ� ������, �����ڸ� ���� �ɹ����� �ʱ�ȭ
	// ������ �̸��� ������ �Ű������� �ٸ� ��츦 ������ �����ε��̶�� ��
	
	// �޼ҵ�
	void print() {
		System.out.println("===================================");
		System.out.println("���� : " + kind);
		System.out.println("��ⷮ : " + displacement);
		System.out.println("���� : " + color);
		System.out.println("===================================");
	}
}

public class Const1 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.color = "�Ķ�";
		c1.displacement = 1000;
		c1.kind = "���";
		c1.print();
		
		Car4 c2 = new Car4("���", 2000, "�ҳ�Ÿ");
		c2.print();
	}
}
