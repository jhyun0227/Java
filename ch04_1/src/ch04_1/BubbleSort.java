package ch04_1;
public class BubbleSort {
	public static void main(String[] args) {
		int[] score = {76,45,34,89,100,50,90,92};
		int temp;         // 두개씩 비교
		for (int i = 0; i <score.length - 1; i++) {
			//                              뒤부터 하니씩 setting
			for (int j = 0; j < score.length - (i+1); j++) {
				if (score[j]  > score[j+1]) {
					temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
		for(int i : score) {
			System.out.print(i+"\t");
		}
	}
}

// SelectSort 만 알아도 됨