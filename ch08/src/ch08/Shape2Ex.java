package ch08;

public class Shape2Ex {
	public static void main(String[] args) {
//		Shape2 sh1 = new Shape2(); // 추상클래스는 객체를 생성할 수 없음
// 		상속받는 자식 클래스를 만들어서 자식 클래스를 생성하여 사용, 단 선언은 가능
		Shape2[] shs = new Shape2[3];
		shs[0] = new Circle2();
		shs[1] = new Rectangle2();
		shs[2] = new Triangle2();
//      Shape2[] shs = {new Circle2(), Rectangle2(), Triangle2()};
		
		for (Shape2 sh : shs) {
			sh.computeArea();
			sh.print();
		}
	}
}
