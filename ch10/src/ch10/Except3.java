package ch10;

public class Except3 {
	public static void main(String[] args) {
		int[] x = {12, 45, 25, 0, 6};
		for (int i = 0; i <= x.length; i++) {
			try { // try, catch ��
			System.out.printf("%d / %d = %d\n", 100, x[i], 100/x[i]);
			} catch (ArithmeticException e) { // ���ڰ� 0���� ����������
				System.out.println("0���� ���� �� �����ϴ�");
			} catch (ArrayIndexOutOfBoundsException e) { // �ε��� ������ �����.
				System.out.println("�ε��� ������ ���� �����ϴ�.");
			} catch (Exception e) { // Ȥ�� �ٸ� ����?
				System.out.println(e.getMessage());
			} finally { // ���ܿ� ���� ���� ������ �����Ѵ�.
				System.out.println("�� ������ ����");
			}
		}
	}
}
