package ch05;

public class Car2Ex {
	public static void main(String[] args) {
	// Ŭ���� ���۷�����(��ü) = ������ ������ => ��ü����(�ν��Ͻ�ȭ); / �����ڴ� Ŭ������ �̸��� ���� �ڿ� ()�� ���´�.
		Car2 car1 = new Car2();
		Car2 car2 = new Car2();
		
		car1.name = "�ҳ�Ÿ";
		car1.displacement = 1500; // ������ ���� �������� �ʾ� default �� ������ ���
		car1.print(); // ���۷�����.�޼����
		
		car2.color = "��ũ";
		car2.displacement = 3000; // �� ������ ���� �������� �ʾ� default �� BMW�� ���
		car2.print();
	}
}