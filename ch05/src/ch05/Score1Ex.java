package ch05;
class Score1 {
	String name;		// 멤버변수(객체변수)
	int kor, eng, math;

// 생략자 생략 Score1() { }	
	
	void print() { 	// 메소드
		int sum = kor + eng + math;
		System.out.println(name+"의 성적");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+sum/3);
	}
}
public class Score1Ex {
	public static void main(String[] args) {
		Score1 hong = new Score1(); Score1 black = new Score1(); Score1 iu = new Score1(); 
		hong.name = "홍길동";  black.name = "블랙핑크"; iu.name = "아이유";
		hong.kor = 70;  hong.eng = 80;  hong.math = 90;
		black.kor = 88; black.eng = 77; black.math = 82;
		iu.kor = 78;    iu.eng = 96;    iu.math = 69;
		hong.print();   black.print();  iu.print();
	}	   
}