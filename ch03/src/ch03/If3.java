package ch03;

public class If3 { // if else문
	public static void main(String[] args) {
		int i1 = Integer.parseInt(args[0]);
		String grade = "";
		if (i1 > 90) {
			grade = "A";
		}
		else if (i1 > 80) {
			grade = "B";
		}
		else if (i1 > 70) {
			grade = "C";
		}
		else if (i1 > 60) {
			grade = "D";
		}
		else grade = "권총";
		
		System.out.println("점수는 " + i1 + "이고 학점은 " + grade + "입니다.");
	}
}
