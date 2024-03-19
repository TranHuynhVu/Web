package BT5;

import java.util.Scanner;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle() {
		super();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public void nhap() {
		Scanner rc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap Width: ");
		this.width = rc.nextDouble();
		System.out.println("Nhap Length: ");
		this.length = rc.nextDouble();
	}
	public void nhapSquare() {
		super.nhap();
	}
	public String xuatSquare() {
		return super.toString();
	}
	@Override
	public String toString() {
		return super.toString()+", Width: "+this.getWidth()+", Lengtd: "+this.getLength();
	}
	@Override
	public double getArea() {
		return this.width * this.length ;
	}
	@Override
	public double getPerimeter() {
		return (this.width + this.length) * 2;
	}
	
}
