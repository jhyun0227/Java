package ch04_1;

public class Ex01 {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		// �ִ밪�� ���� ��, �ּҰ��� ū������ �ʱ�ȭ
		// ������ ����� ū ���� �ִ밪�̸� �ȵ�
		// �ּҰ��� ������ ����� ���� ������ �ʱ�ȭ �ϸ� �ȵ�
 	    int sum = 0, max = 0, min = 100;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			
			/*
			if (max < score[i]) max = score[i];
			if (min > score[i]) min = score[i];
			*/	
			
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.println("�հ�� : " + sum);
		System.out.println("����� : " + sum/score.length);
		System.out.println("�ִ밪�� : " + max);
		System.out.println("�ּҰ��� : " + min);
		System.out.println("===================================");
		
		sum = 0; max = 0; min = 100; // �ٽ� �ʱ�ȭ
		// Ȯ�� for
		for (int sc : score) { // Ȯ�� for�� index�� ��� ����
			sum += sc;
			if (max < sc) {
				max = sc;
			}
			if (min > sc) {
				min = sc;
			}
		}
		float avg = (float)sum/score.length;
		System.out.println("�հ�� : " + sum);
		System.out.println("����� : " + avg);
		System.out.println("�ִ밪�� : " + max);
		System.out.println("�ּҰ��� : " + min);
	}
}