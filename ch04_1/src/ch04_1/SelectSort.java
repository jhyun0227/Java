package ch04_1;

public class SelectSort {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		int temp;
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < score.length; j++) { // i+1을 하는 이유는 바로 다음 인덱스와 비교하기 때문
				  if (score[i] > score[j]) {
				//if (score[i] < score[j]) { // 큰값 교환
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+"\t");
		}
		System.out.println();
		for (int i : score) {
			System.out.print(i+"\t");
		}
	}
}