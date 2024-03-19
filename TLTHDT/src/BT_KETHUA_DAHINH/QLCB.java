package BT_KETHUA_DAHINH;

import java.util.Scanner;

import javax.imageio.event.IIOReadWarningListener;
import javax.management.remote.SubjectDelegationPermission;
import javax.sound.midi.VoiceStatus;

import BT2.CanBo;
import baiTapKeThua.nhanVien;

public class QLCB {
	private static Scanner input = new Scanner(System.in);
	private static 	CANBO[] cBo;
	private static int n;
	public static void nhapcanbo(CANBO[] cBo, int n) {
		int key;
		for(int i = 0; i < n; i++) {
			System.out.println("1. Cong Nhan");
			System.out.println("2. Ky Su");
			System.out.println("3. Nhan Vien");
			key = input.nextInt(); 
			switch(key) {
			case 1: CONGNHAN cn = new CONGNHAN();
					cn.nhap();
					cBo[i] = (CANBO)cn;
					break;
			case 2: KYSU ks = new KYSU();
					ks.nhap();
					cBo[i] = (CANBO)ks;	
					break;
			case 3: NHANVIEN nVien = new NHANVIEN();
					nVien.nhap();
					cBo[i] = (CANBO)nVien;
					break;
			}
		}
	}
	
	public static void xuatcanbo(CANBO[] cb) {
		for(int i = 0; i < cb.length; i++) {		
			System.out.println(cb[i]);
		}
	}
	
	public static void timkiem(CANBO[] cb, String tk) {
		for(int  i = 0; i < cb.length; i++) {
			if(cb[i].getHoTen().equals(tk)) {
				cb[i].xuat();
			}
		}
	}
	public static void main(String[] args) {
		int key;
		boolean run = true;
		while(run) {
			System.out.println("////////////////////////////////////////");
			System.out.println("1. Nhap DS can bo");
			System.out.println("2. Tim kiem can bo");
			System.out.println("3. Hien thi thong tin danh sach can bo");
			System.out.println("4. Thoat");
			System.out.println("Nhap vao lua chon: ");
			System.out.println("////////////////////////////////////////");
			key = input.nextInt();
			input.nextLine();
			switch(key) {
			case 1: System.out.println("Nhap vao n Can Bo: ");
					n = input.nextInt();
					cBo = new CANBO[n];
					nhapcanbo(cBo, n);
				break;
			case 2: System.out.println("Nhap Ten CB can tim: ");
					String tk = input.nextLine();
					timkiem(cBo, tk);
				break;
			case 3:	xuatcanbo(cBo);
				break;
			case 4: run = false;
				break;
			}
		}
	}
}
