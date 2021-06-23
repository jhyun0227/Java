package ch02;

public class Test1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 0;
		// int a = 5, b = 10, c = 0; 같은 결과값
		
		a = a + 10; // a = 15
		b = b + 10; // b = 20
		c = a + b ; // c = 35
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
