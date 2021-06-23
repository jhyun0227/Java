package ch07;

public class FruitBuyer2 {
	// 필드(멤버변수)
	String name;
	int numOfApple;
	int money;
	
	
	// 생성자
	public FruitBuyer2(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	
	// 메소드
	void buyFruit(FruitSeller2 fs, int amt) {
		int num = fs.saleApple(amt); // 구매한 사과갯수
		money -= amt;
		numOfApple += num;
	}
	void print() {
		System.out.println(name + "사과갯수 : " + numOfApple);
		System.out.println(name + "현금잔액 : " + money);
		System.out.println("=====================");
	}
}
