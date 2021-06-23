package ch07_1;

public class Person2Ex {
	public static void main(String[] args) {
		Person2[] ps = new Person2[6];
		ps[0] = new Student2("블랙핑크", 25, "1반");
		ps[1] = new Student2("BTS", 23, "2반");
		ps[2] = new Teacher2("카놀라유", 48, "자바");
		ps[3] = new Teacher2("JYP", 49, "JSP");
		ps[4] = new Manager2("모모", 26, "청소");
		ps[5] = new Manager2("제시", 37, "운전");
		
		for (Person2 p : ps) {
			p.print();
			if (p instanceof Manager2) {
				((Manager2)p).disp();
			}
		}
	}
}
