package ch20;

import java.sql.*;
import java.util.Scanner;

// 사번을 입력 받아서 사원정보 출력
public class MySelect2 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("보고싶은 직원의 사번을 입력하세요.");
		int empno = sc.nextInt();
		String sql = "select * from dept where empno = " + empno;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println("사번 : " + rs.getInt("empno")); // rs.getInt(1)
				System.out.println("이름 : " + rs.getString("ename")); // rs.getInt(2)
				System.out.println("업무 : " + rs.getString("job")); // rs.getInt(3)
				System.out.println("관리자 사번 : " + rs.getString("mgr")); // rs.getInt(4)
				System.out.println("입사일 : " + rs.getString("hiredate")); // rs.getInt(5)
				System.out.println("급여 : " + rs.getString("sal")); // rs.getInt(6)
				System.out.println("comm : " + rs.getString("comm")); // rs.getInt(7)
				System.out.println("부서코드 : " + rs.getString("deptno")); // rs.getInt(8)
			} else {
				System.out.println("없는 부서입니다.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			rs.close();
			stmt.close();
			conn.close();
		}
		sc.close();
	}
}
