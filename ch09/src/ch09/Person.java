package ch09;

public class Person {
	String jumin;
	String name;
	int age;

	public Person(String jumin, String name, int age) {
		this.jumin = jumin;
		this.name = name;
		this.age = age;
	}

	// 외부에서 들어온 객체가 Person으로 만든 객체면 주민번호가 같으면 같다고 인정하고
	// 아니다면 다르다고 하자
	// equals 같다는 기준을 정할 때 사용
	public boolean equals(Object obj) {
		// 숫자를 비교할때는 ==, 문자를 비교할때는 equals
//		if (obj != null && obj instanceof Person) {
//			return jumin == ((Person)obj).jumin;
//		} else return false;
		if (obj != null && obj instanceof Person) {
			return name.equals(((Person) obj).name);
		} else {
			return false;
		}	
	}
	public String toString() {
		return "이름 : " + name + ", 주민번호:" + jumin + ", 나이:" + age;
	}
}