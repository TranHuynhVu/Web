package BAITHIGK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
	protected String ten;
	protected int gioiTinh;
	protected Date ngaySinh;
	protected String diaChi;
	protected Scanner rc;
	
	public Person() {
		super();
		rc = new Scanner(System.in);
		this.inputInfo();
	}

	public Person(String ten, int gioiTinh, Date ngaySinh, String diaChi) {
		super();
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		rc = new Scanner(System.in);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void inputInfo() {
		rc = new Scanner(System.in);
		System.out.println("Nhap Ten: ");
		this.ten = rc.nextLine();
		System.out.println("Nhap Gioi Tinh: ");
		this.gioiTinh = rc.nextInt();
		rc.nextLine();
		System.out.println("Nhap Ngay Sinh: ");
		SimpleDateFormat setNgaySinh = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngaySinh = setNgaySinh.parse(rc.nextLine());
		} catch (ParseException e) {
			System.out.println("Loi Dinh Dang Ngay Sinh:");
		}		
		System.out.println("Nhap Dia Chi: ");
		this.diaChi = rc.nextLine();
	}

	public void showInfo() {
		System.out.println("Ten: "+this.getTen()+", Gioi Tinh: "+this.getGioiTinh()+", Ngay Sinh: "+this.ngaySinh.getDate()+"/"+this.ngaySinh.getMonth()+"/"+(this.ngaySinh.getYear()+1900)+", Dia Chi: "+this.getDiaChi());
	}

}
