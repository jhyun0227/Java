package ch04_2;

public class Score1 {
	public static void main(String[] args) {
		String subject = "����ǥ";
		String[] name = {"BTS", "������", "���缮", "������ũ"};
		String[] title = {"�̸�", "����", "����", "����", "����", "���"};
		int[][] score = {{90, 80, 70}, {76, 86, 90}, {90, 78, 90}, {80, 80, 80}};
		int len = 44, sum = 0;
		int[] tot = new int[3]; // int[score[0].length] ���� �հ�
		
		System.out.println(subject);
		
		for (int i = 0; i < len; i++) {
			System.out.print("=");
		}
		
		System.out.println();
		
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		
		System.out.println();
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tot[j] += score[i][j];
			}
			System.out.println(sum + "\t" + sum/score[i].length);
			sum = 0;
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print("=");
		}
		
		System.out.print("\n�հ�\t");
		for (int j = 0; j < tot.length; j++) {
			System.out.print(tot[j] + "\t");
			sum += tot[j];
		}
		System.out.println(sum + "\t" + sum/tot.length + "(" + sum/tot.length/score.length + ")");
	}
}