package ch04_1;

public class SecArr2 {
	public static void main(String[] args) {
		double[][] amount = {{23.45, 56.76, 12.34}, {56.21, 89.35, 78.99}};
		double sum = 0.0;
		for (int i = 0; i < amount.length; i++) {
			for (int j = 0; j < amount[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]" + amount[i][j] + "\t");
				sum += amount[i][j];
			}
			System.out.println("�հ�� " + sum); // %.2f\n �Ǽ� �Ҽ��� 2�ڸ� ���� ���
			sum = 0.0;
		}
		// Ȯ����
		for (double[] amt : amount) {
			for (double at : amt) {
				System.out.print(at + "\t");
				sum += at;
			}
			System.out.println("�հ�� " + sum);
			sum = 0.0;
		}
	}
}

