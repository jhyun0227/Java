package ch03;

public class Sw1 { // 선택문
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		// num에 들어온 정수가 있는 case문으로 가라
		// break는 switch문을 끝내라
		switch(num) {
		case 1 : System.out.println("L"); break;
		case 2 : System.out.println("O"); break;
		case 3 : System.out.println("V"); break;
		case 4 : System.out.println("E"); break;
		default : System.out.println("1,2,3,4중에 하나를 입력하세요.");
		}
	}
}

// switch 문은 break가 필수로 붙는다