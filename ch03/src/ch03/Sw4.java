package ch03;

public class Sw4 { // ��ø �б⹮
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			switch (month) { // break �ϳ��� switch ����
			case 12 : msg = "��"; break;
			case 1 	: msg = "��"; break;
			case 2 	: msg = "��";
			}
			msg += "�ܿ�";
			break;
		case 3 :
		case 4 :
		case 5 :
			switch (month) { // break �ϳ��� switch ����
			case 3 : msg = "��"; break;
			case 4 : msg = "��"; break;
			case 5 : msg = "��";
			}
			msg += "��";
			break;
		case 6 :
		case 7 :
		case 8 :
			switch (month) { // break �ϳ��� switch ����
			case 6 : msg = "��"; break;
			case 7 : msg = "��"; break;
			case 8 : msg = "��";
			}
			msg += "����";
			break;
		case 9 :
		case 10 :
		case 11 :
			switch (month) { // break �ϳ��� switch ����
			case 9  : msg = "��"; break;
			case 10 : msg = "��"; break;
			case 11 : msg = "��";
			}
			msg += "����";
			break;
		default : msg = "���� ��";
		}
		System.out.println(msg + "�Դϴ�.");
	}
}
