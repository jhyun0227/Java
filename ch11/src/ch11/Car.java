package ch11;

public interface Car {
	void print();
}

class Bus implements Car {
	public void print() { // 오버라이딩
		System.out.println("난 버스야");
	}
	
	void move() {
		System.out.println("40명을 태우고 다녀");
	}
}

class Taxi implements Car {
	public void print() { // 오버라이딩
		System.out.println("난 택시야");
	}
}

class FireEngine implements Car {
	public void print() { // 오버라이딩
		System.out.println("난 소방차야");
	}
}

class Ambulance {
	public void print() {
		System.out.println("난 앰뷸런스");
	}
}
