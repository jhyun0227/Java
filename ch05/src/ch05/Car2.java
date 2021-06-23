package ch05;

public class Car2 { 
	String color = "검정";     // 값을 대입하지 않으면 이것을 사용, default 값
	int displacement = 1000;  // 객체변수들
	String name = "BMW";
	
	void print() { // 공통적으로 사용되는 것을 메서드로 만들어 두는 것이 좋다.
		System.out.println("차 종류 : " + name);
		System.out.println("배기량 : " + displacement);
		System.out.println("차 색깔 : " + color);
		System.out.println("=============================");
	}
}

