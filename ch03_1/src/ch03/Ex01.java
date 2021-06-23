package ch03;

public class Ex01 {
	public static void main(String[] args) {
		int sum =0;	
		for (int i = 1; i <= 20; i++) {
			if (i%2 != 0 && i%3 != 0) {
				sum += i;
			}
		}
		System.out.println("합계 : " + sum);
	}
}

// 1~20 중 2와 3의 배수가 아닌 값의 합계