package ch03;

public class If4 { // if else 문
	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		String msg = "";
		if (money > 1000000) {
			msg = "비행기 타세요.";
		} else if (money > 100000) {
			msg = "KTX 타세요.";
		} else if (money > 50000) {
			msg = "택시 타세요.";
		} else if (money > 10000) {
			msg = "버스 타세요.";
		} else {
			msg = "걸어가세요.";
		}
		
		System.out.println(msg);
	}
}
