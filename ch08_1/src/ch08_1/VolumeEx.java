package ch08_1;

public class VolumeEx {
	public static void main(String[] args) {
		// 인터페이스를 사용해도 상속처럼 배열을 만들어 한번에 처리가 가능
		// 서로 다른 클래스를 관계를 맺어줌
		Volume[] vols = new Volume[3];
		vols[0] = new Radio();
		vols[1] = new TV();
		vols[2] = new Speaker();
		
		for (Volume vol : vols) {
			vol.volumeUp();
			vol.volumeDown();
		}
	}
}
