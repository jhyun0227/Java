package ch11;

import java.util.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		String[] arr1 = {"J", "A", "V", "A"};
		// arr1의 갯수
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		// 인덱스 1부터 3앞까지 복사
		String[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		String[] arr4 = new String[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}
