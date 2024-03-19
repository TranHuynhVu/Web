package BT5;

import java.util.ArrayList;
import java.util.Scanner;

public class ListShape {
 	private static Scanner rc = new Scanner(System.in);
 	private static ArrayList<Shape> shapesList = new ArrayList<Shape>();
	
	public static void nhapShape() {
		boolean run = true;
		int key;
		while(run) {
			System.out.println("*********************");
			System.out.println("*                   *");
			System.out.println("*  1. Rectangle     *");
			System.out.println("*  2. Circle        *");
			System.out.println("*  3. Square        *");
			System.out.println("*  4. Thoat         *");
			System.out.println("*                   *");
			System.out.println("*********************");
			System.out.print("Nhap vao Lua chon: ");
			key = rc.nextInt();
			rc.nextLine();
			switch(key) {
				case 1: Shape Rectangle = new Rectangle();
						Rectangle.nhap();
						shapesList.add(Rectangle);
						break;
				case 2: Shape Circle = new Circle();
						Circle.nhap();
						shapesList.add(Circle);
						break;
				case 3: Shape Square = new Square();
						Square.nhap();
						shapesList.add(Square);
						break;
				case 4: run = false;
						break;
			}
		}
	}
	public static void xuatShape() {
		for (Shape shape : shapesList) {
			System.out.println(shape);
		}
	}
	public static double TongArea() {
		double Tong = 0;
		for (Shape shape : shapesList) {
			Tong += shape.getArea();
		}
		return Tong;
	}
	public static double TongPerimater() {
		double Tong = 0;
		for (Shape shape : shapesList) {
			Tong += shape.getPerimeter();
		}
		return Tong;
	}
	public static void main(String[] args) {
		int key;
		boolean run = true;
		while(run) {
			System.out.println("***************************");
			System.out.println("*                         *");
			System.out.println("* 1. Nhap Shape           *");
			System.out.println("* 2. In Shape             *");
			System.out.println("* 3. Tong dien tich Shape *");
			System.out.println("* 4. Tong chu vi Shape    *");
			System.out.println("* 5. Thoat                *");
			System.out.println("*                         *");
			System.out.println("***************************");
			System.out.print("Nhap lua chon: ");
			key = rc.nextInt();
			rc.nextLine();
			switch(key) {
				case 1: nhapShape();
						break;
				case 2:	xuatShape();
						break;
				case 3: System.out.println("Tong dien tich la: ");
						System.out.println(TongArea());
						break;
				case 4:	System.out.println("Tong chu vi la: ");
						System.out.println(TongPerimater());
						break;
				case 5: run = false;
						break;
			}
		}
		
	}
}
