package ch03;

public class Ex03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) { // ù��° �ֻ���
			for (int j = 1; j <= 6; j++) { // �ι�° �ֻ���
				if (i + j == 6) {
					System.out.printf("%d + %d = %d\n", i, j, i+j);
				}
			}
		}
	}
}

// �ֻ����� ������ �μ��� ���� 6�̵Ǵ� ��츦 ���
