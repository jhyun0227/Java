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
			System.out.println("합계는 " + sum); // %.2f\n 실수 소숫점 2자리 까지 출력
			sum = 0.0;
		}
		// 확장형
		for (double[] amt : amount) {
			for (double at : amt) {
				System.out.print(at + "\t");
				sum += at;
			}
			System.out.println("합계는 " + sum);
			sum = 0.0;
		}
	}
}

