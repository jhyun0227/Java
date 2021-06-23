package ch05;

class Cal {
	int x = 0, y = 0; // 멤버변수, 전역변수 클래스 밑에 있고 여러 메서드에서 사용 가능
	
	// 메소드
	public void cal() {
		String title = "==================="; // 지역변수 : 메소드 내에서 정의하고 그 안에서 사용
		System.out.println(title);
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
	}
}

public class CalEx {  // 한 소스에서 여러 클래스를 사용할 경우 public은 한곳에만 사용
// main 메소드가 있는 경우는 main메소드가 있는 클래스만 public을 적용하고 클래스명은 소스파일명과 동일해야함
	public static void main(String[] args) {
//		String str = "재밌지"; // 지역변수
//		x = 10; y = 4; 에러나옴 // 실행문(main)이 전역변수를 사용하기 위해서는 객체를 생성해야함
		Cal c1 = new Cal(); c1.x = 10; c1.y = 4;
//		c1.title = "대박";
		c1.cal();
	}
}
