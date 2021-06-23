package ch12;

public class Account {
	// 필드
	private int total;
	
	// 생성자
	public Account(int total) {
		this.total = total;
	}
	
	// 메소드
	// synchronized 동시에 메소드를 사용하는 것을 방지
	// synchronized를 메소드 앞에서 사용하는 방법
	synchronized void depoist(int amt, String name) {
		total += amt;
		System.out.println(name + "입금 : " + amt);
	}
	
	synchronized void withdraw(int amt, String name) {
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
