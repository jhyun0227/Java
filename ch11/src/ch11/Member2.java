package ch11;

public class Member2 implements Comparable<Member2> {
	String name;
	int age;
	
	public Member2(String name, int age) {
		this.name = name; this.age = age;
	}

	@Override
	// 비교하는 기준을 설정
	public int compareTo(Member2 o) {
		String age1 = age + ""; 	// 비교 대상이 문자열
		String age2 = o.age + "";
		return age1.compareTo(age2);
//		return name.compareTo(o.name);
	}
	public String toString() {
		return name + "(" + age + ")";
	}
}
