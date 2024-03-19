package TGK;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class DSSACH {
	public  ArrayList<SACH> DS;
	Scanner rc = new Scanner(System.in);

	public DSSACH() {
		DS = new ArrayList<SACH>();
	}

	public  void themSach() {
		int key;
		System.out.println("*********************");
		System.out.println("* 1. Sach Tham Khao *");
		System.out.println("* 2. Sach Giao Khoa *");
		System.out.println("*********************");
		key = rc.nextInt();
		if(key == 1) {
			SACHTHAMKHAO stk = new SACHTHAMKHAO();
			stk.nhap();
			DS.add(stk);
		}else {
			SACHGIAOKHOA sgk = new SACHGIAOKHOA();
			sgk.nhap();
			DS.add(sgk);
		}
	}
	
	public  void hienThiDanhSach() {
		for (SACH sach : DS) {
			System.out.println(sach);
		}
	}
	
	public void xoa(String maSach) {
//		String mString;
//		System.out.println("Nhap vao Ma Sach Xoa: ");
//		rc.nextLine();
//		mString = rc.nextLine();
//		for(int i = 0; i < DS.size(); i++) {
//			if(DS.get(i).getMaSach().equals(mString))
//				DS.remove(i);
//		}
		for(int i = 0; i < DS.size(); i++) {
			if(DS.get(i).getMaSach().equals(maSach)) {
				DS.remove(i);
			}
		}
	}
	
	public void capNhat(String maSach) {
		for(int i = 0; i < DS.size(); i++) {
			if(DS.get(i).getMaSach().equals(maSach)) {
				DS.get(i).nhap();
			}
		}
	}
	
	public void timKiem(String maSach) {
		for(int i = 0; i < DS.size(); i++) {
			if(DS.get(i).getMaSach().equals(maSach)) {
				System.out.println(DS.get(i));
			}
		}
	}
	
	public double tongTienSGK() {
		double tg = 0;
		for(int i = 0; i < DS.size(); i++) {
			if(DS.get(i) instanceof SACHGIAOKHOA) {
				tg += DS.get(i).TinhThanhTien();
			}
		}
		return tg;
	}
	public double tongTienSTK() {
		double tg = 0;
		for(int i = 0; i < DS.size(); i++) {
			if(DS.get(i) instanceof SACHTHAMKHAO) {
				tg += DS.get(i).TinhThanhTien();
			}
		}
		return tg;
	}
}
