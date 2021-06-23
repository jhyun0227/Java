package ch02;

public class Bit1 {

	public static void main(String[] args) {
		int num1 = 10; //000000000001010
		int num2 = 6;  //000000000000110
		//      &(and)   000000000000010 2^0*0 + 2^1*1 = 2
		//      |(or)    000000000001110 2^0*0 + 2^1*1 + 2^2*1 + 2^3*1 = 2+4+8 = 14
		//      ^(xor)   000000000001100 2^0*0 + 2^1*0 + 2^2*1 + 2^3*1 = 4+8 = 12
		// System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 & num2 = " + (num1 & num2));
		System.out.println("num1 | num2 = " + (num1 | num2));
		System.out.println("num1 ^ num2 = " + (num1 ^ num2));
		System.out.println(~num1);
	}
}

// 비트연산자는 일반업무에서 잘 사용하지 않아서 이런게 있다고만 알고 있으면 됨