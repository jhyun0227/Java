package jch06;
class Tv1 {
	String color;
	boolean power;
	int channel;
	
	void power() {};
	void channelUp() {};
	void channelDown() {};
}

public class TvEx {
	public static void main(String[] args) {
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();
		t1.channel = 7;
		t2 = t1; // t2에 t1의 값이 복사되어 저장되는것이 아니고 t2가 t1의 객체 주소를 참조하게되는 것 그래서 기존의 t2 객체는 삭제되어짐
		System.out.println(t1.channel);
		System.out.println(t2.channel);
			
	}
}
