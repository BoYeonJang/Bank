package Bank.CONNECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankConnect {

	static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://127.0.0.1:3306/boyeondb?serverTimezone=UTC";
	static final String USER = "boyeon";
	static final String PASSWORD = "12345";

	// 접속
	public static Connection getConnection() throws Exception {
		return getConnection(URL, USER, PASSWORD);
	}

	public static Connection getConnection(String url, String user, String password) throws Exception {
		Class.forName(DRIVER_NAME);
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	// close
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection conn, PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(conn);
	}

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(conn, ps);
	}

	public static void main(String[] args) {

		Connection conn = null;
		try {
			conn = BankConnect.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(conn);
	}
}
