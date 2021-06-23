package ch04;

public class Arr2 {
	public static void main(String[] args) {
		int i1 = 7; // 기본형은 초기화를 하지 않으면 에러
		System.out.println("i1 = " + i1);
		
		int[] i2 = new int[5]; // 배열은 0으로 값들이 초기값이 설정됨(초기화)
		for (int j = 0; j < 5; j++) {
			System.out.println(i2[j]);// 출력(변수명[인덱스])
		}
		
		int[] i3 = new int[5]; // 배열은 0으로 값들이 초기값이 설정됨(초기화)
		i3[0] = 7; i3[1] = 27; i3[2] = 782; i3[3] = 4; i3[4] = 999;
		// i3.length : i3의 인덱스의 갯수
		for (int k = 0; k < i3.length; k++) {
			System.out.println("i3[" +k +"] = " + i3[k]); // 출력(변수명[인덱스])
		}
	}
}
