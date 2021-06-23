package ch16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명을 쓰세요.");
		String fileName = sc.nextLine();
		FileReader reader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(reader);
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(str);
		}
		sc.close(); br.close(); reader.close();
		System.out.println("프로그램 종료");
	}
}
