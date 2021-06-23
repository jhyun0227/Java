package ch02;

public class Unicode1 {
	public static void main(String[] args) {
		// %s : 문자열, %c : 문자, %d : 정수, \n : 줄바꿈
		// 작은 따옴표('') 문자, 큰 따옴표("") 문자열       문자  아스키 값으로 변경
		System.out.printf("문자 %c의 유니코드는 %d \n", 'A', (int)'A');
		System.out.printf("문자 %c의 유니코드는 %d \n", 'a', (int)'a');
		System.out.printf("문자 %c의 유니코드는 %d \n", '0', (int)'0');
		System.out.printf("문자 %c의 유니코드는 %d \n", 'A'+1, (int)('A'+1));
	}
}
