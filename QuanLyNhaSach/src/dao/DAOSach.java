package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxNotice.SessionStateChanged.Parameter;

import database.JDBCUtil;
import modol.Sach;

public class DAOSach implements DAOInterface<Sach>{
	public static DAOSach getDaoSach() {
		return new DAOSach();
	}
	@Override
	public int Insert(Sach t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			
			String sql = "INSERT INTO Sach"+
						" VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaSach());
			pst.setString(2, t.getTenSach());
			pst.setString(3, t.getTacGia());
			pst.setString(4, t.getNhaXB());
			pst.setInt(5, t.getNamXB());
			pst.setString(6, t.getDanhMuc());
			pst.setString(7, t.getTheLoai());
			pst.setString(8, t.getTTND());
			
			ketqua = pst.executeUpdate();
			
			System.out.println("thanh cong insert "+ketqua);
			
			JDBCUtil.CloseConetion(con);
			
		} catch (SQLException e) {
			System.out.println("That bai");
			e.printStackTrace();
		}
		
		return ketqua;
	}

	@Override
	public int Update(Sach t) {
		int ketqua = 0;
		
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "UPDATE Sach"+
						" SET MaSach = ?, TenSach = ?, TacGia = ?, NhaXB = ?, NamXB = ?, DanhMuc = ?, TheLoai = ?, TTND = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaSach());
			pst.setString(2, t.getTenSach());
			pst.setString(3, t.getTacGia());
			pst.setString(4, t.getNhaXB());
			pst.setInt(5, t.getNamXB());
			pst.setString(6, t.getDanhMuc());
			pst.setString(7, t.getTheLoai());
			pst.setString(8, t.getTTND());
			
			pst.executeUpdate();
			
			JDBCUtil.CloseConetion(con);
			System.out.println("Update Thanh cong");
		} catch (SQLException e) {
			System.out.println("Loi Update");
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public int Delete(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Sach> SelectAll() {
		ArrayList<Sach> arr = new ArrayList<Sach>();
		try {
			Connection con = JDBCUtil.GetConnetion();
			//select MaSach,TenSach,TacGia,NhaXB,NamXB,TTND,TenDanhMuc,TenTheLoai
			//from Sach,DanhMuc,TheLoai
			//where Sach.MaDanhMuc = DanhMuc.MaDanhMuc
			//		and DanhMuc.MaTheLoai = TheLoai.MaTheLoai
			String sql = "select MaSach,TenSach,TacGia,NhaXB,NamXB,TTND,TenDanhMuc,TenTheLoai"+
						" from Sach,DanhMuc,TheLoai"+
						" where Sach.MaDanhMuc = DanhMuc.MaDanhMuc"+
						" and DanhMuc.MaTheLoai = TheLoai.MaTheLoai";
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rt = pst.executeQuery();
			
			while(rt.next()) {
				 String MaSach = rt.getString("MaSach");
				 String TenSach = rt.getString("TenSach");
				 String TacGia = rt.getString("TacGia");
				 String NhaXB = rt.getString("NhaXB");
				 int NamXB = rt.getInt("NamXB");
				 String DanhMuc = rt.getString("TenDanhMuc");
				 String TheLoai = rt.getString("TenTheLoai");
				 String TTND = rt.getString("TTND");
				 
				 Sach sach = new Sach(MaSach, TenSach, TacGia, NhaXB, NamXB, DanhMuc, TheLoai, TTND);
				 arr.add(sach);
			}
			
			
			JDBCUtil.CloseConetion(con);
			System.out.println("SelectAll Thanh cong");
		} catch (SQLException e) {
			System.out.println("Loi SelectAll");
			e.printStackTrace();
		}
		return arr;
	}
	
}
