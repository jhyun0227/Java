package ch07;

public class Outer {
	// 필드(멤버변수)
	private int height;
	private int width;
	
	// 생성자
	public Outer(int height, int width) {
		this.height = height; this.width = width;
	}
	
	// 메소드 (getter)
	public Inner getInner() {
		return new Inner();
	}
	
	// Inner class는 외부 클래스의 멤버변수, 메소드를 자기것 처럼 사용
	// 컴파일된 클래스는 외부클래스.class 와 외부클래스$내부클래스.class 두개가 생성
	class Inner { // 클래스 안에 있는 클래스(내부 클래스)
		private float rate = 0.5f;
		
		
		public float volume() {
			return rate * height * width;
		}
	}
}
