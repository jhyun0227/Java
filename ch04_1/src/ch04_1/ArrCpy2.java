package ch04_1;

public class ArrCpy2 {
	public static void main(String[] args) {
		int[] arr1 = {34, 56, 67, 88, 92};
		// 0  1  2  3  4  5  6  7  8  9
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // �ּҰ� �ƴ� ���� �迭 ���� ����
		
		arr1[0] = 77; // ���� �� ���� �ּҿ� �޸� �ٲ��� �ʴ´�
		for (int ar : arr1) {
			System.out.print(ar + "\t");
		}
		System.out.println();
		for (int ar : arr2) {
			System.out.print(ar + "\t");
		}
		
		int[] arr3 = new int[10];
		//                        3�� �޴� �迭�� ������ġ
		System.arraycopy(arr1, 0, arr3, 3, arr1.length);
		System.out.println();
		for (int ar : arr3) {
			System.out.print(ar + "\t");
		}
		
		int[] arr4 = new int[10];
		//              2�� �ִ� �迭�� �ֱ� �����ϴ� ��ġ        
		System.arraycopy(arr1, 2, arr4, 3, 3); // ������ 3�� ������ �����ϴ� ����
		System.out.println();
		for (int ar : arr4) {
			System.out.print(ar + "\t");
		}
		
	}
}

// �迭�� �����Ҷ� ���� �Է����� ���� ��� ������ 0, ���ڴ� null�� default ��
// ex) Int[] a = new int[5] -> 0  0  0  0  0
// ex) String[] a = new string[5] -> null null null null null
