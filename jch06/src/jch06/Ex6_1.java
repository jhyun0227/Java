package jch06;

class Tv {
	// �ʵ�(�������)
	String color;
	boolean power;
	int channel;

	// �޼ҵ�
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
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}
}
