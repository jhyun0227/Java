package ch08_1;
interface Bird {
	void eat();
}

// implements 뒤에는 여러개의 인터페이스를 사용할 수 있다.
public class Monster extends Person2 implements Fish, Bird {	
	@Override // 오버라이딩은 main문 밖에 
	public void eat() {
		System.out.println("부리로 쪼아 먹다.");
	}

	@Override // 오버라이딩은 main문 밖에
	public void swim() {
		System.out.println("물속에서 장시간 헤엄친다.");
	}
}	