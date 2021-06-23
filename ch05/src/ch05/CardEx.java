package ch05;

class Card {
	// 필드(멤버변수)
	String kind;
	int num;
	static int width, height; // static 정적 변수
	//static int width = 100, height = 250;
	
// Card() {} <- 생성자 생략	
	
	// 메서드
	void print() {
		System.out.println("카드 종류 : " + kind);
		System.out.println("카드번호 : " + num);
		System.out.println("가로 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("=======================");
	}
}

public class CardEx {
	public static void main(String[] args) {
		Card.width = 100;  // 정적변수의 경우 클래스에 귀속 되는 것이기 때문에 객체 생성 필요없이 '클래스명.멤버변수'로 접근 가능
		Card.height = 250; // 이하동문
		
		Card card1 = new Card();
		card1.kind =  "Spade";
		card1.num = 7;
		card1.print();
		
		Card card2 = new Card();
		card2.kind =  "ACE";
		card2.num = 1;
		card2.print();
		
		Card card3 = new Card();
		card3.kind =  "Clover";
		card3.num = 10;
		card3.print();
	}
}
