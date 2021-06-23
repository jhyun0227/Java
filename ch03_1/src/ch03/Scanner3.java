package ch03;
import java.util.Scanner;
public class Scanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int num = 0;
		do {
			System.out.println("정수를 입력하세요");
			// 숫자와 문자를 교대로 읽을 때는 문자로 읽은 후에 숫자로 변경
			// Integer.parseInt는 숫자형식으로 입력한 문자열을 정수로 변경
			num = Integer.parseInt(sc.nextLine()); // 12+\r\n
			// sc.nextInt(); // 12만 읽고 \r\n 남긴다.
			System.out.println("입력한 숫자는 "+num+"입니다");
			System.out.println("문자열을 입력하세요");
			str = sc.nextLine(); // 문자 1줄 읽기
			System.out.println("입력한 문자는 "+str+"입니다");
			if (str.equals("x"))
				break; // 반복문 종료			
		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}
}