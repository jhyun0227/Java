package ch05;

public class Box { // 클래스 선언
	int width, height, depth; //멤버변수, 속성, 필드
	
//	Box() { } 생략된 생성자
	
	void calVolume() { // 메서드1
		System.out.println("부피 : " + (width*height*depth));
	}
}
