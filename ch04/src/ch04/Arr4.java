package ch04;

public class Arr4 {
	public static void main(String[] args) {
		int[] a = {34, 78, 99, 56, 66}; // ���� �迭 5���� �����ϰ� �� ���� /����� ������ �Բ� ��
		// int[] a = new int[] {34, 78, 99, 56, 66};
		// �⺻�� for
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("===========================");
		// Ȯ���� for / �迭���� �ϳ��� �����Ͽ� ������ �ְ� ���� ���� ���
		for (int i : a) {
			System.out.println(i);
		}
	}
}
