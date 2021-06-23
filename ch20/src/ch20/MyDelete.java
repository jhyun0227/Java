package ch20;

import java.sql.*;
import java.util.Scanner;

public class MyDelete {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC";
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �� �μ��ڵ�?");
		int deptno = Integer.parseInt(sc.nextLine());
		String sql = "delete from dept where deptno = ?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			pstmt = conn.prepareStatement(sql); // ���⼭ sql
			pstmt.setInt(1, deptno); // ù��° ?�� deptno
			int result = pstmt.executeUpdate(); // ���⿡ sql�Ⱦ�
			if (result > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}
		} catch (Exception e) {
			System.out.println("���� ���� : " + e.getMessage());
		} finally {
			conn.close();
			pstmt.close();
		}
		sc.close();
	}
}
