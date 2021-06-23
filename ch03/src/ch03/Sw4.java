package ch03;

public class Sw4 { // 중첩 분기문
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			switch (month) { // break 하나의 switch 종료
			case 12 : msg = "초"; break;
			case 1 	: msg = "찐"; break;
			case 2 	: msg = "늦";
			}
			msg += "겨울";
			break;
		case 3 :
		case 4 :
		case 5 :
			switch (month) { // break 하나의 switch 종료
			case 3 : msg = "초"; break;
			case 4 : msg = "찐"; break;
			case 5 : msg = "늦";
			}
			msg += "봄";
			break;
		case 6 :
		case 7 :
		case 8 :
			switch (month) { // break 하나의 switch 종료
			case 6 : msg = "초"; break;
			case 7 : msg = "찐"; break;
			case 8 : msg = "늦";
			}
			msg += "여름";
			break;
		case 9 :
		case 10 :
		case 11 :
			switch (month) { // break 하나의 switch 종료
			case 9  : msg = "초"; break;
			case 10 : msg = "찐"; break;
			case 11 : msg = "늦";
			}
			msg += "가을";
			break;
		default : msg = "없는 달";
		}
		System.out.println(msg + "입니다.");
	}
}
