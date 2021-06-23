package ch07_1;

public class AnimalEx {
	public static void main(String[] args) {
		Animal[] animals = {new Pig(), new Bird(), new Fish()};
//		      ������
		for (Animal animal : animals) {
			animal.move();
			System.out.println("x = " + animal.x);
			if (animal instanceof Bird) {
				((Bird)animal).eat();
			}
		}
		System.out.println("========================");
		for (int i = 0; i < animals.length; i++) {
			animals[i].move();
			System.out.println("x = " + animals[i].x);
			if(animals[i] instanceof Bird) {
				((Bird)animals[i]).eat();
			}
		}
	}
}

// �θ�Ӽ��� �����ϰ� �ڽļӼ��� �����ڸ� �̿��Ҷ�
// ��������� �޼ҵ�� �θ��� �͸� ����� �����ϴ�.
// �׷��� �޼ҵ��� ��� �������̵��� �Ǿ����� �ڽ��� �޼ҵ常�� ���Ǿ�����.
