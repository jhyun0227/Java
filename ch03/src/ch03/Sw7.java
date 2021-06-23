package ch03;

public class Sw7 {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);
		String grade = "";
		
		switch (salary/1000000) {
		case 9 :
		case 8 : grade = "B"; break;
		case 7 :
		case 6 : grade = "C"; break;
		case 5 :
		case 4 : grade = "D"; break;
		case 3 :
		case 2 : grade = "E"; break;
		case 1 :
		case 0 : grade = "F"; break;
		default : grade = "A";
		}
		System.out.println("급여는 " + salary + "이고 등급은 " + grade + "입니다.");
		
		/* 조건문과 선택문을 함께 사용할 수도 있다.
		if (salary > 10000000) {
		  grade = "A"
		} else
		switch (salary/1000000) {
		case 9 :
		case 8 : grade = "B"; break;
		case 7 :
		case 6 : grade = "C"; break;
		case 5 :
		case 4 : grade = "D"; break;
		case 3 :
		case 2 : grade = "E"; break;
		case 1 :
		case 0 : grade = "F"; break;
		} */
	}
}
