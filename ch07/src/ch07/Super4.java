package ch07;
// this(), super() ������ �ش��ϴ� ������ �۾��� ������ ȣ���� ������ ���ƿͼ� �Ʒ� ���๮�� �۾��Ѵ�.
class H1 {
	// �ʵ�(�������)
	int x;
	
	// ������
	H1(int x) { // 7
		this.x = x; // 8
		System.out.println("�θ������ �Ű����� 1��"); // 9
	}
	H1(int x, int y) { // 5
		this(x); // 6
		System.out.println("x = " + x); // 10
	}
	
	// �޼ҵ�
	void print() {
		System.out.println("x = " + x); // 13
	}
}

class H2 extends H1 {
	// ������
	H2(int x, int y) { // 3
		super(x, y); // 4
		System.out.println("�ڽĻ����� �Ű����� 2��"); // 11
	}
	H2(int x, int y, int z) { // 1
		this(x, y); // 2
		System.out.println("�ڽĻ����� �Ű����� 3��"); // 12
	}
}

public class Super4 {
	public static void main(String[] args) {
		H2 h = new H2(34, 45, 67);
		h.print();
	}
}