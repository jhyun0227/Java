package ch05;

public class BoxEx {
	public static void main(String[] args) {
//	 클래스명 레퍼런스명 = new 생성자 (객쳇 생성)
		Box box1 = new Box(); // 인스턴스화
		box1.width = 10;
		box1.height = 10;
		box1.depth = 10;
		System.out.println("box1의 높이는 " + box1.height);
		box1.calVolume();
		
		Box box2 = new Box();
		box2.width = 15;
		box2.height = 20;
		box2.depth = 25;
		System.out.println("box2의 깊이는 " + box2.depth);
		box2.calVolume();
	}
}

// 반환값이 void는 반환값이 없다.
