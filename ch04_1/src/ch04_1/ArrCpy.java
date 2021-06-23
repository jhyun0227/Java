package ch04_1;

public class ArrCpy {
	public static void main(String[] args) {
		int[] arr1 = {34, 56, 67, 88};
		int[] arr2 = arr1; // 주소를 복사해 준 것 (값 x)
		arr1[0] = 77; // arr1이 바뀌면 arr2는 어떻게 될까?
		for (int ar : arr1) {
			System.out.print(ar + "\t");
		}
		System.out.println();
		for (int ar : arr2) {
			System.out.print(ar + "\t");
		}
	}
}
