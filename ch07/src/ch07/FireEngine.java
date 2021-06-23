package ch07;

public class FireEngine extends Car {
	// 생성자
	public FireEngine(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}

	// 메소드
	void printFe() {
		print();
		System.out.println("불을 끄기 위해 출동한다.");
	}	
}
