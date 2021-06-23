package ch20;

import java.sql.*;

public class OraConnection {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver); // driver load
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("���� ���� ����");
			conn.close();
		} catch (Exception e) {
			System.out.println("���� ���� : " + e.getMessage());
		}
	}
}