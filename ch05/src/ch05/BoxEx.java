package ch05;

public class BoxEx {
	public static void main(String[] args) {
//	 Ŭ������ ���۷����� = new ������ (���� ����)
		Box box1 = new Box(); // �ν��Ͻ�ȭ
		box1.width = 10;
		box1.height = 10;
		box1.depth = 10;
		System.out.println("box1�� ���̴� " + box1.height);
		box1.calVolume();
		
		Box box2 = new Box();
		box2.width = 15;
		box2.height = 20;
		box2.depth = 25;
		System.out.println("box2�� ���̴� " + box2.depth);
		box2.calVolume();
	}
}

// ��ȯ���� void�� ��ȯ���� ����.
