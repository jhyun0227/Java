package ch07;

public class Engine {
	// 필드(멤버변수)
	private int displacement;
	private String type;
	
	
	// 생성자
	public Engine() { }
	Engine (int displacement, String type) {
		this.displacement = displacement; this.type = type;
	}
	
	
	// 메소드 (getter setter)
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	void print() {
		System.out.println("=========================");
		System.out.println("배기량 : " + displacement);
		System.out.println("엔진 타입 : " + type);
	}
	
	
}
