package ch04;

public class Arr3 {
	public static void main(String[] args) {
		// ���� �迭 arr(�迭��) 5�� ����
		// ���� 1~10 ������ random�� ���ڸ� �ְ� ���
		int[] arr = new int[5]; // �迭�� arr ������ ���� 5���� �迭�� ������
		
		// ������ ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
		// ������ ���, �⺻ for
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr{" + i + "] = " + arr[i]);
		}
		
		System.out.println("=========================");
		// Ȯ�� for, ���������� ���
		for (int i : arr/*�迭��*/) {
			System.out.println(i);
		}
	}
}
