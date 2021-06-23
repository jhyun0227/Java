package ch02;

public class OpSp5 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		// Math.round : 실수를 반올림하여 정수로 변경
		float shortPi = Math.round(pi * 1000) / 1000f;
		// Math.round(3141.592f) / 1000f
		// 3142 / 1000f => 3142.0f / 1000f => 3.142
		System.out.println("shortPi = " + shortPi);
	}
}

/* 정수의 경우 byte 연산 byte는 기본값인 int로 데이터 타입이 바뀌지만 
 * 실수의 경우 float 연산 float는 기본값인 double이 되지 않는다.*/
