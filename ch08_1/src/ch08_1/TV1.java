package ch08_1;

public class TV1 implements RemoteControl1 {
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
}

class Radio1 implements RemoteControl1 {
	@Override
	public void turnOn() {
		System.out.println("Radio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio�� ���ϴ�.");
	}
}