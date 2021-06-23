package ch08;

public abstract class Car { // 추상클래스
	abstract void move(); // 추상메소드
}

class Ambulance extends Car { // Ambulance는 추상클래스 Car를 상속받앗다.
	@Override
	void move() { // 추상메소드는 꼭 오버라이딩 되어야 한다.
		System.out.println("환자를 싣고 움직인다.");
	}
}

class FireEngine extends Car { // 이하동문
	@Override
	void move() { // 이하동문
		System.out.println("사이렌을 울리며 달린다.");
	}
}

class Bus extends Car { // 이하동문
	@Override
	void move() { // 이하동문
		System.out.println("승객을 싣고 움직인다.");
	}
	
	void inwon() {
		System.out.println("정원이 40명이야.");
	}
}

