package TGK;

import java.util.Date;
import java.util.Scanner;

public class SACHTHAMKHAO extends SACH{
	private double thue;
	
	public SACHTHAMKHAO(String maSach, String nhaXuatBan, Date ngayNhap, double donGia, int soLuong, double thue) {
		super(maSach, nhaXuatBan, ngayNhap, donGia, soLuong);
		this.thue = thue;
	}
	
	public SACHTHAMKHAO() {
		super();
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	public void nhap() {
		Scanner rc = new Scanner(System.in);
		super.nhap();
		System.out.println("Thue");
		this.thue = rc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString()+"| Thue: "+this.getThue();
	}

	@Override
	public double tinhTienGiam() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double TinhThanhTien() {
		// TODO Auto-generated method stub
		return super.soLuong * super.donGia - this.tinhTienGiam();
	}

	
}
