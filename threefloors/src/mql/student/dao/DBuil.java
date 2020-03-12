package mql.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBuil {
	static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	static String root = "root";
	static String password = "2371337";

	public static Connection GetConection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, root, password);
		return connection;
	}
	
	public static PreparedStatement GetPreState(Connection cnt,String sql) throws SQLException {
		PreparedStatement prepareStatement = cnt.prepareStatement(sql);
		return prepareStatement;
	}
}
