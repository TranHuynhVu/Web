package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.text.rtf.RTFEditorKit;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import database.JDBCUtil;
import model.User;
import model.User;

public class userDAO implements DAOInterface<User>{

	public static userDAO getuserDAO() {
		return new userDAO();
	}
	
	@Override
	public int insert(User t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối với database
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo đối tượng PreparedStatement 
			String sql = "INSERT INTO User(username,password,tenuser)"+
					 " VALUES(?,?,?)";
		
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, t.getUsername());
			pst.setString(2, t.getPassword());
			pst.setString(3, t.getTenuser());
			
			// Bước 3: 
			ketQua = pst.executeUpdate();
			
			// Bước 4: 
			System.out.println("Bạn đã Insert thành công "+ketQua+ " dòng dữ liệu vào Table User");
			
			// Bước 5: ngắt kết nối với database
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			System.out.println("Insert bị lỗi");
			e.printStackTrace();
		}
		return ketQua;	
	}

	@Override
	public int update(User t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối với database
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo đối tượng PreparedStatement 
			String sql =	"UPDATE User"+
							" SET"+
							" username = ?"+
							", password = ?"+
							", tenuser = ?"+
							" WHERE username = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, t.getUsername());
			pst.setString(2, t.getPassword());
			pst.setString(3, t.getTenuser());
			pst.setString(4, t.getUsername());
			// Bước 3: viết câu lệnh sql
		
			ketQua = pst.executeUpdate();
			
			// Bước 4: 
			System.out.println("Bạn đã Update thành công "+ketQua+ " dòng dữ liệu");
			
			// Bước 5: ngắt kết nối với database
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			System.out.println("Update bị lỗi");
			e.printStackTrace();
		}
		return ketQua;	
	}

	@Override
	public int delete(User t) {
		int ketQua = 0;
		try {
			// tạo kết nối với database
			Connection con = JDBCUtil.getConnection();
			
			// tạo statement
			String sql =	"DELETE"+
							" FROM User"+
							" WHERE username = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, t.getUsername());
			
			// viết câu lệnh sql
		
			
			ketQua = pst.executeUpdate();
			
			System.out.println("Bạn đã delete thành công "+ketQua+ " dòng dữ liệu");
			
			// ngắt kết nối với database
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			System.out.println("Delete bị lỗi");
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<User> selectALL() {
		ArrayList<User> ketQua = new ArrayList<User>();
		
		try {
			Connection con = JDBCUtil.getConnection();
			
			String sql = "SELECT * FROM User";
			PreparedStatement pst = con.prepareStatement(sql);
			
	
			// tạo đối tượng ResultSet để lâu kết quả của câu lệnh select
			ResultSet rt = pst.executeQuery();
			
			while(rt.next()) {
				String username = rt.getString("username");
				String password = rt.getString("password");
				String tenuser = rt.getString("tenuser");
				
				User User = new User(username, password, tenuser);
				
				ketQua.add(User);
			}
			
			System.out.println("Lấy dữ liệu từ bản User thành công");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			System.out.println("Lỗi câu lệnh lấy dữ liệu từ database");
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public User selectById(User t) {
		try {
			Connection con = JDBCUtil.getConnection();
			
			String sql = "SELECT * FROM USER WHERE username = ? and password = ?";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUsername());
			pst.setString(2, t.getPassword());
			
			ResultSet rt = pst.executeQuery();
			
			if(rt.next() != false) {
				return t;
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<User> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
