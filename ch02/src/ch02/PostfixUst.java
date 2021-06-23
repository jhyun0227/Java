package ch02;

public class PostfixUst {
	public static void main(String[] args) {
		int num1=7, num2;
		num2 = (num1--) + 5; // 뒤에 있으면 연산을 먼저
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		}
}
