package bt1;

import java.util.Scanner;

public class nhap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		a nvA = null;
		int luachon = scanner.nextInt();
		
		switch (luachon) {
		case 1: {
			
			nvA = new b();
			nvA.in();
			break;
		}
			case 2: {
			
				nvA = new c();
				nvA.in();
				break;
			}
	}
}
}
class a{
	
	public a(){
		
	}
	public void in() {
		System.out.println("a");
	}
}
class b extends a{
	public b() {
		
	}
	public void in() {
		System.out.println("b");
	}
}
class c extends a{
	public c() {
		
	}
	public void in() {
		System.out.println("c");
	}
}
