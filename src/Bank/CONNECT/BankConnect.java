package Bank.CONNECT;

import java.sql.Connection;
import java.sql.DriverManager;

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
}
