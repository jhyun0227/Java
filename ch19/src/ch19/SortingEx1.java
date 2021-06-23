package ch19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingEx1 {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 5, 2, 4, 3, 1 });
		// 정렬
		intStream.sorted().forEach(n -> System.out.print(n + ","));
		
		System.out.println();

		List<Student2> list = Arrays.asList(new Student2("아이유", 90), new Student2("하니", 76), 
				new Student2("철수", 77), new Student2("유비", 88));
		list.stream().sorted().forEach(s->System.out.println(s.getScore() + ", "));
		
		System.out.println();
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s.getScore() + ", "));
	}
}
