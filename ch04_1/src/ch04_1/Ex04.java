package ch04_1;

public class Ex04 {
	public static void main(String[] args) {
		int[] coinUnit = {50000, 10000, 5000, 1000};
		int money = 372000;
		
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.printf("%d원짜리 : %d장\n", coinUnit[i], money/coinUnit[i]);
			money %= coinUnit[i];
		}
	}
}
