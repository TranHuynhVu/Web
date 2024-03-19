package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection GetConnetion() {
		Connection c = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			String url = "jdbc:mysql://127.0.0.1:3306/qltv";
			String username = "root";
			String password = "1234567890";
			
			c = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			System.out.println("Loi ket noi sql");
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void CloseConetion(Connection c) {
		if(c != null) {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
