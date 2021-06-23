package ch04;

public class ScoreCal {
	public static void main(String[] args) {
		// 시험 점수
		int kim = 80, choi = 95, park = 88, kang = 94, lee = 60;
		// 합계와 총점
		int tot = kim + choi + park + kang + lee;
		System.out.println("합계 = " + tot + ", 평균 : " + tot/5);
		
		int[] score = {80, 95, 88, 94, 60};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("합계 = " + sum + ", 평균 : " + sum/score.length);
	}
}
