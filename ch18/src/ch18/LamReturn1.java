package ch18;
@FunctionalInterface
interface MyInter3 {
	int method (int x, int y);
}

public class LamReturn1 {
	public static void main(String[] args) {
		MyInter3 mi;
		mi = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.println("결과 : " + mi.method(12, 7));
		
		mi = (x,y)-> {return x + y;};
		System.out.println("결과 : " + mi.method(12, 11));
		
		mi = (x,y)-> x + y; // 실행문의 문장이 한 문장일 경우 중괄호 생략 가능
		System.out.println("결과 : " + mi.method(21, 11));
	}
}
