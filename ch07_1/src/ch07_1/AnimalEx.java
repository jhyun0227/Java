package ch07_1;

public class AnimalEx {
	public static void main(String[] args) {
		Animal[] animals = {new Pig(), new Bird(), new Fish()};
//		      참조형
		for (Animal animal : animals) {
			animal.move();
			System.out.println("x = " + animal.x);
			if (animal instanceof Bird) {
				((Bird)animal).eat();
			}
		}
		System.out.println("========================");
		for (int i = 0; i < animals.length; i++) {
			animals[i].move();
			System.out.println("x = " + animals[i].x);
			if(animals[i] instanceof Bird) {
				((Bird)animals[i]).eat();
			}
		}
	}
}

// 부모속성을 선언하고 자식속성의 생성자를 이용할때
// 멤버변수와 메소드는 부모의 것만 사용이 가능하다.
// 그러나 메소드의 경우 오버라이딩이 되엇을때 자식의 메소드만이 사용되어진다.
