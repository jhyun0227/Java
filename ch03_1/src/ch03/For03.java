package ch03;

public class For03 {
	public static void main(String[] args) {
		int evenSum = 0, oddSum = 0;
		
		for (int i=1; i <=100; i++) {
			if (i % 2 == 0) {
				evenSum += i; // ¦�� �հ�			
			} else if (i % 2 == 1){
				oddSum += i; // Ȧ�� �հ�
			}
		}
		
		System.out.println("1~100 ¦�� �հ�� " + evenSum);
		System.out.println("1~100 Ȧ�� �հ�� " + oddSum);
		System.out.println("1~100 �հ�� " + (evenSum + oddSum)); // ���ڿ� + ���ڴ� ���ڿ��� �ν��ϱ� ������ ��ȣ�� ������
	}
}
