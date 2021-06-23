package ch03;
import java.util.Scanner;
public class Scanner1 {
// 숫자 비교 ==, !=
// 문자비교 문자.equals("문자"), !문자.equals("문자")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("문자열을 입력하세요");
			str = sc.nextLine(); // 문자 1줄 읽기
			System.out.println("입력한 문자는 "+str+"입니다");
			if (str.equals("x"))
				break; // 반복문 종료
		}while(true);
	//	}while(!str.equals("x"));
		System.out.println("프로그램 종료");
		sc.close();
	}
}