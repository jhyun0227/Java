package ch17;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7001); // 통신할 서버 생성
			System.out.println("서버 실행중");
			while(true) {
				Socket client = ss.accept(); // 클라이언트가 연결할 때까지 대기
//				고객이 보낸 데이터를 읽을 준비
				DataInputStream dis = new DataInputStream(client.getInputStream());
//				고객데이터 한글처리해서 한줄씩 읽을 준비
				BufferedReader br = new BufferedReader(new InputStreamReader(dis));
//				                         보낸 ip주소              보낸 메세지
				System.out.println(client.getInetAddress()+"=>"+br.readLine());
				dis.close();  br.close();  client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}