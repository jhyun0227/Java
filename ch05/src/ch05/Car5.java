package ch05;

public class Car5 {
	// 멤버변수
	String carNO; // 차랑번호
	int inTime;   // 입차시간
	int outTime;  // 출차시간
	int fee;	  // 주차요금
	final int moneyPerHour = 5000; // 시간당 요금 final을 통해 고정됨
	
	// 생성자
	Car5(String carNo, int inTime, int outTime) {
		this.carNO = carNo; this.inTime = inTime; this.outTime = outTime; 
	}
	
	// 메서드
	void carFee() {
		fee = (outTime - inTime) * moneyPerHour;
	}
	
	void print() {
		System.out.println("=====================");
		System.out.println("차랑번호 : " + carNO);
		System.out.println("입차시간 : " + inTime);
		System.out.println("출차시간 : " + outTime);
		System.out.println("주차요금 : " + fee);
	}
}
