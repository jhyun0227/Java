package ch04_1;

public class ArrCpy2 {
	public static void main(String[] args) {
		int[] arr1 = {34, 56, 67, 88, 92};
		// 0  1  2  3  4  5  6  7  8  9
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // 주소가 아닌 실제 배열 값을 복사
		
		arr1[0] = 77; // 복사 된 값은 주소와 달리 바뀌지 않는다
		for (int ar : arr1) {
			System.out.print(ar + "\t");
		}
		System.out.println();
		for (int ar : arr2) {
			System.out.print(ar + "\t");
		}
		
		int[] arr3 = new int[10];
		//                        3은 받는 배열의 시작위치
		System.arraycopy(arr1, 0, arr3, 3, arr1.length);
		System.out.println();
		for (int ar : arr3) {
			System.out.print(ar + "\t");
		}
		
		int[] arr4 = new int[10];
		//              2는 주는 배열의 주기 시작하는 위치        
		System.arraycopy(arr1, 2, arr4, 3, 3); // 마지막 3은 데이터 전달하는 개수
		System.out.println();
		for (int ar : arr4) {
			System.out.print(ar + "\t");
		}
		
	}
}

// 배열을 생성할때 값을 입력하지 않을 경우 정수는 0, 문자는 null이 default 값
// ex) Int[] a = new int[5] -> 0  0  0  0  0
// ex) String[] a = new string[5] -> null null null null null
