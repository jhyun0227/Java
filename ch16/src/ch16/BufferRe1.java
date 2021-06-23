package ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRe1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		System.out.println("이름을 입력하세요");
		String name = br.readLine();
		System.out.println("주소를 입력하세요");
		String addr = br.readLine();
		System.out.println(name + "님 반가워요, " + addr + "에 사시는 군요");
		br.close();
	}
}
