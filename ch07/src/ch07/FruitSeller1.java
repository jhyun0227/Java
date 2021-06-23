package ch07;

public class FruitSeller1 {
	int numOfApple = 20;
	int money = 0;
	final int PRICEPERAPPLE = 1000; // 종단변수, 값 변경 금지, 단가
	
	int saleApple(int amt) { // amt 사과 사는 사람이 주는 돈
		money += amt; // 돈이 증가
		int num = amt / PRICEPERAPPLE; // 판매수량
		numOfApple -= num; // 사과수량이 감소
		return num;
	}
	void print() {
		System.out.println("판매자 사과갯수 : " + numOfApple);
		System.out.println("판매자 현금잔액 : " + money);
		System.out.println("=====================");
	}
}
