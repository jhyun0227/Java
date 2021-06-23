package ch08_1;

public class TV1 implements RemoteControl1 {
	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
}

class Radio1 implements RemoteControl1 {
	@Override
	public void turnOn() {
		System.out.println("Radio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio¸¦ ²ü´Ï´Ù.");
	}
}