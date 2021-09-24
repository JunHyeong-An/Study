package springbook.user.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NDriverConnection implements ConnectionMaker {
	private final static String URL = "jdbc:mysql://localhost:3306/tobySpring";
	private final static String ID = "root";
	private final static String PASSWORD = "1234";
	private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	@Override
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL, ID, PASSWORD);
		return con;
	}
}
