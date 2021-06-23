package ch07;

public class OuterEx {
	public static void main(String[] args) {
		Outer out = new Outer(10, 15);
		Outer.Inner inner1 = out.new Inner();
		Outer.Inner inner2 = out.getInner();
		
		System.out.println("부피 : " + inner1.volume());
		System.out.println("부피 : " + inner2.volume());
	}
}
// 내부클래스는 잘안써 없어지는 추세