package ch06_1;

public class Return3 {
	public static void main(String[] args) {
		String[] name = {"보라", "세정", "뷰", "문수"};
		for (String n : name) {
			String msg = Return3.call(n);  // 메인이 있는 클래스명과 메소드가 있는 메소드명이 같기때문에 Return3은 생략이 가능
			System.out.println(msg);
		}
	}
	
	private static String call (String name) {
		return name + "님 안녕하세요";
	}
}
