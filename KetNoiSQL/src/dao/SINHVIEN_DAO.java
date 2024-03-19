package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.SINHVIEN;

public class SINHVIEN_DAO implements DAOInterface<SINHVIEN>{

	public static  SINHVIEN_DAO getSinhvien_DAO() {
		return new SINHVIEN_DAO();
	}
	
	@Override
	public int insert(SINHVIEN t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql =	"INSERT INTO SINHVIEN(masv,tensv,ngaysinh,lopsinhhoat)"+
							" VALUES("+t.getMasv()+", '"+t.getTensv()+"', '"+t.getNgaysinh()+"', '"+t.getLopsinhhoat()+"')";
			
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Bạn đã Insert thành công "+ketQua+ " dòng dữ liệu vào Table SINHVIEN");
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			System.out.println("Insert Table SINHVIEN bị lỗi");
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int update(SINHVIEN t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql =	"UPDATE SINHVIEN"+
							" SET"+
								" masv = "+t.getMasv()+
								" tensv = "+t.getTensv()+"'"+
								" ngaysinh = '"+t.getNgaysinh()+"'"+
								" lopsinhhoat = '"+t.getLopsinhhoat()+"'"+
							" WHERE masv = "+t.getMasv();
			
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Bạn đã Update thành công "+ketQua+ " dòng dữ liệu vào Table SINHVIEN");
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			System.out.println("Update Table SINHVIEN bị lỗi");
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int delete(SINHVIEN t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql =	"DELETE"+
							" FROM SINHVIEN"+
							" WHERE masv = "+t.getMasv();
			
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Bạn đã Delete thành công "+ketQua+ " dòng dữ liệu khỏi Table SINHVIEN");
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			System.out.println("Delete Table SINHVIEN bị lỗi");
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<SINHVIEN> selectALL() {
		ArrayList<SINHVIEN> ketQua = new ArrayList<SINHVIEN>();
		
		try {
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM SINHVIEN";
			
			ResultSet rt = st.executeQuery(sql);
			
			while(rt.next()) {
				int masv = rt.getInt("masv");
				String tesv = rt.getString("tensv");
				Date ngaysinh = rt.getDate("ngaysinh");
				String lopsinhhoat = rt.getString("lopsinhhoat");
				
				SINHVIEN sv = new SINHVIEN(masv, tesv, ngaysinh, lopsinhhoat);
				
				ketQua.add(sv);
			}
			
			System.out.println("Lấy dữ liệu từ table SINHVIEN thành công");
		} catch (SQLException e) {
			System.out.println("Lỗi câu lệnh lấy dữ liệu từ database");
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public SINHVIEN selectById(SINHVIEN t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SINHVIEN> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
