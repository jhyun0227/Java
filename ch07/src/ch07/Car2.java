package ch07;

public class Car2 {
	// 필드(멤버변수)
	// 다른 클래스(객체)를 멤버변수로 사용 (Engine 클래스)
	private Engine eg;
	private String color;
	
	// 생성자
	Car2() {}
	Car2(Engine eg, String color) {
		this.eg = eg; this.color = color;
	}
	
	// 메소드 (getter setter)
	public Engine getEg() {
		return eg;
	}
	public void setEg(Engine eg) {
		this.eg = eg;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	void print() {
		eg.print();
		System.out.println("색깔 : " + color);
	}
}
