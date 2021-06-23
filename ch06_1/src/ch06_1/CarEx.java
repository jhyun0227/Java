package ch06_1;
class Car {
	// 필드(멤버변수)
	String kind;
	int displacement;
	String color;
	
	// 외부에서 kind, 배기량, 색을 받아서 멤버변수에 저장
	Car(String kind, int displacement, String color) {
		this.kind = kind; this.displacement = displacement; this.color = color;
		}
	
	// print() { // 종류, 배기량, 색을 출력
	void print() {
		System.out.println("=================================");
		System.out.println("종류 : " + kind);
		System.out.println("배기량 : " + displacement);
		System.out.println("색 : " + this.color);
	}
}

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car("소나타", 1500, "빨강");
		Car c2 = new Car("벤츠", 2000, "초록");
		Car c3 = new Car("모닝", 1200, "노랑");
		
		c1.print(); c2.print(); c3.print();
	}
}
