package ch12;

public class AccountUser extends Thread {
	// 메소드
	boolean flag; // default false
	Account act;
	String name;

	// 생성자
	public AccountUser(Account act, String name) {
//		super(name); // Thread 이름
		this.act = act;
		this.name = name;
	}

	// 메소드
	@Override
	public void run() {
		// 입금과 출금을 교대로 5번 실행
		// false와 true를 번갈아 사용
		for (int i = 0; i < 5; i++) {
			int amt = (int) (Math.random() * 10000) + 1;
			if (flag) { // true 입금
				act.depoist(amt, name);
			} else { // false 출금
				act.withdraw(amt, name);
			}	
			flag = !flag; // true면 false, false면 true
			act.print();
		}
	}
}