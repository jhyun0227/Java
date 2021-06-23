package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student1 {
	private String name;
	private int age;

	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
public class LamdaStream1Ex {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("세정", 20), new Student1("길동", 25), new Student1("강다니엘", 22));
		
		Stream<Student1> stream = list.stream();
		stream.forEach(s-> {
			System.out.println(s.getName() + " : " + s.getAge());
		});
	}
}
