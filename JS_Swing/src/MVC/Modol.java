package MVC;

public class Modol {
	private int value;

	public Modol() {
		this.value = 0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void UpValue() {
		this.value++;
	}
	
	public void DownValue() {
		this.value--;
	}
	
	public void RessetValue() {
		this.value = 0;
	}
	
}
