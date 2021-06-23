package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student3Ex1 {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(new Student3("¼¼Á¤", 10, Student3.Sex.FEMALE),
				new Student3("Ã¶¼ö", 6, Student3.Sex.MALE), new Student3("IU", 10, Student3.Sex.FEMALE),
				new Student3("Çöºó", 6, Student3.Sex.MALE));
		
		List<Student3> maleList = list.stream().filter(s -> s.getSex() == Student3.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println("===============");
		
		List<Student3> femaleList = list.stream().filter(s -> s.getSex() == Student3.Sex.FEMALE)
				.collect(Collectors.toList());
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}
}