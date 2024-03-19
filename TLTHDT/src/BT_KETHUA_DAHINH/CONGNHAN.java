package BT_KETHUA_DAHINH;

public class CONGNHAN extends CANBO{
	private int bac;

	public CONGNHAN(String hoTen, int tuoi, String gioiTinh, String diaChiString, int bac) {
		super(hoTen, tuoi, gioiTinh, diaChiString);
		this.bac = bac;
	}

	public CONGNHAN() {
		super();
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap Bac: ");
		this.bac = super.rc.nextInt();
	}
	
	public void xuat() {
		System.out.println(super.toString()+"| Bac: "+this.getBac());
	}

	@Override
	public String toString() {
		return (super.toString()+"| Bac: "+this.getBac());
	}
}
