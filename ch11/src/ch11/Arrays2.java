package ch11;

import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {
	public static void main(String[] args) {
		Integer[] score = {43, 98, 56, 78, 34};
		System.out.println(Arrays.toString(score));
		Arrays.sort(score); // 오름차순으로 정렬
		System.out.println(Arrays.toString(score));
		Arrays.sort(score, Collections.reverseOrder()); // 내림차순으로 정렬
		System.out.println(Arrays.toString(score));
		
		String[] name = {"다현", "하니", "재석", "보니", "모모"};
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		Arrays.sort(name, Collections.reverseOrder());
		System.out.println(Arrays.toString(name));
	}
}
