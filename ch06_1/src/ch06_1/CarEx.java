package ch06_1;
class Car {
	// �ʵ�(�������)
	String kind;
	int displacement;
	String color;
	
	// �ܺο��� kind, ��ⷮ, ���� �޾Ƽ� ��������� ����
	Car(String kind, int displacement, String color) {
		this.kind = kind; this.displacement = displacement; this.color = color;
		}
	
	// print() { // ����, ��ⷮ, ���� ���
	void print() {
		System.out.println("=================================");
		System.out.println("���� : " + kind);
		System.out.println("��ⷮ : " + displacement);
		System.out.println("�� : " + this.color);
	}
}

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car("�ҳ�Ÿ", 1500, "����");
		Car c2 = new Car("����", 2000, "�ʷ�");
		Car c3 = new Car("���", 1200, "���");
		
		c1.print(); c2.print(); c3.print();
	}
}
