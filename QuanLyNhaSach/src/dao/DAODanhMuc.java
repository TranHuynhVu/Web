package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import modol.DanhMuc;

public class DAODanhMuc implements DAOInterface<DanhMuc>{
	public static DAODanhMuc getDaoDanhMuc() {
		return new DAODanhMuc();
	}
	@Override
	public int Insert(DanhMuc t) {
		int	ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "IMSERT INTO DanhMuc"+
						" VALUES(?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaDanhMuc());
			pst.setString(2, t.getTenDanhMuc());
			pst.executeUpdate();
			JDBCUtil.CloseConetion(con);
			System.out.println("Insert Danh Muc thanh cong");
		} catch (SQLException e) {
			System.out.println("Insert Danh Muc that bai");
			e.printStackTrace();
		}
		
		return ketqua;
	}

	@Override
	public int Update(DanhMuc t) {
		int	ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "UPDATE DanhMuc"+
						" SET MaDanhMuc =?, TenDanhMuc =?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaDanhMuc());
			pst.setString(2, t.getTenDanhMuc());
			pst.executeUpdate();
			JDBCUtil.CloseConetion(con);
			System.out.println("Update Danh Muc thanh cong");
		} catch (SQLException e) {
			System.out.println("Update Danh Muc that bai");
			e.printStackTrace();
		}
		
		return ketqua;
	}

	@Override
	public int Delete(DanhMuc t) {
		return 0;
	}

	@Override
	public ArrayList<DanhMuc> SelectAll() {
		ArrayList<DanhMuc> arr = new ArrayList<DanhMuc>();
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "SELECT * FROM DanhMuc";
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet res = pst.executeQuery();
			
			while(res.next()) {
				String MaDanhMuc = res.getString("MaDanhMuc");
				String TenDanhMuc = res.getString("TenDanhMuc");
				DanhMuc d = new DanhMuc(MaDanhMuc, TenDanhMuc);
				arr.add(d);
			}
			
			JDBCUtil.CloseConetion(con);
			System.out.println("SELECTALL Danh Muc thanh cong");
		} catch (SQLException e) {
			System.out.println("SELECTALL Danh Muc that bai");
			e.printStackTrace();
		}
		
		return arr;
	}

}
