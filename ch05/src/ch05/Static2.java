package ch05;
class A2 {
	int num1; // �����Ҷ� �ʱ� ���� �׻� 0
	static int num2; // ����� ���� �����ؼ� ������ ������ �� �߰�
	
// ������ ����	
	
	void print() {
		System.out.println("num1 = " + ++num1 + "num2 = " + ++num2);
	}
}

public class Static2 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { //a2.print �� 5�� �ݺ�
			A2 a2 = new A2();
			a2.print();
		}
		A2 a3 = new A2();
		a3.print(); // Ŭ���� ������ ������ ���� �ݺ������� �̹� 5��� ���� ����Ǿ������� �� �� �ִ�.
					// Ŭ���� ������ ��ü������ �ٸ��� �� ��ü���� ���� �ʱ�ȭ �Ǵ°��� �ƴ϶� �� Ŭ������ ����ؼ� ������� �� �� ����
	}
}
