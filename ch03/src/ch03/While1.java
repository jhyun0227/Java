package ch03;

public class While1 { // while 문
	public static void main(String[] args) {
		/*System.out.println("대박");
		System.out.println("대박");
		System.out.println("대박");
		System.out.println("대박");
		System.out.println("대박");*/ // 넘모 비효율적
		
		int i = 0;
		while (i < 10) { // 조건이 참이면 실행
						 // 조건이 거짓이면 while 종료
			System.out.println("대박");
			i++; // 조건을 변경하는 부분이 없으면 무한대로 
		}
	}
}
