package BAITHIGK;

import java.util.Date;

public class Student extends Person{
	private String msv;
	private double dtb;
	
	public Student() {
		super();
	}
	public Student(String ten, int gioiTinh, Date ngaySinh, String diaChi, String msv, double dtb) {
		super(ten, gioiTinh, ngaySinh, diaChi);
		this.msv = msv;
		this.dtb = dtb;
	}
	

	
}
