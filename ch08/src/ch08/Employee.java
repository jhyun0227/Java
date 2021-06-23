package ch08;

public class Employee {
	// 필드(멤버변수)
	public final double INCENTIVE_RATE = 0.1; // 인센티브는 10% 고정
	private String name;
	
	
	// 생성자
	public Employee() {}
	Employee(String name) {
		this.name = name;
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	int computePay() { // 오버라이딩 할 메소드, 재정의 해서 사용해라
		return 0;
	}
	final int computrIncentive() { // 재정의 불가
		int result = 0;
		int pay = computePay();
		if (pay >= 100000) {
			result = (int)(pay * INCENTIVE_RATE);
		}
		return result;
	}
}
