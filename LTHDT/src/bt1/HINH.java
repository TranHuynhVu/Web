package bt1;

import java.util.Scanner;

public class HINH {
	private String tenHinh;
	private  String mauHinh;
	private boolean toMau;
	
	protected Scanner rc = new Scanner(System.in);
	
	
	public HINH(String tenHinh, String mauHinh, boolean toMau) {
		this.tenHinh = tenHinh;
		this.mauHinh = mauHinh;
		this.toMau = toMau;
	}

	public HINH() {
		
	}
	
	public void nhap() {
		System.out.println("Ten hinh: ");
		this.tenHinh = rc.nextLine();
		System.out.println("Mau hinh: ");
		this.mauHinh = rc.nextLine();
		System.out.println("To mau: ");
		this.toMau = rc.nextBoolean();
	}
	
	public String getTenHinh() {
		return tenHinh;
	}
	public void setTenHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}
	public String getMauHinh() {
		return mauHinh;
	}
	public void setMauHinh(String mauHinh) {
		this.mauHinh = mauHinh;
	}
	public boolean isToMau() {
		return toMau;
	}
	public void setToMau(boolean toMau) {
		this.toMau = toMau;
	}
	@Override
	public String toString() {
		String tv = "Ten hinh: " + tenHinh + ", Mau hinh: " + mauHinh + ", To mau: " + toMau ;
		return tv;
	}
	
	
	
}
