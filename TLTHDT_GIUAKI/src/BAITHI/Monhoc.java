package BAITHI;

import java.text.BreakIterator;
import java.util.Scanner;

public class Monhoc extends Tailieu{
	private String tenMonHoc;
	private int soTietLyThuyet;
	private int soTietThucHanh;
	private int soTinChi;
	private Scanner rcScanner = new Scanner(System.in);
	

	
	public Monhoc() {
		super();
	}

	public Monhoc(String tacGia, String namXuatBan, String tenMonHoc, int soTietLyThuyet, int soTietThucHanh,
			int soTinChi) {
		super(tacGia, namXuatBan);
		this.tenMonHoc = tenMonHoc;
		this.soTietLyThuyet = soTietLyThuyet;
		this.soTietThucHanh = soTietThucHanh;
		this.soTinChi = soTinChi;
	}
	
	

	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

	public int getSoTietLyThuyet() {
		return soTietLyThuyet;
	}

	public void setSoTietLyThuyet(int soTietLyThuyet) {
		this.soTietLyThuyet = soTietLyThuyet;
	}

	public int getSoTietThucHanh() {
		return soTietThucHanh;
	}

	public void setSoTietThucHanh(int soTietThucHanh) {
		this.soTietThucHanh = soTietThucHanh;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhap Ten Mon Hoc; ");
		this.tenMonHoc = rcScanner.nextLine();
		System.out.println("Nhap So Tiet Ly Thuyet: ");
		this.soTietLyThuyet = rcScanner.nextInt();
		System.out.println("Nhap So Tiet Thuc Hanh: ");
		this.soTietThucHanh = rcScanner.nextInt();
		do {
			System.out.println("Nhap So Tin Chi: ");
			this.soTinChi = rcScanner.nextInt();
		}while(this.soTinChi < 1 || this.soTinChi > 5);
		
	}
	
	public void xuat() {
		super.xuat();
		System.out.println(", Ten Mon Hoc: "+this.getTenMonHoc()+", So Tiet Ly Thuyet: "+this.getSoTietLyThuyet()+", So Tiet thuc Hanh: "+this.getSoTietThucHanh()+", So Tin Chi: "+this.getSoTinChi());
	}

	@Override
	public String toString() {
		return "Monhoc [tenMonHoc=" + tenMonHoc + ", soTietLyThuyet=" + soTietLyThuyet + ", soTietThucHanh="
				+ soTietThucHanh + ", soTinChi=" + soTinChi + "]";
	}
	
}
