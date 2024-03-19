package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import database.JDBCUtil;
import modol.ChiTietMuon;
import modol.Sach;

public class DaoChiTietMuon implements DAOInterface<ChiTietMuon>{
	public static DaoChiTietMuon getDaoChiTietMuon() {
		return new DaoChiTietMuon();
	}
	@Override
	public int Insert(ChiTietMuon t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "INSERT INTO ChiTietMuon"+
						" VALUES(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdUser());
			pst.setString(2, t.getMaSach());
			pst.setString(3, t.getNgayMuon().getYear()+"-"+t.getNgayMuon().getMonthValue()+"-"+t.getNgayMuon().getDayOfMonth());
			pst.setString(4, t.getNgayTra().getYear()+"-"+t.getNgayTra().getMonthValue()+"-"+t.getNgayTra().getDayOfMonth());
			
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
	public int Update(ChiTietMuon t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			
			String sql = "UPDATE ChiTietMuon"+
						" SET idUser = ?, MaSach = ?,NgayMuon = ?, NgayTra = ?"+
						" WHERE idUser = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdUser());
			pst.setString(2, t.getMaSach());
			pst.setString(3, t.getNgayMuon().getYear()+"-"+t.getNgayMuon().getMonth()+"-"+t.getNgayMuon().getDayOfMonth());
			pst.setString(4, t.getNgayTra().getYear()+"-"+t.getNgayTra().getMonth()+"-"+t.getNgayTra().getDayOfMonth());
			pst.setString(5, t.getIdUser());
			
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
	public int Delete(ChiTietMuon t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			
			String sql = "DELETE ChiTietMuon"+
						" WHERE MaSach = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaSach());

			ketqua = pst.executeUpdate();
			
			System.out.println("thanh cong DELETE "+ketqua);
			
			JDBCUtil.CloseConetion(con);
			
		} catch (SQLException e) {
			System.out.println("That bai");
			e.printStackTrace();
		}
		
		return ketqua;
	}

	@Override
	public ArrayList<ChiTietMuon> SelectAll() {
		ArrayList<ChiTietMuon> arr = new ArrayList<ChiTietMuon>();
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "select * from ChiTietMuon";
					
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rt = pst.executeQuery();
			
			while(rt.next()) {
				String idUser = rt.getString("idUser");
				String MaSach = rt.getString("MaSach");
				LocalDate NgayMuon = rt.getObject("NgayMuon", LocalDate.class);
				LocalDate NgayTra = rt.getObject("NgayTra", LocalDate.class);
				ChiTietMuon chiTietMuon = new ChiTietMuon(idUser, MaSach, NgayMuon, NgayTra);
				arr.add(chiTietMuon);
			}
			
		
			JDBCUtil.CloseConetion(con);
			System.out.println("SELECTALL danh sach muon Thanh cong");
		} catch (SQLException e) {
			System.out.println("Loi SELECTALL danh sach muon");
			e.printStackTrace();
		}
		return arr;
	}
	
	public ArrayList<Sach> SelectSachMuon() {
		ArrayList<Sach> arr = new ArrayList<Sach>();
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "select ChiTietMuon.MaSach,TenSach,TacGia,NhaXB,NamXB,TTND,TenDanhMuc,TenTheLoai"+
						" from Sach,DanhMuc,TheLoai,ChiTietMuon"+
						" where Sach.MaDanhMuc = DanhMuc.MaDanhMuc"+
						" and DanhMuc.MaTheLoai = TheLoai.MaTheLoai"+
						" and ChiTietMuon.MaSach = Sach.MaSach";
					
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
			System.out.println("SELECT danh sach muon Thanh cong");
		} catch (SQLException e) {
			System.out.println("Loi SELECT danh sach muon");
			e.printStackTrace();
		}
		return arr;
	}
	
	public int SelectById(ChiTietMuon t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.GetConnetion();
			String sql = "select *"+
						" from ChiTietMuon"+
						" where idUser=? and MaSach=?";		
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdUser());
			pst.setString(2, t.getMaSach());
			ResultSet rt = pst.executeQuery();
			
			if(rt.next()) {
				ketqua = 0;
			
			}else {
				ketqua = 1;
			}
			System.out.println(ketqua);
			JDBCUtil.CloseConetion(con);
			System.out.println("SELECT danh sach muon Thanh cong");
		} catch (SQLException e) {
			System.out.println("Loi SELECT danh sach muon");
			e.printStackTrace();
		}
		return ketqua;
	}
}
