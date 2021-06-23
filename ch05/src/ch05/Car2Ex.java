package ch05;

public class Car2Ex {
	public static void main(String[] args) {
	// 클래스 레퍼런스명(객체) = 연산자 생성자 => 객체생성(인스턴스화); / 생성자는 클래스와 이름이 같고 뒤에 ()를 갖는다.
		Car2 car1 = new Car2();
		Car2 car2 = new Car2();
		
		car1.name = "소나타";
		car1.displacement = 1500; // 차색깔에 값을 대입하지 않아 default 값 검정이 출력
		car1.print(); // 레퍼런스명.메서드명
		
		car2.color = "핑크";
		car2.displacement = 3000; // 차 종류에 값을 대입하지 않아 default 값 BMW가 출력
		car2.print();
	}
}