package ch05;

public class Car5Ex {
	public static void main(String[] args) {
		Car5 c1 = new Car5("123456", 15, 20);
		Car5 c2 = new Car5("456789", 13, 21);
		Car5 c3 = new Car5("789123", 9, 15);
		
		c1.carFee();
		c2.carFee();
		c3.carFee();
		
		c1.print();
		c2.print();
		c3.print();
	}
}
