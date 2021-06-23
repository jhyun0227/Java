package ch20;

import java.sql.*;
import java.util.Scanner;

public class MyInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("부서코드 ?");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("부서명 ?");
		String dname = sc.nextLine();
		System.out.println("근무지 ?");
		String loc = sc.nextLine();
//		String sql = "insult into dept values {" + deptno + ", " + dname + ", " + loc + ")";
		String sql = String.format("insert into dept values(%d, '%s', '%s')", deptno, dname, loc);

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			// result 성공한 갯수(입력한 대부분 1이지만 수정이나 삭제는 조건에 따라 여러개가 될 수 있다.)
			if (result > 0) {
				System.out.println("입력 성공 ㅋㅋㅋ");
			} else {
				System.out.println("입력 실패 ㅋㅋㅋ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			stmt.close();
			conn.close();
		}
		sc.close();
	}
}
