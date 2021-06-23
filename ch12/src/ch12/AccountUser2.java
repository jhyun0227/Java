package ch12;

public class AccountUser2 extends Thread {
	// 메소드
	boolean flag; // default false
	Account2 act;
	String name;

	// 생성자
	public AccountUser2(Account2 act, String name) {
		this.act = act;
		this.name = name;
	}

	// 메소드
	@Override
	public void run() {
		// 입금과 출금을 교대로 5번 실행
		// false와 true를 번갈아 사용
		for (int i = 0; i < 5; i++) {
			// synchronized를 객체 앞에서 사용하는 방법
			// 계좌를 동시에 사용하는 것을 방지
			synchronized (act) {
				int amt = (int) (Math.random() * 10000) + 1;
				if (flag) { // true 입금
					act.depoist(amt, name);
				} else { // false 출금
					act.withdraw(amt, name);
				}
			}
			flag = !flag; // true면 false, false면 true
			act.print();
		}
	}
}