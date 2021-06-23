package ch19;

import java.util.Arrays;

public class MatchEx {
	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6 };
		// 전부 맞는가
		boolean result = Arrays.stream(intArr).allMatch(a -> a % 2 == 0);
		System.out.println("모두 짝수 : " + result);
		// 맞는게 하나라도 있는가
		result = Arrays.stream(intArr).anyMatch(a -> a % 3 == 0);
		System.out.println("3의 배수가 있나 : " + result);
		// 하나라도 맞는게 없는가
		result = Arrays.stream(intArr).noneMatch(a -> a % 3 == 0);
		System.out.println("3의 배수가 없나 : " + result);
	}
}
