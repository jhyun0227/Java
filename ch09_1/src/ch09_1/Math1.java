package ch09_1;

public class Math1 {
	public static void main(String[] args) {
		float f1 = 4.1f;
		float f2 = 4.7f;
		float f3 = -4.1f;
		float f4 = -4.7f;
		
		// Math Ŭ������ �޼ҵ尡 ���� static(����)�̶� ��ü ������ �ʿ� x
		// round : �ݿø� (5�̻��̸� �ø��� 4���ϸ� ����)
		// ceil : �ø� (������ ���� �̻��� ���� �߿��� ���� ���� ��)
		// floor : ���� (������ ���� ������ ���� �߿��� ���� ū ����)
		System.out.println("f1 = " + Math.round(f1));
		System.out.println("f1 = " + Math.ceil(f1));
		System.out.println("f1 = " + Math.floor(f1));
		System.out.println("f2 = " + Math.round(f2));
		System.out.println("f2 = " + Math.ceil(f2));
		System.out.println("f2 = " + Math.floor(f2));
		System.out.println("f3 = " + Math.round(f3));
		System.out.println("f3 = " + Math.ceil(f3));
		System.out.println("f3 = " + Math.floor(f3));
		System.out.println("f4 = " + Math.round(f4));
		System.out.println("f4 = " + Math.ceil(f4));
		System.out.println("f4 = " + Math.floor(f4));
	}
}
