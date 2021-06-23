package ch02;

public class OperTest1 {
	public static void main(String[] arg){
		 String str="산술, 증감, 감소, 연산자 예제";
		 int x,y;
		 x = 10; y = 5;
		 System.out.println(str);
		 System.out.println("x + y = "+(x + y));
		 System.out.println("x - y = "+(x - y));
		 System.out.println("x * y = "+(x * y));
		 System.out.println("x / y = "+(x / y));
		 System.out.println("x % y = "+(x % y));
		 System.out.println("x++ = "+(x++)); // x는 11이지만 출력은 증가전이므로 10
		 System.out.println("y++ = "+(y++)); // y는 6이지만 출력은 증가전이므로 5
		 x = 10; y = 10; // 변수가 변했기 때문에 다시 초기화
		 System.out.println("++x = "+(++x));
		 System.out.println("++y = "+(++y)); 
	}
}