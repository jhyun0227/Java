package ch04;

public class StrArr1 {
//  java 패키지명/프로그램 첫 두번 세번
	public static void main(String[] args) {
		for (String str : args ) {
			System.out.println(str);
		}
		System.out.println("================");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
