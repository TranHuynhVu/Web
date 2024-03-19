package BT5;

import java.util.Scanner;

public abstract class Shape {
	protected String color;
	protected boolean filled;

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public Shape() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public void nhap() {
		Scanner rc = new Scanner(System.in);
		System.out.println("Nhap Color: ");
		this.color = rc.nextLine();
		System.out.println("Nhap Filler: ");
		this.filled = rc.nextBoolean();
	}
	
	@Override
	public String toString() {
		return ("Color: "+this.getColor()+", Filled: "+this.isFilled());
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
