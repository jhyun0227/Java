package ch06_1;
class Box {
	// �޼ҵ� �����ε�
	int volume(int x, int y, int z) {
		return x+y+z;
	}
	
	double volume(double x, double y, double z) {
		return x+y+z;
	}
}

public class OverLoading2 {
	public static void main(String[] args) {
		Box box = new Box();
		System.out.println("�����ڽ� ���� : " + box.volume(12, 15, 20));
		System.out.println("�Ǽ��ڽ� ���� : " + box.volume(12.5, 15.5, 20.3));
		System.out.println("�Ǽ��ڽ� ���� : " + box.volume(12.5, 15.5, 20)); // ������ �Ǽ��� ���Ե�
	}
}
