package ch12;

public class Account2 {
	// 필드
	private int total;
	
	// 생성자
	public Account2(int total) {
		this.total = total;
	}
	
	// 메소드
	// synchronized 없앴음
	void depoist(int amt, String name) {
		total += amt;
		System.out.println(name + "입금 : " + amt);
	}
	
	void withdraw(int amt, String name) {
		if (amt <= total) {
			total -= amt;
			System.out.println(name + "출금 : " + amt);
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	void print() {
		System.out.println("잔액 : " + total);
	}
}
