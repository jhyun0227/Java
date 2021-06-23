package ch20;

import java.sql.*;
import java.util.Scanner;

public class OraPro2 {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� ����� �Է� �Ͻÿ�");
		int empno = Integer.parseInt(sc.nextLine());
		String sql = "{call emp_info(?,?,?)}";
		Connection conn = null;
		CallableStatement cs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs = conn.prepareCall(sql);
			cs.setInt(1, empno);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.INTEGER);
			cs.execute(); // in, out�� ���� ���� execute�� ����
			System.out.println("�̸� : " + cs.getString(2));
			System.out.println("�޿� : " + cs.getInt(3));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			cs.close();
			conn.close();
		}
		sc.close();
	}
}