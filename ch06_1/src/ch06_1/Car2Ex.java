package ch06_1;
class Car2 {
	Car2() {  // 1
		this("BMW"); // 2
		System.out.println("매개변수가 없는 생성자");	 // 8	 
	}
	
	Car2(String name) { // 3
		this(name, "노랑"); // 4
		System.out.println("매개변수가 없는 생성자 : "+name); // 7
	}
	
	Car2(String name, String color) { // 5
		System.out.println("매개변수가 없는 생성자 : "+name+", 색깔 : "+color); // 6
	}
}
public class Car2Ex {
	public static void main(String[] args) {
		Car2 c = new Car2();
	}
}

// 생성자는 상속받는 것이 아니라 부모 메서드부터 실행되어진다.