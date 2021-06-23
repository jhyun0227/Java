package ch03;
import java.io.IOException;
public class Do3 {
	public static void main(String[] args) throws IOException {
		int num; // 여기에 정의하면 main메서드 범위에서 사용
		do { // 7+enter , enter=> \r\n => CR(커서 앞으로 가라), LF(줄바꿔라)
			 // CR은 13,  LF는 10
			System.out.println("한자리 짝수를 입력하세요");
			// num은 사용범위가 do { 부터 } // 지역변수
			num = System.in.read() - '0'; // 13 -48=> -35, 10-48=> -38
			System.in.read(); // CR \r 처리
			System.in.read(); // LF \n 처리
		}while(num % 2 == 1);
		System.out.println("입력한 짝수 : " + num);
	}
}