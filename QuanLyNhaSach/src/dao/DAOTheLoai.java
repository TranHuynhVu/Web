package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import modol.DanhMuc;
import modol.TheLoai;

public class DAOTheLoai implements DAOInterface<TheLoai>{
	public static DAOTheLoai getDAOTheLoai() {
		return new DAOTheLoai();
	}
	@Override
	public int Insert(TheLoai t) {
		int	ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "IMSERT INTO TheLoai"+
						" VALUES(?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaTheLoai());
			pst.setString(2, t.getTenTheLoai());
			pst.executeUpdate();
			JDBCUtil.CloseConetion(con);
			System.out.println("Insert The Loai thanh cong");
		} catch (SQLException e) {
			System.out.println("Insert The Loai that bai");
			e.printStackTrace();
		}
		
		return ketqua;
	}

	@Override
	public int Update(TheLoai t) {
		int	ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "UPDATE TheLoai"+
						" SET MaTheLoai =?, TenTheLoai =?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaTheLoai());
			pst.setString(2, t.getTenTheLoai());
			pst.executeUpdate();
			JDBCUtil.CloseConetion(con);
			System.out.println("Update The Loai thanh cong");
		} catch (SQLException e) {
			System.out.println("Update The Loai that bai");
			e.printStackTrace();
		}
		
		return ketqua;
	}

	@Override
	public int Delete(TheLoai t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<TheLoai> SelectAll() {
		ArrayList<TheLoai> arr = new ArrayList<TheLoai>();
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "SELECT * FROM TheLoai";
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet res = pst.executeQuery();
			
			while(res.next()) {
				String MaTheLoai = res.getString("MaTheLoai");
				String TenTheLoai = res.getString("TenTheLoai");
				TheLoai t = new TheLoai(MaTheLoai, TenTheLoai);
				arr.add(t);
			}
			
			JDBCUtil.CloseConetion(con);
			System.out.println("SELECTALL The Loai thanh cong");
		} catch (SQLException e) {
			System.out.println("SELECTALL The Loai that bai");
			e.printStackTrace();
		}
		
		return arr;
	}

}
