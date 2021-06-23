package ch09_1;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		 int[] number = new int[100]; // 0 ~ 9 사이 정수 100개
		 int[] count = new int[10];	  // 초기값은 0
		 Random ran = new Random();
		 for (int i = 0; i < number.length; i++) {
			 number[i] = ran.nextInt(10); 		// number[i] 0~9사이 정수값 nextInt 메소드는 0~매개변수-1 난수값
			 System.out.print(number[i]+" "); 	// 숫자 출력하고 한칸 옆으로
			 if (i%10==9) {
				 System.out.println(); 			// 10개 출력하고 줄바꿈
			 }
		 }
		 for(int i=0;i< number.length; i++) {
			 // number[i]가 들어있는 count인덱스에 1증가
			 count[number[i]]++;			// 나온 숫자의 개수를 카운트하는 반복문
		 }
		 for (int i=0; i < count.length ; i++ ) {
			 System.out.println( i  + "의 개수 :" + printGraph('#', count[i]) + " " + count[i]);
		 	}
		 }

	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];
		// 숫자만큼 #으로 채워라
		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;  // bar = {'#', '#', '#', '#', '#', '#'}
		}
		return new String(bar); // "######"
	}

}
