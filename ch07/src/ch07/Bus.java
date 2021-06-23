package ch07;

public class Bus extends Car{
	// 생성자
	public Bus(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}

	// 메소드
	void printBus() {
		print();
		System.out.println("많은 손님을 싣고 출발한다.");
	}	
}
