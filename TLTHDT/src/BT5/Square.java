package BT5;

import java.util.Scanner;

public class Square extends Rectangle{
	
	public Square(String color, boolean filler, double side) {
		super(color,filler,side,side);
	}
	
	public Square(double side) {
		super(side,side);	
	}

	public Square() {
		super();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	public void nhap() {
		super.nhapSquare();
		Scanner rc = new Scanner(System.in);
		System.out.println("Nhap Square: ");
		this.setSide(rc.nextDouble());
	}
	
	@Override
	public String toString() {
		return super.xuatSquare()+", Side: "+this.getSide();
	}
	
}
