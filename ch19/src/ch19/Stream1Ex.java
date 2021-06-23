package ch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1Ex {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("세정"); list.add("BTS"); list.add("길동"); list.add("아이유");
		
		List<String> list = Arrays.asList("세정", "BTS", "길동", "아이유");
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("=================================================");
		
		Stream<String> stream = list.stream();
		stream.forEach(name->System.out.println(name));
	}
}
