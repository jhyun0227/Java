package ch11;

import java.util.Arrays;
import java.util.Collections;

public class ArraysMember2 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("혜리", 21);
		Member2 m2 = new Member2("재석", 48);
		Member2 m3 = new Member2("원빈", 35);
		Member2 m4 = new Member2("하니", 27);
		Member2 m5 = new Member2("경규", 60);
		Member2[] members = {m1, m2, m3, m4, m5};
		
		System.out.println(Arrays.toString(members));
		Arrays.sort(members); // 이름 기준 오름차순
		System.out.println(Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder()); // 내림차순
		System.out.println(Arrays.toString(members));
	}
}
