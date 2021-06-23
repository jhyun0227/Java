package ch19;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx1 {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("세정", 20), new Student1("길동", 25), new Student1("강다니엘", 22));
		//                                 중간과정               최종처리
		double avg = list.stream().mapToInt(Student1::getAge).average().getAsDouble();
		System.out.printf("평균 나이 : %.2f", avg);
	}
}
