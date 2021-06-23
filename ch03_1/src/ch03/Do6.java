package ch03;
import java.io.IOException;
public class Do6 {
	public static void main(String[] args) throws IOException {		
		int num = 0, i = 1;
		do {
			System.out.println("보고 싶은 구구단 입력하세요");
			num = System.in.read() - '0';
			System.in.read(); // CR \r처리
			System.in.read(); // LF \n처리
			if (num == 1) System.out.println("구구단 숫자가 아닙니다"); // 1이면 구구단 숫자가 아닙니다
			else if (num >= 2 && num <= 9) // 2 ~ 9면 구구단
				do {
					System.out.printf("%d * %d = %d\n",num, i, num*i);
					i++;
				}while(i <= 9);
			i = 1;
		}while(num != 0); // 0이 아니면 다시 실행하고 0이면 종료
		System.out.println("프로그램 종료");
	}
}