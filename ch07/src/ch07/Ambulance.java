package ch07;

public class Ambulance extends Car { // Car를 상속받앗음
	// 생성자
	public Ambulance(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	
	// 메소드
	void printAm() {
		print();
		System.out.println("환자를 태우고 간다.");
	}	
}
