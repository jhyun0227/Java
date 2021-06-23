package ch06_1;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		System.out.println("이름 : "+p1.getName());
//		p1.age = -35; 메소드를 사용하지 않고 접근하면 메서드에서 데이터를 체크할 수 없다.
		
		Person p2 = new Person();
		p2.setName("세정");
		p2.setAge(-25); // 체크 할 수 있다.
		
//		p1.print();
		p2.print();
	}
}
