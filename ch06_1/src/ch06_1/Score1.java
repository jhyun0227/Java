package ch06_1;

public class Score1 {
	// this�� ������ ��ü �ڽ�, this() Ŭ���� ���� �ٸ� ������
	// this(�Ű�����, ...) ���� Ŭ�������� �ٸ� ������ ȣ��
	// this() �����ڸ� �ٷ� �Ʒ� ��ġ
	public Score1() { // 5
		System.out.println("�Ű������� ���� ������"); // 6
	}
	
	public Score1(String name) { // 3
		this(); // 4
		System.out.println("�Ű����� �̸� : " + name); // 7
	// this(); ������ ������ ù��° �ٿ� �־�� �Ѵ�.
	}
	
	public Score1(String name, int kor) { // 1
		this(name); // 2
		
		System.out.println("�Ű����� �̸� : " + name + ", ���� : " + kor); // 8
	}
	
	void print() {
		System.out.println("���"); // 9
	}
}
