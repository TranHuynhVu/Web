package BT2;

import java.util.Scanner;

public class CanBo {
	protected String hoten;
	protected boolean gioitinh;
	protected String diachi;
	protected String sdt;
	protected Scanner rc;
	
	public CanBo(String hoten, boolean gioitinh, String diachi, String sdt) {
		super();
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.sdt = sdt;
		rc = new Scanner(System.in);
	}

	public CanBo() {
		super();
		rc = new Scanner(System.in);
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	public void nhap() {
		System.out.println("Nhap ho ten: ");
		this.hoten = rc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		this.gioitinh = rc.nextBoolean();
		rc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diachi = rc.nextLine();
		System.out.println("Nhap sdt: ");
		this.sdt = rc.nextLine();
	}
	
	public void xuat() {
		System.out.println("Ten: "+this.getHoten()+", Gioi tinh: "+this.isGioitinh()+", Dia chi: "+this.getDiachi()+", SDT: "+this.getSdt());                          
	}

	@Override
	public String toString() {
		return ("Ten: "+this.getHoten()+", Gioi tinh: "+this.isGioitinh()+", Dia chi: "+this.getDiachi()+", SDT: "+this.getSdt());
	}

	
	
	
}










