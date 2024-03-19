package BT_KETHUA_DAHINH;

public class NHANVIEN extends CANBO{
	private String congViec;

	public NHANVIEN(String hoTen, int tuoi, String gioiTinh, String diaChiString, String congViec) {
		super(hoTen, tuoi, gioiTinh, diaChiString);
		this.congViec = congViec;
	}

	public NHANVIEN() {
		super();
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Cong Viec: ");
		this.congViec = super.rc.nextLine();
	}
	
	public void xuat() {
		System.out.println(super.toString()+"| Cong Vec: "+this.getCongViec());
	}

	@Override
	public String toString() {
		return (super.toString()+"| Cong Vec: "+this.getCongViec());
	}
	
}
