package ch11;

import java.util.HashSet;

public class Set2 { // HashSet
	public static void main(String[] args) {
		String[] snakes = {"구렁이", "팔렁이", "구렁이", "칠렁이", "팔렁이", "육렁이"};
		
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		
		// snakes 데이터 hs1에 입력하고
		for (String snake : snakes) {
			if(! hs1.add(snake)) {
				// 입력안된 것은 hs2에 입력해라
				hs2.add(snake);
			}
		}
		// 완료 후에 출력
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2); // hs1과 hs2에서 중복되는 데이터를 hs1에서 지워라
		System.out.println(hs1);
		System.out.println(hs2);
	}
}
