package ch07;

public class FruitSeller3 {
	// 필드(멤버변수)
	String name;
	int numOfApple;
	int money;
	final int PRICEPERAPPLE = 1000; // 종단변수, 값 변경 금지, 단가
	
	// 생성자
	public FruitSeller3(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	
	// 메소드
	int saleApple(int amt) { // amt 사과 사는 사람이 주는 돈
		int num = amt / PRICEPERAPPLE; // 판매수량
		if (numOfApple >= num) {
			numOfApple -= num; // 사과수량이 감소
			money += amt; // 돈이 증가
			System.out.printf("%s %d개 판매, 수입 %d원\n", name, num, amt);
		} else {
			System.out.println("사과가 부족해서 팔 수 없습니다.");
			num = 0; // 사과를 팔지 않았다
		}
		return num;
	}
	
	void print() {
		System.out.println(name + "사과갯수 : " + numOfApple);
		System.out.println(name + "현금잔액 : " + money);
		System.out.println("=====================");
	}
}
