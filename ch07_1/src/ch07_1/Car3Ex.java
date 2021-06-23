package ch07_1;
// 멤버변수와 메소드가 부모와 자식 상속간의 이름이 같을때
// 멤버변수는 부모의 값을 메소드는 자식의 값을 실행
public class Car3Ex {
	public static void main(String[] args) {
//		FireEngine3 fe = new FireEngine3(); 원래 이리 생성
//		FireEngine3 fe = new Car3(); // 범위가 작은 곳에 큰 것을 넣을 수 없다
		// 부모를 선언하고 = 자식을 생성 // up casting
		Car3 car1 = new FireEngine3();
		Car3 car2 = new Ambulance3();
		Car3 car3 = new Bus3();

//		부모를 선언하고 대입하면 부모가 가지고 있는 메서드와 멤버변수만 사용 가능
//		그런데 실제 실행되는 메소드가 오버라이딩 된 메소드 일 경우 자식메소드가 사용
		car1.drive();
		car2.drive();
		car3.drive();

//		부모를 선언하고 자식을 대입하면 부모가 가지고 있는 메서드와 멤버변수가 사용가능	
//		car1.fire();
		
		System.out.println("===========================");
		
		Car3[] cars = {car1, car2, car3};
		for (Car3 car : cars) {
			if(car instanceof FireEngine3) { // 인스턴스 실제 불자동차 타입인지 확인
//			FireEngine3 fe = (FireEngine3)car; // car1은 실행되지만 나머지는 에러
//			fe.fire();
			((FireEngine3)car).fire();
			System.out.println(car.color);
			}
//			멤버변수는 실제로 싱행되는 부모 변수 값
			System.out.println(car.color);
			car.drive(); // 오버라이딩 되어서 자식메소드 실행
		}
		
		System.out.println("===========================");
		Car3[] car = {car1, car2, car3};
		for (int i = 0; i < car.length; i++) {
			car[i].drive(); // 오버라이딩 되어서 자식메소드 실행
		}
	}
}
