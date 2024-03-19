package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.text.rtf.RTFEditorKit;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import database.JDBCUtil;
import model.LHP;

public class LHP_DAO implements DAOInterface<LHP>{

	public static LHP_DAO getLhp_DAO() {
		return new LHP_DAO();
	}
	
	@Override
	public int insert(LHP t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối với database
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo đối tượng statement 
			Statement st = con.createStatement();
			
			// Bước 3: viết câu lệnh sql
			String sql = "INSERT INTO LHP(malhp,tenlhp,sotc)"+
						 " VALUES('"+t.getMalhp()+"', '"+t.getTenlhp()+"', "+t.getSotc()+")";
			
			ketQua = st.executeUpdate(sql);
			
			// Bước 4: 
			System.out.println("Bạn đã Insert thành công "+ketQua+ " dòng dữ liệu vào Table LHP");
			
			// Bước 5: ngắt kết nối với database
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			System.out.println("Insert bị lỗi");
			e.printStackTrace();
		}
		return ketQua;	
	}

	@Override
	public int update(LHP t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối với database
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo đối tượng statement 
			Statement st = con.createStatement();
			
			// Bước 3: viết câu lệnh sql
			String sql =	"UPDATE LHP"+
							" SET"+
								" malhp = '"+t.getMalhp()+"'"+
								", tenlhp = '"+t.getTenlhp()+"'"+
								", sotc = "+t.getSotc()+
							" WHERE malhp = '"+t.getMalhp()+"'";
			ketQua = st.executeUpdate(sql);
			
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
	public int delete(LHP t) {
		int ketQua = 0;
		try {
			// tạo kết nối với database
			Connection con = JDBCUtil.getConnection();
			
			// tạo statement
			Statement st = con.createStatement();
			
			// viết câu lệnh sql
			String sql =	"DELETE"+
							" FROM LHP"+
							" WHERE malhp = '"+t.getMalhp()+"'";
			
			ketQua = st.executeUpdate(sql);
			
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
	public ArrayList<LHP> selectALL() {
		ArrayList<LHP> ketQua = new ArrayList<LHP>();
		
		try {
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM LHP";
			
			// tạo đối tượng ResultSet để lâu kết quả của câu lệnh select
			ResultSet rt = st.executeQuery(sql);
			
			while(rt.next()) {
				String malhp = rt.getString("malhp");
				String tenlhp = rt.getString("tenlhp");
				int sotc = rt.getInt("sotc");
				
				LHP lhp = new LHP(malhp, tenlhp, sotc);
				
				ketQua.add(lhp);
			}
			
			System.out.println("Lấy dữ liệu từ bản LHP thành công");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			System.out.println("Lỗi câu lệnh lấy dữ liệu từ database");
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public LHP selectById(LHP t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LHP> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
