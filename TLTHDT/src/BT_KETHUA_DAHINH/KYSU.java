package BT_KETHUA_DAHINH;

public class KYSU extends CANBO{
	private String nganhDaoTao;

	public KYSU(String hoTen, int tuoi, String gioiTinh, String diaChiString, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChiString);
		this.nganhDaoTao = nganhDaoTao;
	}

	public KYSU() {
		super();
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap Nganh Dao Tao: ");
		this.nganhDaoTao = super.rc.nextLine();
	}
	
	public void xuat() {
		System.out.println(super.toString()+"| Nghanh Dao Tao: "+this.getNganhDaoTao());
	}

	@Override
	public String toString() {
		return (super.toString()+"| Nghanh Dao Tao: "+this.getNganhDaoTao());
	}
	
}
