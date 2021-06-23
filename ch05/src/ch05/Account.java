package ch05;

public class Account {
	// 멤버변수, 필드, 속성
	String accountNo; // 계좌번호
	String name;	// 예금주
	int balance;	// 잔액
	
	// 생성자
	public Account(String acNo, String na, int bal) {
		accountNo =  acNo; name = na; balance = bal;
	}
	
	// 메소드
	void deposit(int money) { // 예금
		balance += money;
		System.out.println(name + "입금 : " + money);
	}
	
	void withdraw(int money) { // 출금
		if (balance >= money) { // 잔액이 출금 금액보다 커야함
			balance -= money;
			System.out.println(name + "출금 : " + money);
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	void disp() {
		System.out.println("=== 계좌번호 ===" + accountNo);
		System.out.println("예금주 : " + name);
		System.out.println("잔액 : " + balance);
	}
}
