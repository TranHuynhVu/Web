package BT1;

public class Student extends Person {
	private String msv;
	private double dtb;
	private String email;
	
	public Student(String ten, boolean gioiTinh, String diaChi, String ngaySinh, String msv, double dtb, String email) {
		super(ten, gioiTinh, diaChi, ngaySinh);
		this.msv = msv;
		this.dtb = dtb;
		this.email = email;
	}

	public Student() {
		this.nhap();
	}

	public String getMsv() {
		return msv;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(double dtb) {
		this.dtb = dtb;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Ma sinh vien: ");
		this.msv = super.rc.nextLine();
		System.out.println("Diem trung binh: ");
		this.dtb = super.rc.nextDouble();
		super.rc.nextLine();
		System.out.println("Email: ");
		this.email = super.rc.nextLine();
	}

	@Override
	public String toString() {
		return (super.toString() + ", msv=" + msv + ", dtb=" + dtb + ", email=" + email );
	}
	
	public int KTHB(double dtb) {
		if(dtb > 8.5)
			return 1;
		else
			return 0;
	}
	
	
	
	
	
	
}
