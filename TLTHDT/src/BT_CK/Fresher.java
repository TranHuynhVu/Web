package BT_CK;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Fresher extends Candidate{
	private int thoiDiemTotNghiep;
	private String chuyenNganh,truongHoc;
	private Date ngayTotNghiep;
	public Fresher() {
		super();
	}
	public int getThoiDiemTotNghiep() {
		return thoiDiemTotNghiep;
	}
	public void setThoiDiemTotNghiep(int thoiDiemTotNghiep) {
		this.thoiDiemTotNghiep = thoiDiemTotNghiep;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public String getTruongHoc() {
		return truongHoc;
	}
	public void setTruongHoc(String truongHoc) {
		this.truongHoc = truongHoc;
	}
	public Date getNgayTotNghiep() {
		return ngayTotNghiep;
	}
	public void setNgayTotNghiep(Date ngayTotNghiep) {
		this.ngayTotNghiep = ngayTotNghiep;
	}
	public void nhap() {
		try {
			
			SimpleDateFormat d = new SimpleDateFormat("dd");
			this.ngayTotNghiep=d.parse(super.rc.nextLine());
			Calendar cal = Calendar.getInstance();
			cal.setTime(this.ngayTotNghiep);
			System.out.println(cal);
			System.out.println(cal.get(Calendar.DAY_OF_MONTH));
			System.out.println(cal.get(Calendar.MONTH) + 1);
			System.out.println(cal.get(Calendar.YEAR));
		}
		catch(Exception e) {
			
		}

		
	}
}
