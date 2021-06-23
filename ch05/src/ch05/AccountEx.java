package ch05;

public class AccountEx {
	public static void main(String[] args) {
		Account ac1 = new Account("국민 1234", "아이유", 1000);
		Account ac2 = new Account("신한 3456", "조유리", 2000);
		Account ac3 = new Account("우리 7891", "웬디", 3000);
		
		int money = 0;
		for (int i = 0; i < 10; i++) {
			money = (int)(Math.random()*10000) + 1;
			ac1.deposit(money);
			money = (int)(Math.random()*12000) + 1;
			ac1.withdraw(money);
		}
		ac1.disp();
		
		for (int i = 0; i < 10; i++) {
			money = (int)(Math.random()*10000) + 1;
			ac2.deposit(money);
			money = (int)(Math.random()*12000) + 1;
			ac2.withdraw(money);
		}
		ac2.disp();
		
		for (int i = 0; i < 10; i++) {
			money = (int)(Math.random()*10000) + 1;
			ac3.deposit(money);
			money = (int)(Math.random()*12000) + 1;
			ac3.withdraw(money);
		}
		ac3.disp();
	}
}
