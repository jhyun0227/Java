package ch04;

public class Arr5 {

	public static void main(String[] args) {
// 문자 배열 만들기     index     0       1       2        3          4    
		String[] fruits = {"산딸기", "판딸기", "집딸기", "죽은 딸기", "알카리 딸기"};
		// 일반 for
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("fruits[" + i + "] = " + fruits[i]);
		}
		
		System.out.println("=====================");
		// 확장 for
		for (String a : fruits) { // a라는 변수 안에 배열 fruits의 값이 앞에서 부터 하나씩 들어온다 마지막 값까지
			System.out.println(a);
		}
		
		System.out.println();
		System.out.println();
		
		// 문자 배열 만들기
		int[] arrs = {89, 56, 97, 77, 94};
		int sum1 = 0, sum2 = 0;
		// 기본형
		for(int i = 0; i < arrs.length; i++) {
			sum1 += arrs[i];
		}
		// 확장형
		for(int ar : arrs) {
			sum2 += ar;
			System.out.printf("%d\n", sum2);
		}
		System.out.println();
		System.out.printf("%d\n", sum2);
		System.out.println("합계 : " + sum1);
		System.out.println("합계 : " + sum2);
	}
}

// 인덱스 순서가 필요하다 => 기본형, 필요없다 => 확장형
