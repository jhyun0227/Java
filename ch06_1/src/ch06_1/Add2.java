package ch06_1;
public class Add2 {
	public static void main(String[] args) {
		int result = add(10,20); // ����Ŭ������ �޼ҵ� ����ϴ� ���̱� ������ �޼ҵ������ ȣ��
		System.out.println("��� : " +  result);
		System.out.println("��� : " + add(10.5, 7.3));
	}
	
	
	private static int add(int i, int j) {
		return i + j;
	}
	
	private static double add(double d, double e) {
		return d + e;
	}
}

// private ���� ������ �� �ش� Ŭ���������� ��� �����ϰ� �ٸ� ��ü������ ������ �Ұ���
// static Ŭ����