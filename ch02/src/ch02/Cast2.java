package ch02;

public class Cast2 {
		public static void main(String[] args) {
			float f1 = 3.15f;
			int i1 = (int)f1; // int < float, 소숫점은 버림
			System.out.println("i1 = " + i1);
			
			// 범위를 벗어나는 것을 강제형 변환하면 값은 쓰레기 값이 됨
			byte b1 = (byte)128; // byte : -128 ~ 127
			byte b2 = (byte)256;
			System.out.println("b1 = " + b1);
			System.out.println("b2 = " + b2);
		}
}
