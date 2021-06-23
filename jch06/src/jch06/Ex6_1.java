package jch06;

class Tv {
	// 필드(멤버변수)
	String color;
	boolean power;
	int channel;

	// 메소드
	void power() {
		power = !power;
	};

	void channelUp() {
		++channel;
	};

	void channelDown() {
		--channel;
	};
}

public class Ex6_1 {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}
}
