package ch06;
class B2 {
//  int�� ���� ����� ����
	int add(int x, int y) { // ��Ŵ� int�� �پ��ٰ� ��������� �ƴմϴ� �޼ҵ��Ӵϴ�.
		return x + y; // ��ȯ���� int�� return���� ����� int���� �Ѵ�.
	}

//  void(����ִ�) : ��ȯ�� ���� ���ٴ� �ǹ�
	void minus(int x, int y) {
		System.out.printf("%d - %d = %d\n", x, y, x-y);
	}
}
public class Return1 {
	public static void main(String[] args) {
		B2 b2 = new B2();
		System.out.println(b2.add(12, 3)); // add�� ����� ȣ���� ���� ��ȯ�ȴ�.
		int k = b2.add(10, 7);
		System.out.println("k = " + k);
//		System.out.println(b2.minus(12, 6)); // ����� ���� ��� ����
		b2.minus(12,6);
	}
}
