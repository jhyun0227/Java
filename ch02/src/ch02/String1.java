package ch02;

public class String1 {
	public static void main(String[] args) {
		String name = "길동";
		String greeting = "안녕"; // '안녕'; 작은 따옴표는 문자
		String a = name + greeting; // 문자열의 합은 연결
		System.out.println("a = " + a);
		
		// 0 12 3 : index
		// 길동안녕
		// substring(시작 index, index 앞)  데이터 일부 추출 1, 2 선택이라 "동안"이 나옴
		System.out.println(a.substring(1,3));
		
		// equals 문자열끼리 같은가 하는 비교
		System.out.println(name.equals(greeting));
		System.out.println(name.equals(name));
		System.out.println(name.equals("길동"));
	}
}
