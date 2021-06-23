package ch11;

import java.util.Arrays;

public class Copy1 {
	public static void main(String[] args) {
		int[] data = {0, 1, 2, 3, 4};
		int[] sCopy = null, dCopy = null;
		
		sCopy = data; // 주소만 전달 객체 동일
		dCopy = deepCopy(data); // 새로운 객체를 생성
		data[0] = 77;
		
		// Arrays.toString 메소드는 주소가 아닌 값을 출력할 때 사용
		System.out.println("원본 = " + Arrays.toString(data));
		System.out.println("sCopy = " + Arrays.toString(sCopy));
		System.out.println("dCopy = " + Arrays.toString(dCopy));
	}

	private static int[] deepCopy(int[] data) {
		int[] result = new int[data.length];
		System.arraycopy(data, 0, result, 0, data.length); // 배열을 복사
		return result; // 값을 리턴
	}
}
