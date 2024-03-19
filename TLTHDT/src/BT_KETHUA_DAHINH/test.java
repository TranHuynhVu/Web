package BT_KETHUA_DAHINH;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class test {
	public DSCANBO dscanbo = new DSCANBO();
	public static Scanner rc = new Scanner(System.in);
	public void thenCb() {
		int key;
		while(true) {
			System.out.println("1. Cong Nhan");
			System.out.println("2. Ky Su");
			System.out.println("3. Nhan Vien");
			System.out.println("0. Thoat");
			key = rc.nextInt(); 
			rc.nextLine();
			switch(key) {
			case 1: 	CONGNHAN cn = new CONGNHAN();
						cn.nhap();
						dscanbo.insert(cn);;
						break;
			case 2: 	KYSU ks = new KYSU();
						ks.nhap();
						dscanbo.insert(ks);;
						break;
			case 3: 	NHANVIEN nv = new NHANVIEN();
						nv.nhap();
						dscanbo.insert(nv);;
						break;
			case 0:		break;
			}
			
		}
	}
	public static void main(String[] args) {
		int key;
		while(true) {
			System.out.println("////////////////////////////////////////");
			System.out.println("1. Them can bo");
			System.out.println("2. Tim kiem can bo");
			System.out.println("3. Hien thi thong tin danh sach can bo");
			System.out.println("4. Thoat");
			System.out.println("Nhap vao lua chon: ");
			System.out.println("////////////////////////////////////////");
			key = rc.nextInt();
			rc.nextLine();
			switch(key) {
			case 1:
				break;
			case 2: 
				break;
			case 3:
				break;
			case 4: 
				break;
			}
		}
	}
}
