package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 { // HashSet
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("사과"); set.add("대추"); set.add("바나나"); 
		set.add("키위"); set.add("사과"); set.add("바나나");
		
		System.out.println("갯수 : " + set.size()); // Set컬렉션은 인덱스가 없어 중복값을 저장하지 않음
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
