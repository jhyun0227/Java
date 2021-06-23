package ch03;

public class For03 {
	public static void main(String[] args) {
		int evenSum = 0, oddSum = 0;
		
		for (int i=1; i <=100; i++) {
			if (i % 2 == 0) {
				evenSum += i; // 짝수 합계			
			} else if (i % 2 == 1){
				oddSum += i; // 홀수 합계
			}
		}
		
		System.out.println("1~100 짝수 합계는 " + evenSum);
		System.out.println("1~100 홀수 합계는 " + oddSum);
		System.out.println("1~100 합계는 " + (evenSum + oddSum)); // 문자열 + 숫자는 문자열로 인식하기 때문에 괄호를 입혀줌
	}
}
