package jch06;

public class Ex6_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel 값 : " + t1.channel);
		System.out.println("t2의 channel 값 : " + t2.channel);
		
		t1.channel = 7;
		System.out.println("t1의 channel 값 : " + t1.channel);
		System.out.println("t2의 channel 값 : " + t2.channel);
		
		t2 = t1; // 참조변수 t1의 값을 t2에 저장
		// t2에 t1의 값이 복사되어 저장되는것이 아니고 t2가 t1의 객체 주소를 참조하게되는 것 그래서 기존의 t2 객체는 삭제되어짐
		System.out.println("t1의 channel 값 : " + t1.channel);
		System.out.println("t2의 channel 값 : " + t2.channel);
	}
}
