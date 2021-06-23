package ch17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inrt1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getByName("www.choongang.co.kr");
		System.out.println("addr = " + addr.getHostAddress());
	}
}
