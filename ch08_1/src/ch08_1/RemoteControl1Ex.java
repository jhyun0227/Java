package ch08_1;

public class RemoteControl1Ex {
	public static void main(String[] args) {
		RemoteControl1[] rc = new RemoteControl1[2];
		rc[0] = new TV1();
		rc[1] = new Radio1();
		
		for (int i = 0; i < rc.length; i++) {
			rc[i].turnOn(); // 추상메소드 재정의 사용
			rc[i].turnOff(); // 추상메소드 재정의 사용
			rc[i].setMute(false); // 디폴트메소드 재정의 사용 x
			RemoteControl1.changeBattery(); // 정적메소드 재정의 사용 x
			System.out.println("최대볼륨 : " + RemoteControl1.MAX_VOUME);
			System.out.println("최소볼륨 : " + RemoteControl1.MIN_VOUME);
		}
	}
}
