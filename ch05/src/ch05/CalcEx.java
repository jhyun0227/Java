package ch05;
class Calc {
	// 맴버변수
	int width, height, depth;
	
	// 생성자
	// 생성자 오버로딩 : 생성자 명이 같지만 매개변수가 다를 경우
	Calc(int w) {
		width = w;
	}
	Calc(int w, int h) {
		width = w; height = h;
	}
	Calc(int w, int h, int d) {
		width = w; height = h; depth = d;
	}
	
	// 메소드
	void square() {
		System.out.println("정사각형 넓이 : " + width * width);
	}
	
	void rectange() {
		System.out.println("직사각형 넓이 : " + width * height);
	}
	
	void hexa() {
		System.out.println("직육면체 부피 : " + width * height * depth);
	}
}

public class CalcEx {
	public static void main(String[] args) {
		Calc c1 = new Calc(10);
		c1.square();
		
		Calc c2 = new Calc(10, 20);
		c2.rectange();
		
		Calc c3 = new Calc(10, 20, 30);
		c3.hexa();
	}
}
