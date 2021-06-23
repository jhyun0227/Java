package ch17;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class UdpClient {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip를 입력하세요");
		String ip = sc.nextLine();
		System.out.println("보낼 메세지를 입력 하세요");
		String msg = sc.nextLine();
		
		DatagramSocket ds = new DatagramSocket();
		InetAddress addr = InetAddress.getByName(ip);
		byte[] bt = msg.getBytes();
		DatagramPacket dp = new DatagramPacket(bt, bt.length, addr, 5007);
		ds.send(dp);
		System.out.println("보내기 성공");
		sc.close();
		ds.close();
	}
}