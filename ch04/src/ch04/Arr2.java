package ch04;

public class Arr2 {
	public static void main(String[] args) {
		int i1 = 7; // �⺻���� �ʱ�ȭ�� ���� ������ ����
		System.out.println("i1 = " + i1);
		
		int[] i2 = new int[5]; // �迭�� 0���� ������ �ʱⰪ�� ������(�ʱ�ȭ)
		for (int j = 0; j < 5; j++) {
			System.out.println(i2[j]);// ���(������[�ε���])
		}
		
		int[] i3 = new int[5]; // �迭�� 0���� ������ �ʱⰪ�� ������(�ʱ�ȭ)
		i3[0] = 7; i3[1] = 27; i3[2] = 782; i3[3] = 4; i3[4] = 999;
		// i3.length : i3�� �ε����� ����
		for (int k = 0; k < i3.length; k++) {
			System.out.println("i3[" +k +"] = " + i3[k]); // ���(������[�ε���])
		}
	}
}
