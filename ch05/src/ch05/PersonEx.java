package ch05;

public class PersonEx {
	public static void main(String[] args) {
	Person p1 = new Person();
	p1.name = "아이유"; p1.age = 25; p1.hobby = "욕하기";
	
	Person p2 = new Person("비");
	p2.age = 35; p2.hobby = "뒷담화";
	
	Person p3 = new Person("손담비", 32);
	p3.hobby = "침뱉기";
	
	Person p4 = new Person("손담비", 32, "춤");
	
	p1.print();
	p2.print();
	p3.print();
	p4.print();
	}
}

