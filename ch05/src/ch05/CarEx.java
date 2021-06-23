package ch05;

public class CarEx {
	public static void main(String[] args) { // main 진입점
	// 클래스명 레퍼런스변수명 = 연산자 생성자 = 객체 생성	
		Car myCar = new Car(); // 객체 선언과 생성을 동시
	//  클래스명 객체명(레퍼런스명)	= 인스턴스 생성;
		Car yourCar; // 객체 선언
		yourCar = new Car(); // 객체 생성
	// 사용법 : 객체를 생성한 후에 레퍼런스명.멤버변수; 레퍼런스변수명.메서드명()
		myCar.name = "소나타";
		myCar.color = "핑크";
		myCar.displacement = 1500;
		System.out.println("myCar 이름 : " + myCar.name);
		System.out.println("myCar 색깔 : " + myCar.color);
		System.out.println("myCar 배기량 : " + myCar.displacement);
		myCar.speedup();
		
		yourCar.name = "말두타";
		yourCar.color = "빨강";
		yourCar.displacement = 3000;
		System.out.println("yourCar 이름 : " + yourCar.name);
		System.out.println("yourCar 색깔 : " + yourCar.color);
		System.out.println("yourCar 배기량 : " + yourCar.displacement);
		yourCar.stop();
	}
}
