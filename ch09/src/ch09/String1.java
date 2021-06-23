package ch09;

public class String1 {
	public static void main(String[] args) {
		String str1 = "java"; // 데이터가 기본형 처럼 생성
		String str2 = "java";
		String str3 = new String("java");
		
		if (str1.equals(str2)) {
			System.out.println("Str1과 Str2는 같다.");
		} else {
			System.out.println("Str1과 Str2는 다르다.");
		}
		
		if (str2.equals(str3)) {
			System.out.println("Str2과 Str3는 같다.");
		} else {
			System.out.println("Str2과 Str3는 다르다.");
		}
		
		System.out.println("======================================");
		
		if (str1 == str2) {
			System.out.println("Str1과 Str2는 같다.");
		} else {
			System.out.println("Str1과 Str2는 다르다.");
		}
		
		if (str2 == str3) {
			System.out.println("Str2과 Str3는 같다.");
		} else {
			System.out.println("Str2과 Str3는 다르다.");
		}
		
//		== 주소까지 같은가, equals는 내용까지만 같으냐
	}
}
