package BT1;

import java.security.PublicKey;
import java.util.Scanner;

public class main {

	public static void nhapStd(Student std[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap sinh vien "+(i+1));
			std[i] = new Student();
		}
	}
	public static void inStd(Student std[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(std[i].toString());
		}
	}
	
	public static void KTHB(Student std[], int n) {
		for(int i = 0; i < n; i++) {
			if(std[i].getDtb() > 8.5)
				System.out.println("Sinh vien "+ (i+1) + "ok");
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao so luong Student: ");
		n = input.nextInt();
		Student[] std = new Student[n];
		nhapStd(std,n);
		inStd(std,n);
		
	}

}
