package ch03;

public class Sw2 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String msg = "";
		switch(num) {
		case 1 : msg = "�ȳ��ϼ���."; break;
		case 2 : msg = "�ݰ����ϴ�."; break;
		case 3 : msg = "ó�� �˰ڽ��ϴ�."; break;
		default : msg = "��������";
		}
		System.out.println(msg);
	}
}
