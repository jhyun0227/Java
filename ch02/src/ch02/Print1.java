package ch02;

public class Print1 {
	public static void main(String[] args) {
		// %d : ����
		System.out.printf("%d\n", 16); // 16���
		System.out.printf("%5d\n", 16); // 5ĭ Ȯ���ϰ� 16���
		System.out.printf("%-5d\n", 16); // 5ĭ Ȯ���ϰ� �տ������� 16���
		System.out.printf("%05d\n", 16); // 5ĭ Ȯ���ϰ� ���ڰ� ���� ���� 0���� ä��
		
		System.out.printf("%-5d\n", 16000);
	}
}
