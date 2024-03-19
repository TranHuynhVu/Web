package modol;

public class DanhMuc {
	String MaDanhMuc;
	String TenDanhMuc;
	public DanhMuc() {
	
	}
	public DanhMuc(String maDanhMuc, String tenDanhMuc) {	
		MaDanhMuc = maDanhMuc;
		TenDanhMuc = tenDanhMuc;
	}
	public String getMaDanhMuc() {
		return MaDanhMuc;
	}
	public void setMaDanhMuc(String maDanhMuc) {
		MaDanhMuc = maDanhMuc;
	}
	public String getTenDanhMuc() {
		return TenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		TenDanhMuc = tenDanhMuc;
	}
	@Override
	public String toString() {
		return "DanhMuc [MaDanhMuc=" + MaDanhMuc + ", TenDanhMuc=" + TenDanhMuc + "]";
	}
	
}
