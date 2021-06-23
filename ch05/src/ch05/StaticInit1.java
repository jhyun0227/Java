package ch05;
class B2 {
	static int[] i1 = new int[10];
	static { // 클래스 변수 초기화. 처음 클래스를 사용할때 한번만 실행
		for(int i = 0; i < i1.length; i++) {
			i1[i] = (int)(Math.random()*20) + 1;
		}
	}
}

public class StaticInit1 {
	public static void main(String[] args) {
		for(int i = 0; i < B2.i1.length; i++) { // 클래스 변수를 바로 사용
			System.out.println("i1[" + i + "] = " + B2.i1[i]);
		}
		
		System.out.println("==========================");
		
		B2 b1 = new B2();
		for(int i = 0; i < B2.i1.length; i++) { // 클래스 변수를 객체를 생성하여 사용 비교
			System.out.println("i1[" + i + "] = " + b1.i1[i]); 
		}
	}
}
