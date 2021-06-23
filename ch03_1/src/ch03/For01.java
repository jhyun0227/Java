package ch03;

public class For01 {
	public static void main(String[] args) {
		//      초기식  ;  조건식  ; 증감식
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i > 10; i--) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=3) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i*=2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		int i = 1; // 초기식
		for (; ;) { // ;는 반드시 있어야 하지만 사이 식이나 값은 제거 가능
			System.out.print(i + "\t");
			if (i > 10) {
				break; // 조건식
			}
			i++; // 증감식
		} // for(;;)는 while(true)와 같다.
	}
}
