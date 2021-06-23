package ch06;
class B2 {
//  int는 더한 결과가 정수
	int add(int x, int y) { // 요거는 int가 붙엇다고 멤버변수가 아닙니다 메소드임니다.
		return x + y; // 반환형이 int면 return뒤의 결과가 int여야 한다.
	}

//  void(비어있는) : 반환할 값이 없다는 의미
	void minus(int x, int y) {
		System.out.printf("%d - %d = %d\n", x, y, x-y);
	}
}
public class Return1 {
	public static void main(String[] args) {
		B2 b2 = new B2();
		System.out.println(b2.add(12, 3)); // add한 결과가 호출한 곳에 반환된다.
		int k = b2.add(10, 7);
		System.out.println("k = " + k);
//		System.out.println(b2.minus(12, 6)); // 출력할 값이 없어서 에러
		b2.minus(12,6);
	}
}
