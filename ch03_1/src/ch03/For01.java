package ch03;

public class For01 {
	public static void main(String[] args) {
		//      �ʱ��  ;  ���ǽ�  ; ������
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i > 10; i--) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=3) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i*=2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		int i = 1; // �ʱ��
		for (; ;) { // ;�� �ݵ�� �־�� ������ ���� ���̳� ���� ���� ����
			System.out.print(i + "\t");
			if (i > 10) {
				break; // ���ǽ�
			}
			i++; // ������
		} // for(;;)�� while(true)�� ����.
	}
}
