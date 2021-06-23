package ch08_1;

public interface RemoteControl1 {
	// 상수
	// 상수에 대문자 쓴 이유, 인터페이스의 변수는 public static final이 생략
	int MAX_VOUME = 10; // 변수에 대문자 쓴 이유, 인터페이스의 변수는 public static final이 생략
	int MIN_VOUME = 0;
	
	// 추상메소드
	//public abstract 생략
	void turnOn();
	void turnOff();
	
	// 디폴트메소드
	// 디폴트 메서드 실행부를 만들 수 있다.
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 헤제 합니다.");
		}
	}
	
	// 정적(static)메소드
	// 정적메서드도 실행부를 만들 수 있다.
	static void changeBattery() {
		System.out.println("건전지를 교환 합니다.");
	}
}
