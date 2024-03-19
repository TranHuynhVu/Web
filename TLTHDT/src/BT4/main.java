package BT4;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;
import javax.swing.SizeRequirements;

public class main {
	static int n;
	static Shape[] sh;
	static Scanner rc = new Scanner(System.in);
	

	public static void nhapShape(Shape sh[], int n) {
		int lc;
		boolean kt;
		System.out.println("Nhap vao so luong Shape: ");
		n = rc.nextInt();
		sh = new Shape[n];
		for (int i = 0; i < n; i++) {
			do {
				kt = false;
				System.out.println("Shape "+(i+1));
				System.out.println("1. Cricle");
				System.out.println("2. Rectangle");
				System.out.println("Nhap lua chon: ");
				lc = rc.nextInt();
				rc.nextLine();
				if(lc == 1) {
					 sh[i] = new Circle();
					 System.out.println("Nhap mau: ");
					 String color = rc.nextLine();
		             System.out.println("Da to mau: ");            
		             boolean filled = rc.nextBoolean();
		             System.out.println("Nhap radius");
		             double radius = rc.nextDouble();
		             sh[i] = new Circle(color, filled, radius); 	
				}else if(lc == 2) {
					   System.out.println("Nhap mau: ");
		               String color = rc.nextLine();
		               System.out.println("Da to mau: ");
		               boolean filled = rc.nextBoolean();
		               System.out.println("Nhap length");
		               double length = rc.nextDouble();
		               System.out.println("Nhap height");
		               double height = rc.nextDouble();
		               sh[i] = new Rectangle(color, filled, height, length);
				}else {
					System.out.println("Nhap sai");
					kt = true;
				}	
			}while(kt == true);
		}
	}
	
	public static void xuatShape(Shape sh[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.println((i+1) +". "+sh[i]);
		}
	}
	public static double tongdtShape(Shape sh[], int n) {
		double tongdt = 0;
		for (int i = 0; i < n; i++) {
			if(sh[i] instanceof Circle) {
				Circle htCircle = (Circle)sh[i];
				tongdt += htCircle.getArea();
			}else {
				Rectangle htRectangle = (Rectangle)sh[i];
				tongdt += htRectangle.getArea();
			}
		}
		return tongdt;
	}
	public static void main(String[] args) {
		nhapShape(sh, n);
		xuatShape(sh, n);
		System.out.println("Tong dt la: "+tongdtShape(sh, n));
	}
}
