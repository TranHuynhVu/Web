package modol;

public class TheLoai {
	String MaTheLoai;
	String TenTheLoai;
	public TheLoai() {
		
	}
	public TheLoai(String maTheLoai, String tenTheLoai) {
		MaTheLoai = maTheLoai;
		TenTheLoai = tenTheLoai;
	}
	public String getMaTheLoai() {
		return MaTheLoai;
	}
	public void setMaTheLoai(String maTheLoai) {
		MaTheLoai = maTheLoai;
	}
	public String getTenTheLoai() {
		return TenTheLoai;
	}
	public void setTenTheLoai(String tenTheLoai) {
		TenTheLoai = tenTheLoai;
	}
	@Override
	public String toString() {
		return "TheLoai [MaTheLoai=" + MaTheLoai + ", TenTheLoai=" + TenTheLoai + "]";
	}
	
}
