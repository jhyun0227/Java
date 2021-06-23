package ch05;
class A2 {
	int num1; // 생성할때 초기 값이 항상 0
	static int num2; // 변경된 값을 보관해서 다음에 생성할 때 추가
	
// 생성자 생략	
	
	void print() {
		System.out.println("num1 = " + ++num1 + "num2 = " + ++num2);
	}
}

public class Static2 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { //a2.print 를 5번 반복
			A2 a2 = new A2();
			a2.print();
		}
		A2 a3 = new A2();
		a3.print(); // 클래스 변수의 값에는 위에 반복문에서 이미 5라는 값이 저장되어있음을 알 수 있다.
					// 클래스 변수는 객체변수와 다르게 각 객체마다 값이 초기화 되는것이 아니라 한 클래스에 계속해서 저장됨을 알 수 있음
	}
}
