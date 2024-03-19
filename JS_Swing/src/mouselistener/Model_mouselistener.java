package mouselistener;

public class Model_mouselistener {
	private int x,y;
	private int count;
	private String ktMouse;
	
	public Model_mouselistener() {

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getKtMouse() {
		return ktMouse;
	}

	public void setKtMouse(String ktMouse) {
		this.ktMouse = ktMouse;
	}
	
	public void click() {
		this.count++;
	}
	
	public void enter() {
		this.ktMouse = "yes";
	}
	
	public void exit() {
		this.ktMouse = "no";
	}
	
}
