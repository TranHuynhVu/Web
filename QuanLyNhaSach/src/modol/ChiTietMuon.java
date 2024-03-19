package modol;

import java.time.LocalDate;

public class ChiTietMuon {
	String idUser;
	String MaSach;
	LocalDate NgayMuon;
	LocalDate NgayTra;
	
	public ChiTietMuon() {
		super();
	}

	public ChiTietMuon(String idUser, String maSach, LocalDate ngayMuon, LocalDate ngayTra) {
		super();
		this.idUser = idUser;
		MaSach = maSach;
		NgayMuon = ngayMuon;
		NgayTra = ngayTra;
	}

	public LocalDate getNgayTra() {
		return NgayTra;
	}

	public void setNgayTra(LocalDate ngayTra) {
		NgayTra = ngayTra;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getMaSach() {
		return MaSach;
	}

	public void setMaSach(String maSach) {
		MaSach = maSach;
	}

	public LocalDate getNgayMuon() {
		return NgayMuon;
	}

	public void setNgayMuon(LocalDate ngayMuon) {
		NgayMuon = ngayMuon;
	}

	@Override
	public String toString() {
		return "ChiTietMuon [idUser=" + idUser + ", MaSach=" + MaSach + ", NgayMuon=" + NgayMuon + ", NgayTra="
				+ NgayTra + "]";
	}
	
}
