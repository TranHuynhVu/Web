package BT2;

import java.awt.Menu;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.crypto.spec.RC2ParameterSpec;

public class main {
	public static int n;
	public static NhanVien[] nVien;
	public ArrayList<CanBo> ds = new ArrayList<CanBo>();
	public static Scanner ip = new Scanner(System.in); 
	
	public static void nhapNV(NhanVien nVien[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Nhan vien "+(i+1));
			nVien[i] = new NhanVien(); 
		}
	}
	public static void xuatNV(NhanVien nVien[], int n) {
		for (int i = 0; i < n; i++)
			System.out.println(nVien[i].toString());
	}
	public static void timkiem(NhanVien nVien[], int n,String tk) {
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if(nVien[i].getHoten().equalsIgnoreCase(tk)) {
				System.out.println(nVien[i].toString());
				dem++;
			}
			if(dem != 0)
				System.out.println("Khong co nhann vien "+tk);
				
		}
	}
	public static void menu() {
		boolean run = true;
		String tennvTK;
		while (run) {
			int key;
			System.out.println("***********************");
			System.out.println("1. Nhap NV");
			System.out.println("2. Xuat NV");
			System.out.println("3. Tim kiem ten NV");
			System.out.println("4. Thoat");
			System.out.println("Nhap vao lua chon:");
			System.out.println("***********************");
			key = ip.nextInt();
			switch(key) {
				case 1:	System.out.println("Nhap vao n nhan vien:");
						n = ip.nextInt();
						nVien = new NhanVien[n];
						nhapNV(nVien,n);
						break;
						
				case 2: xuatNV(nVien,n);
						break;
				
				case 3: System.out.println("Nhap vao nhan vien muon tim: ");
						ip.nextLine();
						tennvTK = ip.nextLine();
						timkiem(nVien,n,tennvTK);
						break;
				
				case 4: run = false;
			}
		}
	}
	public static void main(String[] args) {
		menu();
	
	}

}
