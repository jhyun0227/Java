package ch06_1;
class E2 {
	// 메소드 오버로딩
	int add(int x, int y) {
		return x + y;
	}
	
//	int add(int a, int b) { // 변수명이 다른 것은 안되고 (매개변수 데이터 타입과 갯수)
//		return x + y;
//	}
	
	double add(double x, double y) {
		return x + y;
	}
	
	String add(String name) {
		return "안녕하세요 " + name + "님";
	}
}

public class OverLoading1 {
	public static void main(String[] args) {
		E2 e = new E2();
		System.out.println(e.add(12, 15));   // 매개변수에 따라서 응답하는 메소드가 다르다.
		System.out.println(e.add(3.6, 7.2));
		System.out.println(e.add("철수"));
	}
}
