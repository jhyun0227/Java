package jch06;
class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result; 
	 // return a + b; // 위의 두줄을 이와 같이 간단히 할 수 있다.
		}
		
		long substract(long a, long b) {
			return a - b;
		}
		
		long multiply(long a, long b) {
			return a * b;
		}
		
		double divide(long a, long b) {
			return a / b;
		}
		
		long max(long a, long b) {
			if(a > b) {
				return a; // 조건식이 참일때만 실행
			} else {
				return b; // 조건식이 거짓일때 실행
			}
		}
		
		void printGugudan(int dan) {
			if (!(2 <= dan && dan <= 9)) {
				return; // 입력 받은 단(dan)이 2~9가 아니면, 메소드 종료하고 돌아가기
			}
			
			for (int i = 1; i<=9 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
//			return; 리턴타입이 void일 경우 마지막에 return문은 생략가능하다. 리턴타입이 아닐경우 값을 반환해야하기 때문에 필수
		}
}


public class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); // add메소드 호출 
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(12); // 구구단 3단을 출력
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
