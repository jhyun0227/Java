package ch05;
class Score3 {
	String name;	int[] score;	String[] tit; // �������, ��������, �ν��Ͻ�����(��ü�� ������ ������ ���)
	
// ������ ���� Score3() {}	
	
	// �޼ҵ�
	void title() {
		System.out.print("�̸�\t");
		for (int i = 0; i < tit.length; i++) {
			System.out.print(tit[i] + "\t");
		}
		
		System.out.print("����\t�հ�\n");
		
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
		hong.name = "ȫ�浿";  black.name = "����ũ"; iu.name = "������";
		hong.tit = new String[] {"����", "����", "����", "����"};
		hong.score = new int[] {70, 80, 90, 77};  black.score = new int[] {88, 77, 82, 96};
		iu.score = new int[] {78, 96, 69, 68};
		hong.title();	hong.print();   black.print();  iu.print();
	}	   
}