package BT_CK;

import java.util.Date;

public class Experience  extends Candidate{
	
	private int sonamkinhnghiem;
	private String kynang;
	private String noilamviec;
	
	
	
	
	public Experience( 	) {
	}
	public Experience(String hoTen, Date ngaySinh, String diaChi, String queQuan, String dienThoai, String email,
			int sonamkinhnghiem, String kynang, String noilamviec) {
		super(hoTen, ngaySinh, diaChi, queQuan, dienThoai, email);
		this.sonamkinhnghiem = sonamkinhnghiem;
		this.kynang = kynang;
		this.noilamviec = noilamviec;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao so nam kinh nghiem: ");
		this.sonamkinhnghiem = super.rc.nextInt();
		super.rc.nextLine();
		System.out.println("Nhap vao ky nang: ");
		this.kynang = super.rc.nextLine();
		System.out.println("Nhap vao noi lam viec" );
		this.noilamviec = super.rc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Experience [sonamkinhnghiem=" + sonamkinhnghiem + ", kynang=" + kynang + ", noilamviec=" + noilamviec
				+ "]";
	}
	public int getSonamkinhnghiem() {
		return sonamkinhnghiem;
	}
	public void setSonamkinhnghiem(int sonamkinhnghiem) {
		this.sonamkinhnghiem = sonamkinhnghiem;
	}
	public String getKynang() {
		return kynang;
	}
	public void setKynang(String kynang) {
		this.kynang = kynang;
	}
	public String getNoilamviec() {
		return noilamviec;
	}
	public void setNoilamviec(String noilamviec) {
		this.noilamviec = noilamviec;
	}
	
	

}
