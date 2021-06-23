package ch17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class URLConn1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("URL을 입력 하세요");
		String addr = sc.nextLine();
		URL url = new URL(addr); // 인터넷 주소 생성
		URLConnection uc = url.openConnection();  // 인터넷 연결
		InputStream is = uc.getInputStream();
		// 한줄씩 일고 처리, utf-8한글
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
		String str = null;
		while(true) {
			str = br.readLine();
			if (str == null) break;
			System.out.println(str);
		}
		is.close(); br.close(); sc.close();
	}
}