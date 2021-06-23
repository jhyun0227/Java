package ch07_1;
// ��������� �޼ҵ尡 �θ�� �ڽ� ��Ӱ��� �̸��� ������
// ��������� �θ��� ���� �޼ҵ�� �ڽ��� ���� ����
public class Car3Ex {
	public static void main(String[] args) {
//		FireEngine3 fe = new FireEngine3(); ���� �̸� ����
//		FireEngine3 fe = new Car3(); // ������ ���� ���� ū ���� ���� �� ����
		// �θ� �����ϰ� = �ڽ��� ���� // up casting
		Car3 car1 = new FireEngine3();
		Car3 car2 = new Ambulance3();
		Car3 car3 = new Bus3();

//		�θ� �����ϰ� �����ϸ� �θ� ������ �ִ� �޼���� ��������� ��� ����
//		�׷��� ���� ����Ǵ� �޼ҵ尡 �������̵� �� �޼ҵ� �� ��� �ڽĸ޼ҵ尡 ���
		car1.drive();
		car2.drive();
		car3.drive();

//		�θ� �����ϰ� �ڽ��� �����ϸ� �θ� ������ �ִ� �޼���� ��������� ��밡��	
//		car1.fire();
		
		System.out.println("===========================");
		
		Car3[] cars = {car1, car2, car3};
		for (Car3 car : cars) {
			if(car instanceof FireEngine3) { // �ν��Ͻ� ���� ���ڵ��� Ÿ������ Ȯ��
//			FireEngine3 fe = (FireEngine3)car; // car1�� ��������� �������� ����
//			fe.fire();
			((FireEngine3)car).fire();
			System.out.println(car.color);
			}
//			��������� ������ ����Ǵ� �θ� ���� ��
			System.out.println(car.color);
			car.drive(); // �������̵� �Ǿ �ڽĸ޼ҵ� ����
		}
		
		System.out.println("===========================");
		Car3[] car = {car1, car2, car3};
		for (int i = 0; i < car.length; i++) {
			car[i].drive(); // �������̵� �Ǿ �ڽĸ޼ҵ� ����
		}
	}
}
