package modol;

public class Sach {
	private String MaSach;
	private String TenSach;
	private String TacGia;
	private String NhaXB;
	private int NamXB;
	private String DanhMuc;
	private String TheLoai;
	private String TTND;
	
	public Sach() {
	
	}

	public Sach(String maSach, String tenSach, String tacGia, String nhaXB, int namXB, String danhMuc, String theLoai,
			String tTND) {
		MaSach = maSach;
		TenSach = tenSach;
		TacGia = tacGia;
		NhaXB = nhaXB;
		NamXB = namXB;
		DanhMuc = danhMuc;
		TheLoai = theLoai;
		TTND = tTND;
	}

	public String getMaSach() {
		return MaSach;
	}

	public void setMaSach(String maSach) {
		MaSach = maSach;
	}

	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}

	public String getTacGia() {
		return TacGia;
	}

	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}

	public String getNhaXB() {
		return NhaXB;
	}

	public void setNhaXB(String nhaXB) {
		NhaXB = nhaXB;
	}

	public int getNamXB() {
		return NamXB;
	}

	public void setNamXB(int namXB) {
		NamXB = namXB;
	}

	public String getDanhMuc() {
		return DanhMuc;
	}

	public void setDanhMuc(String danhMuc) {
		DanhMuc = danhMuc;
	}

	public String getTheLoai() {
		return TheLoai;
	}

	public void setTheLoai(String theLoai) {
		TheLoai = theLoai;
	}

	public String getTTND() {
		return TTND;
	}

	public void setTTND(String tTND) {
		TTND = tTND;
	}

	@Override
	public String toString() {
		return "Sach [MaSach=" + MaSach + ", TenSach=" + TenSach + ", TacGia=" + TacGia + ", NhaXB=" + NhaXB
				+ ", NamXB=" + NamXB + ", DanhMuc=" + DanhMuc + ", TheLoai=" + TheLoai + ", TTND=" + TTND + "]";
	}
}
