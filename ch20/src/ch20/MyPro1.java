package ch20;

import java.sql.*;
import java.util.Scanner;

public class MyPro1 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC";
		Connection conn = null;
		CallableStatement cs = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("�μ��ڵ�?");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("�μ���?");
		String dname = sc.nextLine();
		System.out.println("�ٹ���?");
		String loc = sc.nextLine();
		String sql = "{call dept_insert(?,?,?)}";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			cs = conn.prepareCall(sql);
			cs.setInt(1, deptno);
			cs.setString(2, dname);
			cs.setString(3, loc);
			int result = cs.executeUpdate();
			if (result > 0) {
				System.out.println("�Է� ����");
			} else {
				System.out.println("�Է� ����");
			}
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
		} finally {
			conn.close();
			cs.close();
		}
		sc.close();
	}
}
