package ch03;
public class Break2 {
	public static void main(String[] args) {
		a : for (int i = 1; i <=10; i++) { // a�� label
				for (int j = 1; j <=10 ;j++) {
					System.out.println("���");
					//if ( j > 4) break; // ���� for�� ����
				if ( j > 4) break a; // label a�� �ش��ϴ� for���� ����
			}
			System.out.println("��� : " + i);
		}
	}
}