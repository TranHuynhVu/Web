package TGK;

import java.util.Date;
import java.util.Scanner;

public class SACHGIAOKHOA extends SACH{
	private boolean tinhTrang;
	
	public SACHGIAOKHOA(String maSach, String nhaXuatBan, Date ngayNhap, double donGia, int soLuong,
			boolean tinhTrang) {
		super(maSach, nhaXuatBan, ngayNhap, donGia, soLuong);
		this.tinhTrang = tinhTrang;
	}

	public SACHGIAOKHOA() {
		super();
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public void nhap() {
		Scanner rc = new Scanner(System.in);
		super.nhap();
		System.out.println("Tinh Trang: ");
		this.tinhTrang = rc.nextBoolean();
		
	}
	
	@Override
	public String toString() {
		if(tinhTrang == true) {
			return super.toString()+"| Tinh Trang: Moi";
		}
		else {
			return super.toString()+"| Tinh Trang: Cu";
		}
		
	}

	@Override
	public double tinhTienGiam() {
		if(tinhTrang == true) {
			return super.soLuong * super.donGia * 0.1;
		}else {
			return super.soLuong * super.donGia * 0.5;
		}
	}
	
	@Override
	public double TinhThanhTien() {
		// TODO Auto-generated method stub
		return super.getSoLuong() * super.getDonGia() - this.tinhTienGiam();
	}
	

}
