package ch04_2;

public class Lotto1 {
	public static void main(String[] args) {
		// 1 ~ 45������ ��
		int temp = 0;
		int[] lotto = new int[6];
		System.out.println("�ζ� ���ϴ� ��ȣ�� �Է��ϼ���.");
		for (int i = 0; i < lotto.length; i++) {
			 //        0 ~ 44   0.00001 ~ 44.9999
			lotto[i] = (int)(Math.random() * 45) + 1;
			// �տ� �����Ϳ� ���ؼ� ������ �ٽ� ���� ���� �ε��� 0����
			for (int j = i-1;j >=0; j--) { 
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		for(int i =0; i < lotto.length;i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for (int i =0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}