package ch03;

public class MathRan1 {
	public static void main(String[] args) {
		// Math.random() : 0부터 1미만의 실수를 임의로 생성
		// 1~100중에 임의로 정수를 생성
		System.out.println((int)(Math.random() * 100) + 1);
	}
}
