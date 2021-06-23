package ch07_1;

class Product {	
// 1. 매개변수 있는 생성자 삭제  2.default 생성자 추가  3. 자식 생성자 super(정수) 추가
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

//	Product() {} // 두번째 방법
	Product(int price) { // 첫번쨰 방법 이걸 지운다. 생성자가 아무것도 없으면 자바가 default 생성자를 자동으로 만들어줌
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}

class Tv extends Product {
	// 생성자
	Tv() {
		super(100); // 세번째 방법
	}
	
	// 메소드
	public String toString() {
		return "Tv";
	}
}

public class ProductEx {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}