package ch09_1;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("0부터 100까지 난수 : " + ran.nextInt(101)); // nextInt() 정수구하기
		System.out.println("전체 정수중에서 난수 : " + ran.nextInt());
		System.out.println("float 난수 : " + ran.nextFloat()); // random 클래스의 nextFloat 메소드
		System.out.println("double 난수 : " + ran.nextDouble());
		System.out.println("long 난수 : " + ran.nextLong());
		System.out.println("boolean : " + ran.nextBoolean());
	}
}
