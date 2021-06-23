package ch06_1;
class Box {
	// 메소드 오버로딩
	int volume(int x, int y, int z) {
		return x+y+z;
	}
	
	double volume(double x, double y, double z) {
		return x+y+z;
	}
}

public class OverLoading2 {
	public static void main(String[] args) {
		Box box = new Box();
		System.out.println("정수박스 부피 : " + box.volume(12, 15, 20));
		System.out.println("실수박스 부피 : " + box.volume(12.5, 15.5, 20.3));
		System.out.println("실수박스 부피 : " + box.volume(12.5, 15.5, 20)); // 정수는 실수에 포함됨
	}
}
