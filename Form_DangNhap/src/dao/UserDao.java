package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import modol.User;

public class UserDao implements DAOInterFace<User>{

	public static UserDao getUserDao() {
		return new UserDao();
	}
	
	@Override
	public int insert(User t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			
			String sql =	"INSERT INTO user(username,password)"+
							" VALUES(?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			pst.setString(2, t.getPassword());
			
			ketQua = pst.executeUpdate();
			
			System.out.println("Insert "+ketQua+" Table User thành công");
			
			JDBCUtil.closeGetConnettion(con);
		} catch (Exception e) {
			System.out.println("Lỗi Insert Table User "+ketQua);
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(User t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			
			String sql =	"UPDATE user"+
							" SET username = ?, password = ?"+
							" WHERE username = ?";
								
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			pst.setString(2, t.getPassword());
			pst.setString(3, t.getUserName());
			
			ketQua = pst.executeUpdate();
			
			System.out.println("Update "+ketQua+" Table User thành công");
			
			JDBCUtil.closeGetConnettion(con);
		} catch (Exception e) {
			System.out.println("Lỗi Update Table User "+ketQua);
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int dalete(User t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			
			String sql =	"DELETE FROM user WHERE username = ?";
							
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			
			ketQua = pst.executeUpdate();
			
			System.out.println("Delete "+ketQua+" Table User thành công");
			
			JDBCUtil.closeGetConnettion(con);
		} catch (Exception e) {
			System.out.println("Lỗi Delete Table User "+ketQua);
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<User> selectAll() {
		ArrayList<User> arr = new ArrayList<User>();
		try {
			Connection con = JDBCUtil.getConnection();
			
			String sql =	"SELECT * FROM user";
							
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rt = pst.executeQuery();
			
			while(rt.next()) {
				String username = rt.getString("username");
				String password = rt.getString("password");
				
				User user = new User(username, password);
				
				arr.add(user);
			}
			
			System.out.println("Lấy dữ liệu từ Table User thành công");
			
			JDBCUtil.closeGetConnettion(con);
		} catch (Exception e) {
			System.out.println("Lỗi Lấy dữ liệu từ Table User ");
			e.printStackTrace();
		}
		return arr;
	}

	@Override
	public User selectById(User t) {
		User user = null;
		try {
			Connection con = JDBCUtil.getConnection();
			
			String sql =	"SELECT * FROM user where username = ? and password = ?";
							
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			pst.setString(2, t.getPassword());
			
			ResultSet rt = pst.executeQuery();

			if(rt.next() != false) {
				user = new User(rt.getString("username"), rt.getString("password"));
			}else {
				System.out.println("Không tìm thấy user: "+t.getUserName());
			}
	
			JDBCUtil.closeGetConnettion(con);
		} catch (Exception e) {
			System.out.println("Lỗi Lấy dữ liệu từ Table User ");
			e.printStackTrace();
		}
		return user;
	}

}
