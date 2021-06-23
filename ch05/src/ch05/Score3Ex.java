package ch05;
class Score3 {
	String name;	int[] score;	String[] tit; // 멤버변수, 전역변수, 인스턴스변수(객체를 생성한 다음에 사용)
	
// 생성자 생략 Score3() {}	
	
	// 메소드
	void title() {
		System.out.print("이름\t");
		for (int i = 0; i < tit.length; i++) {
			System.out.print(tit[i] + "\t");
		}
		
		System.out.print("총점\t합계\n");
		
		for (int i = 0; i < 13*tit.length; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	void print() {
		int sum = 0;
		System.out.print(name+"\t");
		for (int i = 0; i < score.length; i++) {			
			sum += score[i];
			System.out.print(score[i]+"\t");
		}
		System.out.println(sum+"\t"+sum/score.length);
	}
}
public class Score3Ex {
	public static void main(String[] args) {
		Score3 hong = new Score3(); Score3 black = new Score3(); Score3 iu = new Score3(); 
		hong.name = "홍길동";  black.name = "블랙핑크"; iu.name = "아이유";
		hong.tit = new String[] {"국어", "영어", "수학", "과학"};
		hong.score = new int[] {70, 80, 90, 77};  black.score = new int[] {88, 77, 82, 96};
		iu.score = new int[] {78, 96, 69, 68};
		hong.title();	hong.print();   black.print();  iu.print();
	}	   
}