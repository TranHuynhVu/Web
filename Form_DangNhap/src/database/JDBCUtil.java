package database;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JDBCUtil {
	
	public static Connection getConnection() {
		Connection c = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			String url = "jdbc:mysql://127.0.0.1:3306/user_form";
			String username = "root";
			String password = "1234567890";
			
			c = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			System.out.println("Lỗi kết nối database "+c);
			e.printStackTrace();
		}	
		return c;
	}
	
	public static void closeGetConnettion(Connection c) {
		try {
			if(c != null) {
				c.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
