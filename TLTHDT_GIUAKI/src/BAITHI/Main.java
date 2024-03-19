package BAITHI;

import java.util.Scanner;

public class Main {
	static int n;
	private static Scanner input = new Scanner(System.in);
	private static Monhoc mh[];
	
	public static Monhoc[] nhapmh(Monhoc mh[]) {
		mh = new Monhoc[n];
		for(int i = 0; i < n; i++) {
			mh[i] = new Monhoc();
			mh[i].nhap();
		}
		return mh;
	}
	public static void xuatmh(Monhoc mh[]) {
		for(int i = 0; i < n; i++) {
			mh[i].xuat();
		}
	}
	public static int kt(Monhoc mh[]) {
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(mh[i].getSoTinChi() == 3)
				cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		int key;
		Monhoc[] mh = null;
		while(true) {
			System.out.println("1. Nhap");
			System.out.println("2. Xuat");
			System.out.println("2. In stc = 5");
			System.out.println("4. Thoat");
			key = input.nextInt();
			input.nextLine();
			switch(key) {
			case 1: 
				System.out.println("nhap vao n Mon Hoc: ");
				n = input.nextInt();
				input.nextLine();
				
				mh = nhapmh(mh);
				break;
			case 2: xuatmh(mh);
				break;
			case 3: System.out.println("so mon: "+kt(mh));;
				break;
			case 4: break;
			}
		}
		
		
		
		
	}
}
