package ch11;

import java.util.TreeSet;
import java.util.Set;

public class Lotto2 { // TreeSet
	public static void main(String[] args) {
		// �ߺ��� �����ϰ� ũ�� ������ ����
		Set<Integer> lotto = new TreeSet<>();
		// �ߺ��� �����ؼ� �˻� �ʿ� ����
		while (lotto.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}
