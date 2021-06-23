package ch04_2;
import java.util.Scanner;
public class Lotto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 ~ 45램덤한 값
		int temp = 0;
		int[] lotto = new int[6];
		System.out.println("몇 개를 고정 시킬까요 ?");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("로또 원하는 번호를 입력하세요");
			lotto[i] = sc.nextInt();
			for (int j = i-1;j >=0; j--) { 
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}		
		for (int i = num; i < lotto.length; i++) {
			 //        0 ~ 44   0.00001 ~ 44.9999
			lotto[i] = (int)(Math.random() * 45) + 1;
			// 앞에 데이터와 비교해서 같으면 다시 숫자 생성 인덱스 0까지
			for (int j = i-1;j >=0; j--) { 
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		for(int i =0; i < lotto.length;i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for (int i =0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		sc.close();
	}
}