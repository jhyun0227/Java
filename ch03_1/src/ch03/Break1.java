package ch03;
public class Break1 {
	public static void main(String[] args) {
		// 반복문 빠져 나간다.
		int sum =0, i = 1;
		while(true) {
			sum += i;
			i++;
			if (i > 100) break;
		}
		System.out.println("합계 : " + sum);
	}
}