package ch02;

public class TriOp1 {
	public static void main(String[] args) {
		int i1 = 7;
		System.out.println(i1 + "�� ¦����?");
		
		//                ����      ?  true : false
		String str = (i1 % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(i1 + "�� " + str);
	}
}
