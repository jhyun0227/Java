package ch03;

public class Sw3 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		switch(month) {
		case 12 :
		case 1 :
		case 2 : msg = "겨울"; break;
		case 3 :
		case 4 :
		case 5 : msg = "봄"; break;
		case 6 :
		case 7 :
		case 8 : msg = "여름"; break;
		case 9 :
		case 10 :
		case 11 : msg = "가을"; break;
		default : msg = "없는 달";
		}
		System.out.println(msg + "입니다.");
	}
}
