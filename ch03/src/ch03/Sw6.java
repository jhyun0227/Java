package ch03;

public class Sw6 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		// 90 A, 80 B, 70 C, 60 D, ������ F
		switch (score / 10) { // ���� / ���� = INT
		// case ���ǿ��� ������ ������ ���;��Ѵ�.
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; 
		}
		System.out.println(grade + "�����Դϴ�.");
	}
}
