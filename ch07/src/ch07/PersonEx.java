package ch07;

public class PersonEx {
	public static void main(String[] args) {
		// 객체생성(인스턴스)
		Student st1 = new Student("세정", 28, "1반");
		Student st2 = new Student("뷰", 27, "2반");
		Teacher th1 = new Teacher("유느님", 51, "자바");
		Teacher th2 = new Teacher("이효리", 38, "JSP");
		Manager mg1 = new Manager("준하", 52, "화장실청소");
		
		st1.printSt();
		st2.printSt();
		th1.printTh();
		th2.printTh();
		mg1.printMg();
	}
}

// 클래스를 생성할때 공통적인 클래스를 하나를 만들고(일반화) 그에 파생되는 자식 클래스를 만드는것(상속)
// 이 경우에는 공통되는 것을 Person이라는 클래스에 만들고(일반화) 차이점을 각각 St, Th, Mg 클래스에 담아서 Person 클래스에 상속시킴
