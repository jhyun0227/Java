package ch04;

public class ArrayEx1 {
	public static void main(String[] args) {
		char[] ch = {'J', 'a', 'v', 'a'};
		// Ȯ���� for
		for (char a : ch) {
			System.out.println(a);
		}
		// �⺻�� for
		for (int i = 0; i < ch.length; i++) {
			System.out.println("ch[" + i + "] = " + ch[i]);
		}
	}
}
