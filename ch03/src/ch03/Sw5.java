package ch03;

public class Sw5 { // ��ø �б⹮
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		
		if (month % 3 == 0) {
			msg = "��";
		} else if (month % 3 == 1) {
			msg = "��";
		} else if (month % 3 == 2) {
			msg = "��";
		}
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			msg += "�ܿ�";
			break;
		case 3 :
		case 4 :
		case 5 :
			msg += "��";
			break;
		case 6 :
		case 7 :
		case 8 :
			msg += "����";
			break;
		case 9 :
		case 10 :
		case 11 :
			msg += "����";
			break;
		default : msg = "���� ��";
		}
		System.out.println(msg + "�Դϴ�.");
	}
}
