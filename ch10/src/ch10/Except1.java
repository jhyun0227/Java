package ch10;

public class Except1 {
	public static void main(String[] args) {
		int number = 100, result = 0;
		
		for (int i = 0; i < 10; i++) {
											// 0 ~ 9
			try { // try, catch ��
				result = number / (int) (Math.random() * 10);
			} catch (ArithmeticException e) { // e�� ũ�� �Ű�Ƚᵵ ��
				System.out.println("0���� ������" + e.getMessage());
			}
			System.out.println("������ ��� : " + result);
		}
	}
}

// ArithmeticException ���� : 0���� ��������