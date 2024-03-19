package BAITHI;

import java.util.Date;
import java.util.Scanner;

public class Tailieu {
	protected String tacGia;
	protected String namXuatBan;

	
	public Tailieu(String tacGia, String namXuatBan) {
		this.tacGia = tacGia;
		this.namXuatBan = namXuatBan;
	}

	public Tailieu() {
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public String getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(String namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	
	public void nhap() {
		Scanner rc = new Scanner(System.in);
		System.out.println("Nhap Tac Gia: ");
		this.tacGia = rc.nextLine();
		System.out.println("Nhap Nam Xuat Ban: ");
		this.namXuatBan = rc.nextLine();
	}
	
	public void xuat() {
		System.out.println("Ten Tac Gia: "+this.getTacGia()+", Nam Xuat Ban: "+this.getNamXuatBan());
	}

	@Override
	public String toString() {
		return ("Ten Tac Gia: "+this.getTacGia()+", Nam Xuat Ban: "+this.getNamXuatBan());
	}
	
	
}
