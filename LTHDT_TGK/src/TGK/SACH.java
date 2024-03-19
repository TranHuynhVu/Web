package TGK;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public abstract class SACH implements ISACH{
	protected String maSach;
	protected String nhaXuatBan;
	protected Date ngayNhap;
	protected double donGia;
	protected int soLuong;
	SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
	

	public SACH(String maSach, String nhaXuatBan, Date ngayNhap, double donGia, int soLuong) {
		super();
		this.maSach = maSach;
		this.nhaXuatBan = nhaXuatBan;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public SACH() {
		super();
	}
	
	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public void nhap() {
		Scanner rc = new Scanner(System.in);
		System.out.println("Ma sach: ");
		this.maSach = rc.nextLine();
		System.out.println("Ngay nhap: ");
		try {
			this.ngayNhap = d.parse(rc.nextLine());
		} catch (Exception e) {
			System.out.println("Ngap ngay Loi");
		}
		System.out.println("Don gia: ");
		this.donGia = rc.nextDouble();
		System.out.println("So luong: ");
		this.soLuong = rc.nextInt();
		rc.nextLine();
		System.out.println("Nha suat ban: ");
		this.nhaXuatBan = rc.nextLine();
	}
	
	@Override
	public String toString() {
		return ("Ma sach: "+this.getMaSach()+"| Ngay Nhap: "+d.format(getNgayNhap())+"| Don Gia: "+this.getDonGia()+"| So Luong: "+this.getSoLuong()+"| Nha Suat Ban: "+this.getNhaXuatBan());
	}

	public abstract double tinhTienGiam();
	
	
}
