package ch08_1;

// Volume을 다양하게 사용(다형성), 다형성 또는 overriding 통하여 다양하게 구현
public interface Volume {
	// 추상메소드(오버라이딩)
	void volumeUp();
	void volumeDown();
}

class Radio implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("라디오 볼륨을 올려요");	
	}

	@Override
	public void volumeDown() {
		System.out.println("라디오 볼륨을 내려요");
	}
	
}

class TV implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("TV 볼륨을 올려요");	
	}

	@Override
	public void volumeDown() {
		System.out.println("TV 볼륨을 내려요");
	}
}

class Speaker implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("스피커 볼륨을 올려요");	
	}

	@Override
	public void volumeDown() {
		System.out.println("스피커 볼륨을 내려요");
	}
}