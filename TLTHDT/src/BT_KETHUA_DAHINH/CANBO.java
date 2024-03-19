package BT_KETHUA_DAHINH;

import java.util.Scanner;

public class CANBO {
	protected String hoTen;
	protected int tuoi;
	protected String gioiTinh;
	protected String diaChiString;
	protected Scanner rc;
	public CANBO(String hoTen, int tuoi, String gioiTinh, String diaChiString) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChiString = diaChiString;
		rc = new Scanner(System.in);
	}
	public CANBO() {
		super();
		rc = new Scanner(System.in);
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChiString() {
		return diaChiString;
	}
	public void setDiaChiString(String diaChiString) {
		this.diaChiString = diaChiString;
	}
	public void nhap() {
		rc = new Scanner(System.in);
		System.out.println("Nhap Ten: ");
		this.hoTen = rc.nextLine();
		System.out.println("Nhap Tuoi: ");
		this.tuoi = rc.nextInt();
		rc.nextLine();
		System.out.println("Nhap Gioi Tinh: ");
		this.gioiTinh = rc.nextLine();
		System.out.println("Nhap Dia Chi: ");
		this.diaChiString = rc.nextLine();
	}
	public void xuat() {
		System.out.println("Ten: "+this.getHoTen()+"| Tuoi: "+this.getTuoi()+"| Gioi Tinh: "+this.getGioiTinh()+"| Dia Chi: "+this.getDiaChiString());
	}
	@Override
	public String toString() {
		return ("Ten: "+this.getHoTen()+"| Tuoi: "+this.getTuoi()+"| Gioi Tinh: "+this.getGioiTinh()+"| Dia Chi: "+this.getDiaChiString());
	}
	
}
