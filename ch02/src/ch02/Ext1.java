package ch02;

public class Ext1 {
	public static void main(String[] args) {
		// \n 줄바꿈
		System.out.print("대박\n");
		System.out.println("사건");
		
		// \t tap만큼 옮김
		System.out.println("대박\t사건");
		
		// \뒤에 오는 문자는 특수기호가 아니고 문자 자체
		System.out.println("대\'사건");
		System.out.println("대\"사건");
		System.out.println("대\\사건");
	}
}
