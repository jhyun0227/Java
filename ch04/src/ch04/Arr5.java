package ch04;

public class Arr5 {

	public static void main(String[] args) {
// ���� �迭 �����     index     0       1       2        3          4    
		String[] fruits = {"�����", "�ǵ���", "������", "���� ����", "��ī�� ����"};
		// �Ϲ� for
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("fruits[" + i + "] = " + fruits[i]);
		}
		
		System.out.println("=====================");
		// Ȯ�� for
		for (String a : fruits) { // a��� ���� �ȿ� �迭 fruits�� ���� �տ��� ���� �ϳ��� ���´� ������ ������
			System.out.println(a);
		}
		
		System.out.println();
		System.out.println();
		
		// ���� �迭 �����
		int[] arrs = {89, 56, 97, 77, 94};
		int sum1 = 0, sum2 = 0;
		// �⺻��
		for(int i = 0; i < arrs.length; i++) {
			sum1 += arrs[i];
		}
		// Ȯ����
		for(int ar : arrs) {
			sum2 += ar;
			System.out.printf("%d\n", sum2);
		}
		System.out.println();
		System.out.printf("%d\n", sum2);
		System.out.println("�հ� : " + sum1);
		System.out.println("�հ� : " + sum2);
	}
}

// �ε��� ������ �ʿ��ϴ� => �⺻��, �ʿ���� => Ȯ����
