package ch02;

public class PostfixOp {
	public static void main(String[] args) {
		int num1 = 7;
		int num2, num3; // 선언만하고 값은 없다
		
		num2 = num1++; // num2에 7을 대입한 후에 num1은 1증가 num2=7,  num1=8
		num3 = num1--; // num3에 8을 대입한 후에 num1은 1감소 num3=8 , num1=7
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
			}
	}
