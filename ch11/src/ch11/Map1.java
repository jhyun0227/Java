package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		// MAP 인터페이스는 키의 중복을 허용하지 않음 값은 중복 가능
		//        키       값
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("BTS", "010-1111-1234");
		hm1.put("블랙핑크", "010-1234-1234");
		hm1.put("브레이브걸스", "010-2222-1234");
		hm1.put("BTS", "010-2222-1234"); // 키값의 데이터가 동일하면 뒤에것이 앞에것을 덮어씌움
		
		System.out.println(hm1.get("BTS"));
		System.out.println(hm1.get("블랙핑크"));
		System.out.println(hm1.get("브레이브걸스"));
		
		System.out.println("=========================");
		
		Set<String> keys = hm1.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + hm1.get(key));
			
		System.out.println("=========================");
		
		Iterator<String> it = hm1.keySet().iterator();
		while (it.hasNext()) {
			String key1 = it.next();
			System.out.println(key1 + " : " + hm1.get(key1));
		}
		}
	}
}
