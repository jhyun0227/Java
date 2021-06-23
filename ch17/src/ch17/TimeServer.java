package ch17;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.GregorianCalendar;
public class TimeServer {
	public static void main(String[] args) throws IOException  {
		ServerSocket ss = new ServerSocket(7000);
		try {
			System.out.println("서버 작동중");
			while(true) {
				Socket client = ss.accept(); // client가 접속하기를 기다림
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(new GregorianCalendar());
				oos.flush();
				os.close(); oos.close(); client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			ss.close();
		}
	}
}