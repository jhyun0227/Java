package ch10;

public class Throw1 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

	private static void m2() /*throws Exception*/ {
		// ���⼭ ���ܸ� �߻� ��Ű�ڴ�.
		try {
			throw new Exception("��� ����"); // throw�� �Ϲ������� �����Ҷ� ��������ʰ� ������ ������ ������ üũ�Ҷ��� ���
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
