package ch11;

import java.util.TreeSet;
import java.util.Set;

public class Lotto2 { // TreeSet
	public static void main(String[] args) {
		// 중복도 방지하고 크기 순으로 정렬
		Set<Integer> lotto = new TreeSet<>();
		// 중복을 방지해서 검사 필요 없음
		while (lotto.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}
