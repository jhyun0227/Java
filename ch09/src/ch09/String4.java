package ch09;

public class String4 {
	public static void main(String[] args) {
		//            012 345 6789 01234 567 890 12 :글자수(인덱스) 23
		String str = "우리는 친구였어, 곁에 있으면 든든한 친구";
		
		// 인덱스 5부터 10번 앞에까지 출력
		String str1 = str.substring(5, 10);
		System.out.println(str1);
		
		System.out.println("===================================");
		
		// 공란(" ") 구분하여 배열 strs를 만들고 배열 데이터 출력
		String[] strs = str.split(" ");
		for (String st : strs) {
			System.out.println(st);
		
			if (st.endsWith("는")) { // 배열 데이터 중에서 '는'으로 끝나는 단어 출력
				System.out.println("는으로 끝" + st);
			}
			if (st.startsWith("든")) { // 배열 데이터 중에서 '든'으로 시작하는 단어 출력
				System.out.println("든으로 시작" + st);
			}
		}
		
		System.out.println("===================================");
		
		// 글자를 뒤집어서 출력
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)); // 해당하는 인덱스의 문자 한자
		}
		
		System.out.println("\n===================================");
		
		System.out.println(str.indexOf(","));
	}
}
