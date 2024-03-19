package BT2;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class NhanVien extends CanBo {
	private int tuoi;
	private int luong;
	private String email;
	public NhanVien(String hoten, boolean gioitinh, String diachi, String sdt, int tuoi, int luong, String email) {
		super(hoten, gioitinh, diachi, sdt);
		this.tuoi = tuoi;
		this.luong = luong;
		this.email = email;
	}
	
	public NhanVien() {
		super();
		this.nhap();
	}

	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void nhap() {
		super.nhap();
		do {
			System.out.println("Nhap tuoi: ");
			this.tuoi = rc.nextInt();
			if(this.tuoi < 20 || this.tuoi > 60)
				System.out.println("Nhap tuoi sai! \n"+"Vui long nhap lai!");
		}while(this.tuoi < 20 || this.tuoi > 60);
		do {
			System.out.println("Nhap luong: ");
			this.luong = rc.nextInt();
			rc.nextLine();
			if(this.luong < 1 || this.luong > 5)
				System.out.println("Nhap luong sai!\n"+"Vui long nhap lai!");
		} while (this.luong < 1 || this.luong > 5);
		do {
			System.out.println("Nhap email: ");
			this.email = rc.nextLine();
			if(this.email.contains("@") && !this.email.contains(" "))
				continue;
			else {
				System.out.println("Email sai!!\n"+"Thieu @");
				if (this.email.contains(" ")) 
					System.out.println("Email sai!!\n"+"Email khong co khoan trang!");
			}
		} while (this.email.contains(" ") || !this.email.contains("@"));
	}
	
	public void xuat() {
		System.out.println(super.toString()+", Tuoi: "+this.getTuoi()+", Luong: "+this.getLuong()+", Email: "+this.getEmail());
	}
	
	@Override
	public String toString() {
		return (super.toString()+", Tuoi: "+this.getTuoi()+", Luong: "+this.getLuong()+", Email: "+this.getEmail());
	}

	
	
}
