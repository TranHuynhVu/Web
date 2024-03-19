package BT5;

import java.util.Scanner;

public  class Circle extends Shape {
	private double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void nhap() {
		Scanner rc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap Radius: ");
		this.radius = rc.nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString()+", Radius: "+this.getRadius();
	}
	
	@Override
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

}
