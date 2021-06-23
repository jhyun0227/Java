package ch05;
class A1 {
	//멤버변수
	int var1 = 100;  		//멤버변수(객체변수)
	static int var2 = 200;	//멤버변수(정적변수, 클래스변수)
	
// 생성자 생략 A1() {}	
	
	void print() {
		System.out.println("대박 ");
		System.out.println("var1 = "+var1+", var2 = "+var2);
	}
	static void print2() { // 객체를 생성하지 않고 사용 가능, Class명.메서드();
// 클래스 메소드는 클래스 변수만 사용이 가능
		System.out.println("사건");
//		System.out.println("var1 = "+var1+", var2 = "+var2);
		System.out.println("var2 = "+var2);
	}
}
public class Static1 {
	public static void main(String[] args) {
		A1.var2 = 300;  // 클래스변수라 객체를 생성하지 않고 사용 이로인해 var2값은 300으로 고정이됨
		A1.print2();  	// 클래스 메소드 사용
		A1 a1 = new A1(); // 새로운 al객체를 생성
		a1.var1 = 400;
		a1.print();
	}
}