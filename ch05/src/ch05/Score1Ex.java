package ch05;
class Score1 {
	String name;		// �������(��ü����)
	int kor, eng, math;

// ������ ���� Score1() { }	
	
	void print() { 	// �޼ҵ�
		int sum = kor + eng + math;
		System.out.println(name+"�� ����");
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("���� : "+sum);
		System.out.println("��� : "+sum/3);
	}
}
public class Score1Ex {
	public static void main(String[] args) {
		Score1 hong = new Score1(); Score1 black = new Score1(); Score1 iu = new Score1(); 
		hong.name = "ȫ�浿";  black.name = "����ũ"; iu.name = "������";
		hong.kor = 70;  hong.eng = 80;  hong.math = 90;
		black.kor = 88; black.eng = 77; black.math = 82;
		iu.kor = 78;    iu.eng = 96;    iu.math = 69;
		hong.print();   black.print();  iu.print();
	}	   
}