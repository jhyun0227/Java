package ch03;
public class Continue1 {
	public static void main(String[] args) {		
		for (int i =0; i < 10; i++) {
			System.out.println("�ݺ��Ѵ� "+i);
			if (i > 3) continue; // �Ʒ������� �������� �ʰ� �������� ����
			System.out.println("���� "+i);
		}
	}
}