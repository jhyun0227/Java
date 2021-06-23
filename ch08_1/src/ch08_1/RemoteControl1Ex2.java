package ch08_1;

public class RemoteControl1Ex2 {
	public static void main(String[] args) {
		// 클래스로 인터페이스를 구현하지 않고 바로 main에서 추상메서드를 재정의해서 객체 생성 가능
		// 객체를 생성하려면 객체명(참조변수, 레퍼런스 변수명)
		// RemoteControl1Ex2$1 클래스를 만들어서 객체를 생성한 것임
		// RemoteControl1Ex2$1는 무명클래스
		RemoteControl1 rc1 = new RemoteControl1() {
			public void turnOn() {
				System.out.println("스피커를 켭니다.");
			}
			public void turnOff( ) {
				System.out.println("스피커를 끕니다.");
			}
		}; // 객체 생성하는 문장 종료, 생성자의 역할을 다시하는것 인터페이스는 객체생성을 할 수 없기때문에 생성자가 없음
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setMute(true);
		RemoteControl1.changeBattery();
		
		// RemoteControl1Ex2$2는 무명클래스
		RemoteControl1 rc2 = new RemoteControl1() {
			public void turnOn() {
				System.out.println("스피커를 켭니다.");
			}
			public void turnOff( ) {
				System.out.println("스피커를 끕니다.");
			}
		}; // 객체 생성하는 문장 종료, 생성자의 역할을 다시하는것 인터페이스는 객체생성을 할 수 없기때문에 생성자가 없음
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setMute(true);
		RemoteControl1.changeBattery();
	}
}

// 몰라도 크게 상관은 없어
