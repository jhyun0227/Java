package ch02;

public class OperTest3 {
	public static void main(String[] arg){
		String str="3항 연산자 예제입니다.";
		int x=10;
		int y;
		// 조건 ? 참 : 거짓
		y= x<9 ? 5 : 20;
		System.out.println(str);
		System.out.println("y의 결과값은= "+y);
	}
}
