package ch19;

import java.util.Arrays;

public class LoopingEx1 {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		// 동작하지 않음 : peak 중간 단계
		Arrays.stream(intArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n));
		// sum()은 최종 단계
		int total = Arrays.stream(intArr).filter(a -> a % 2 == 0)
				.peek(n -> System.out.println(n)).sum();
		System.out.println("합계 : " + total);
		// forEach() 최종 단계
		Arrays.stream(intArr).filter(a -> a % 2 == 0).forEach(n -> System.out.println(n));
	}
}
