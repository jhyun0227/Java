package ch11;

import java.util.Arrays;

public class Copy1 {
	public static void main(String[] args) {
		int[] data = {0, 1, 2, 3, 4};
		int[] sCopy = null, dCopy = null;
		
		sCopy = data; // �ּҸ� ���� ��ü ����
		dCopy = deepCopy(data); // ���ο� ��ü�� ����
		data[0] = 77;
		
		// Arrays.toString �޼ҵ�� �ּҰ� �ƴ� ���� ����� �� ���
		System.out.println("���� = " + Arrays.toString(data));
		System.out.println("sCopy = " + Arrays.toString(sCopy));
		System.out.println("dCopy = " + Arrays.toString(dCopy));
	}

	private static int[] deepCopy(int[] data) {
		int[] result = new int[data.length];
		System.arraycopy(data, 0, result, 0, data.length); // �迭�� ����
		return result; // ���� ����
	}
}
