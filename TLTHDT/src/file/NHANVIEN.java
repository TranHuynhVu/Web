package file;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class NHANVIEN implements Serializable{
	private String manv;
	private String hoten;
	private int tuoi;
	private float luong;
	
	public NHANVIEN() {
		super();
	}

	public NHANVIEN(String manv, String hoten, int tuoi, float luong) {
		super();
		this.manv = manv;
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.luong = luong;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public float getLuong() {
		return luong;
	}

	public void setLuong(float luong) {
		this.luong = luong;
	}
	public void nhap() {
		Scanner rc = new Scanner(System.in);
		System.out.println("MaNV: ");
		this.manv = rc.nextLine();
		System.out.println("Ten: ");
		this.hoten = rc.nextLine();
		System.out.println("Tuoi: ");
		this.tuoi = rc.nextInt();
		System.out.println("Luong: ");
		this.luong = rc.nextFloat();
	}
	@Override
	public String toString() {
		return "Ma Nhan Vien: "+this.getManv()+"| Ho Ten: "+this.getHoten()+"| Tuoi: "+this.getTuoi()+"| Luong: "+this.luong;
	}
	
	
}
