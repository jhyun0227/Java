package ch04;

public class ArrayEx1 {
	public static void main(String[] args) {
		char[] ch = {'J', 'a', 'v', 'a'};
		// 확장형 for
		for (char a : ch) {
			System.out.println(a);
		}
		// 기본형 for
		for (int i = 0; i < ch.length; i++) {
			System.out.println("ch[" + i + "] = " + ch[i]);
		}
	}
}
