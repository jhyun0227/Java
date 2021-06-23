package ch07;

public class Fruit3Ex {
	public static void main(String[] args) {
		FruitSeller3 fs1 = new FruitSeller3("세정", 2, 1000);
		FruitSeller3 fs2 = new FruitSeller3("전지현", 20, 0);
		FruitBuyer3 fb1 = new FruitBuyer3("화사", 0, 20000);
		FruitBuyer3 fb2 = new FruitBuyer3("이효리", 5, 10000);
		FruitBuyer3 fb3 = new FruitBuyer3("BTS", 0, 50000);
		
		fb1.buyFruit(fs1, 3000);
		fb2.buyFruit(fs2, 2000);
		fb3.buyFruit(fs1, 2000);
		
		fs1.print();
		fs2.print();
		fb1.print();
		fb2.print();
		fb3.print();
	}
}
