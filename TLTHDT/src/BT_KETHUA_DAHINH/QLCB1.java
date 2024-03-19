package BT_KETHUA_DAHINH;

import java.util.ArrayList;
import java.util.Scanner;


public class QLCB1 {
	private static Scanner input = new Scanner(System.in); 
	private static ArrayList<CANBO> cbArrayList = new ArrayList<CANBO>();
	
	public static void themcanbo(int n) {
		int key;
		for(int i = 0; i < n; i++) {
			System.out.println("1. Cong Nhan");
			System.out.println("2. Ky Su");
			System.out.println("3. Nhan Vien");
			key = input.nextInt(); 
			switch(key) {
			case 1: CONGNHAN cn = new CONGNHAN();
					cn.nhap();
					cbArrayList.add(cn);
					break;
			case 2: KYSU ks = new KYSU();
					ks.nhap();
					cbArrayList.add(ks);
					break;
			case 3: NHANVIEN nv = new NHANVIEN();
					nv.nhap();
					cbArrayList.add(nv);
					break;
			}
		}
	}
	
	public static void xuatcb() {
//		for(int i = 0; i < cbArrayList.size(); i++) {
//			System.out.println(cbArrayList.get(i));
//		}
		for(CANBO sb : cbArrayList) {
			System.out.println(sb);
		}
	}
	
	public static void timkiem(String tk) {
		for(int i = 0; i < cbArrayList.size(); i++) {
			if(cbArrayList.get(i).getHoTen().equals(tk)) {
				System.out.println(cbArrayList.get(i));
			}
		}
	}
	public static void main(String[] args) {
		int key,n;
		String tk = "";
		boolean run = true;
		while(run) {
			System.out.println("////////////////////////////////////////");
			System.out.println("1. Them can bo");
			System.out.println("2. Tim kiem can bo");
			System.out.println("3. Hien thi thong tin danh sach can bo");
			System.out.println("4. Thoat");
			System.out.println("Nhap vao lua chon: ");
			System.out.println("////////////////////////////////////////");
			key = input.nextInt();
			input.nextLine();
			switch(key) {
			case 1: System.out.println("Nhap so luong CB can them: ");
					n = input.nextInt();
					themcanbo(n);
				break;
			case 2: System.out.println("Nhap Ten CB: ");
					tk = input.nextLine();
					timkiem(tk);
				break;
			case 3:	xuatcb();
				break;
			case 4: run = false;
				break;
			}
		}
	}
}
