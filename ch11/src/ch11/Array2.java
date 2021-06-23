package ch11;

import java.util.ArrayList;

public class Array2 {
	 public static void main(String[] args) {
		// 배열보다 데이터 추가, 삭제가 쉽다. 속도는 배열이 빠르다.
		ArrayList<String> al = new ArrayList<>();
		al.add("사과"); al.add("수박"); al.add("바나나");
		al.add("딸기"); al.add("수박");
		prn(al);
		al.add(2, "키위"); // 2번 인덱스에 키위 추가 2부터 뒤에있는 데이터가 하나씩 뒤로 밀림
		prn(al); // 2부터 뒤에있는 데이터가 인덱스 하나씩 뒤로 밀림 
		al.set(4, "포도");  // 4번 인덱스를 교체
		prn(al);
		al.remove(1); // 해당하는 인덱스 데이터 지워지며 하나씩 당겨짐
		prn(al);
		al.remove("사과");
		prn(al);
	}
	 
	 private static void prn(ArrayList<String> al) {
		for (String fruit : al) {
			System.out.print(fruit + "\t");
		}
		System.out.println();
		
	}
}
