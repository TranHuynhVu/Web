package BT1;

import java.util.Scanner;

public class Person {
	private String ten;
	private boolean gioiTinh;
	private String diaChi;
	private String ngaySinh;
	protected Scanner rc = new Scanner(System.in);
	
	public Person(String ten, boolean gioiTinh, String diaChi, String ngaySinh) {
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}

	public Person() {
		
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void nhap() {
		System.out.println("Ten: ");
		this.ten = rc.nextLine();
		System.out.println("Gioi tinh: ");
		this.gioiTinh = rc.nextBoolean();
		rc.nextLine();
		System.out.println("Dia chi: ");
		this.diaChi = rc.nextLine();
		System.out.println("Ngay sinh: ");
		this.ngaySinh = rc.nextLine();
	}
	@Override
	public String toString() {
		return "Ten= " + ten + ", Gioi tinh= " + gioiTinh + ", Dia chi= " + diaChi + ", Ngay sinh=" + ngaySinh;
	}
	
	
}
