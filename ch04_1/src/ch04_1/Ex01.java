package ch04_1;

public class Ex01 {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		// 최대값은 작은 값, 최소값은 큰값으로 초기화
		// 범위를 벗어나는 큰 값이 최대값이면 안됨
		// 최소값이 범위를 벗어나는 작은 값으로 초기화 하면 안됨
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
		
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + sum/score.length);
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);
		System.out.println("===================================");
		
		sum = 0; max = 0; min = 100; // 다시 초기화
		// 확장 for
		for (int sc : score) { // 확장 for은 index가 없어서 편리함
			sum += sc;
			if (max < sc) {
				max = sc;
			}
			if (min > sc) {
				min = sc;
			}
		}
		float avg = (float)sum/score.length;
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + avg);
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);
	}
}