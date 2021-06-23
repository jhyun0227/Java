package ch06_1;

public class Person1Ex {
	public static void main(String[] args) {
		Student1 st1 = new Student1();
		st1.setname("세정"); st1.setAge(25); st1.setSno("1반"); // 데이터를 private 변수에 저장할때는 set
		
		Student1 st2 = new Student1();
		st2.setname("BTS"); st2.setAge(27); st2.setSno("2반");
		
		Teacher th1 = new Teacher();
		th1.setName("길동"); th1.setAge(35); th1.setSubject("자바");
		
		Teacher th2 = new Teacher();
		th2.setName("광수"); th2.setAge(41); th2.setSubject("뭘잡아");
		
		Manager mg1 = new Manager();
		mg1.setName("철수"); mg1.setAge(51); mg1.setPart("화장실 청소");
		
		System.out.println("이름 : " + st1.getName()); // st1.name x private 변수에 저장되어있는 데이터를 읽을때는 get
		
		st1.printAll();
		st2.printAll();
		th1.printAll();
		th2.printAll();
		mg1.printAll();
	}
}
