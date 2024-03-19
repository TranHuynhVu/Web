package model;

import java.sql.Date;

public class SINHVIEN {
	private int masv;
	private String tensv;
	private Date ngaysinh;
	private String lopsinhhoat;
	
	public SINHVIEN() {
		super();
	}

	public SINHVIEN(int masv, String tensv, Date ngaysinh, String lopsinhhoat) {
		super();
		this.masv = masv;
		this.tensv = tensv;
		this.ngaysinh = ngaysinh;
		this.lopsinhhoat = lopsinhhoat;
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getTensv() {
		return tensv;
	}

	public void setTensv(String tensv) {
		this.tensv = tensv;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getLopsinhhoat() {
		return lopsinhhoat;
	}

	public void setLopsinhhoat(String lopsinhhoat) {
		this.lopsinhhoat = lopsinhhoat;
	}

	@Override
	public String toString() {
		return "SINHVIEN [masv=" + masv + ", tensv=" + tensv + ", ngaysinh=" + ngaysinh + ", lopsinhhoat=" + lopsinhhoat
				+ "]";
	}
	
}
