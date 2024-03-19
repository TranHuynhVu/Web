package BT_CK;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Scanner;

public class Candidate {
	protected String hoTen;
	protected Date ngaySinh;
	protected String diaChi;
	protected String queQuan;
	protected String dienThoai;
	protected String email;
	protected Scanner rc;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Candidate(String hoTen, Date ngaySinh, String diaChi, String queQuan, String dienThoai, String email) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.queQuan = queQuan;
		this.dienThoai = dienThoai;
		this.email = email;
		rc = new Scanner(System.in);
	}
	
	public Candidate() {
		rc = new Scanner(System.in);
	}
	
	public void nhap() {
		try {
			System.out.println("Ho ten: ");
			this.hoTen = rc.nextLine();
			System.out.println("Ngay sinh: ");
			SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
			this.ngaySinh = d.parse(this.rc.nextLine());
			System.out.println("Dia chi: ");
			this.diaChi = rc.nextLine();
			System.out.println("Que quan: ");
			this.queQuan = rc.nextLine();
			System.out.println("Dien thoai: ");
			this.dienThoai = rc.nextLine();
			System.out.println("Email: ");
			this.email = rc.nextLine();
		}catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	@Override
	public String toString() {
		return "Candidate [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh.getDate()+"/"+ (this.ngaySinh.getMonth()+1) + "/" + (this.ngaySinh.getYear()+1900)+ ", diaChi=" + diaChi + ", queQuan=" + queQuan
				+ ", dienThoai=" + dienThoai + ", email=" + email ;
	}
	
	
	
}
