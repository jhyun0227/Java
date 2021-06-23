package ch07;

public class Car {
	// 필드(멤버변수)
	private String kind;
	private int inwon;
	
	/*	
 	// 생성자 공통클래스는 생성자를 만들면 자식들 클래스에서 생성자를 만들기때문에 없는것이 나음
	Car(String kind, int inwon) {
		this.kind = kind; this.inwon = inwon;
	}
	*/ 
	
	
	// 메소드
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getInwon() {
		return inwon;
	}
	public void setInwon(int inwon) {
		this.inwon = inwon;
	}


	void print() {
		System.out.println("==================");
		System.out.println("차 종류 : " + kind);
		System.out.println("승차인원 : " + inwon);
	}
}
// Ambulance, Bus, FireEngine
// 환자를 태우고 간다, 많은 손님을 실고 출발한다, 불끄기 위해서 출동