package ch05;

class Card {
	// �ʵ�(�������)
	String kind;
	int num;
	static int width, height; // static ���� ����
	//static int width = 100, height = 250;
	
// Card() {} <- ������ ����	
	
	// �޼���
	void print() {
		System.out.println("ī�� ���� : " + kind);
		System.out.println("ī���ȣ : " + num);
		System.out.println("���� : " + width);
		System.out.println("���� : " + height);
		System.out.println("=======================");
	}
}

public class CardEx {
	public static void main(String[] args) {
		Card.width = 100;  // ���������� ��� Ŭ������ �ͼ� �Ǵ� ���̱� ������ ��ü ���� �ʿ���� 'Ŭ������.�������'�� ���� ����
		Card.height = 250; // ���ϵ���
		
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
