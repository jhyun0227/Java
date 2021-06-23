package ch06_1;

public class StudentEx {
	public static void main(String[] args) {
	Student st1 = new Student();
	st1.name = "È«±æµ¿";
	st1.kor = 100; st1.eng = 60; st1.math = 76;
	st1.print();
	
	Student st2 = new Student("È«±æµ¿", 100, 60, 76);
	st2.print();
	
	Student st3 = new Student("Á¦ÀÎ", 90, 88, 76);
	st3.print();
	}
}
