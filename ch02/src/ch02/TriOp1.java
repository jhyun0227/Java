package ch02;

public class TriOp1 {
	public static void main(String[] args) {
		int i1 = 7;
		System.out.println(i1 + "°¡ Â¦¼ö´Ï?");
		
		//                Á¶°Ç      ?  true : false
		String str = (i1 % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";
		System.out.println(i1 + "Àº " + str);
	}
}
