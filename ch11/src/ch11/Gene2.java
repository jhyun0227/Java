package ch11;

import java.util.ArrayList;

public class Gene2 {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Bus()); list.add(new Taxi());
		list.add(new FireEngine()); // list.add(new Ambulance());
		// Generic�� Ŭ����/�������̽��� ����ϸ� �� Ŭ����/�������̽� �Ǵ� �󺹹��� Ŭ����, ������ Ŭ������ ��밡���ϴ�.
		
		// ������ ��ü�� ����Ͽ� print ����
		// �� ��ü�� Bus ��ü�� move()����
		for (Car car : list) {
			car.print();
			if (car instanceof Bus) {
				((Bus)car).move();
			}
		}
	}
}