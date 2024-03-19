package TGK;

import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

public class BAIKIEMTRA {
	public static void main(String[] args) {
		DSSACH ds = new DSSACH();
		boolean run = true;
		int kt,n;
		Scanner rc = new Scanner(System.in);
		while(run) {
			System.out.println("*******************");
			System.out.println("* 1.Them Sach     *");
			System.out.println("* 2.Xoa sach      *");
			System.out.println("* 3.Cap nhat sach *");
			System.out.println("* 4.Hien thi sach *");
			System.out.println("* 5.Tim kiem      *");
			System.out.println("* 6.Tong tien sach*");
			System.out.println("* 7.Thoat         *");
			System.out.println("*******************");
			kt = rc.nextInt();
			rc.nextLine();
			switch(kt) {
			case 1:	System.out.println("Nhap vao so luong sach: ");
					n = rc.nextInt();
					for(int i = 0; i < n; i++) {
						System.out.println("Sach thu "+(i+1));
						ds.themSach();
					}
					break;
			case 2:	System.out.println("Nhap maSach can xoa: ");
			 		String maSachXoa;
			 		maSachXoa = rc.nextLine();
			 		ds.xoa(maSachXoa);
					break;
			case 3:	System.out.println("Nhap maSach can cap nhat: ");
	 				String maSachCapNhat;
	 				maSachCapNhat = rc.nextLine();
	 				ds.capNhat(maSachCapNhat);
					break;
			case 4:	ds.hienThiDanhSach();
					break;
			case 5:	System.out.println("Nhap maSach tim kiem: ");
			 		String maSachTimKiem;
			 		maSachTimKiem = rc.nextLine();
			 		ds.timKiem(maSachTimKiem);
					break;
			case 6: System.out.print("Tong tien SGK: \n"+ds.tongTienSGK());
					System.out.println("Tong tien STK: \n"+ds.tongTienSTK());
					break;
			case 7:	run = false;
					break;
			}
		}
	}
}
