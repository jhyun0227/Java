package ch07;

public class FruitBuyer3 {
	// 필드(멤버변수)
	String name;
	int numOfApple;
	int money;
	
	
	// 생성자
	public FruitBuyer3(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	
	// 메소드
	void buyFruit(FruitSeller3 fs, int amt) {
		if (money < amt) {
			System.out.println("돈 떨어져서 못사");
		} else {
			int num = fs.saleApple(amt); // 구매한 사과 개수
			if (num != 0) { // 사과 구매
				money -= amt;
				numOfApple += num;
				System.out.printf("%s 사과 득템 %d개, 지출 %d원\n", name, num, amt);
			} else System.out.println("사과를 못 샀습니다.");
		}
	}
	
	void print() {
		System.out.println(name + "사과갯수 : " + numOfApple);
		System.out.println(name + "현금잔액 : " + money);
		System.out.println("=====================");
	}
}
