package ch05;

public class Score2Ex {
	public static void main(String[] args) {
		System.out.println("�̸�\t����\t����\t����\t�հ�\t���");
		
		Score2 sc = new Score2();
		sc.name = "ȫ�浿";
		sc.kor = 70;
		sc.eng = 80;
		sc.math = 90;
		sc.print();
		
		System.out.println();
		
		Score2 sc1 = new Score2();
		sc1.name = "����ũ";
		sc1.kor = 88;
		sc1.eng = 77;
		sc1.math = 82;
		sc1.print();
		
		System.out.println();
		
		Score2 sc2 = new Score2();
		sc2.name = "������";
		sc2.kor = 78;
		sc2.eng = 96;
		sc2.math = 69;
		sc2.print();	
	}
}
