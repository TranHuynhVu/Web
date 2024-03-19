package bt1;

public class HINHVUONG extends HINH {
	private int cd;
	private int cr;

	public HINHVUONG(String tenHinh, String mauHinh, boolean toMau, int cd, int cr) {
		super(tenHinh, mauHinh, toMau);
		this.cd = cd;
		this.cr = cr;
	}

	public HINHVUONG() {
		super.nhap();
	}

	public int getCd() {
		return cd;
	}

	public void setCd(int cd) {
		this.cd = cd;
	}

	public int getCr() {
		return cr;
	}

	public void setCr(int cr) {
		this.cr = cr;
	}
	
	public int dienTich() {
		return this.cd * this.cr;
	}
	
	public float chuVi() {
		return (this.cd + this.cr) * 2;
	}
	
}
