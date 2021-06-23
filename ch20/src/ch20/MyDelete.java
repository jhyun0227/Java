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

		System.out.println("삭제 할 부서코드?");
		int deptno = Integer.parseInt(sc.nextLine());
		String sql = "delete from dept where deptno = ?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			pstmt = conn.prepareStatement(sql); // 여기서 sql
			pstmt.setInt(1, deptno); // 첫번째 ?에 deptno
			int result = pstmt.executeUpdate(); // 여기에 sql안씀
			if (result > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패 : " + e.getMessage());
		} finally {
			conn.close();
			pstmt.close();
		}
		sc.close();
	}
}
