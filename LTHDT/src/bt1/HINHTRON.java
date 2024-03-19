package bt1;

public class  HINHTRON extends HINH{
	private float r;

	public HINHTRON(String tenHinh, String mauHinh, boolean toMau, float r) {
		super(tenHinh, mauHinh, toMau);
		this.r = r;
	}

	public HINHTRON() {
		super.nhap();;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}
	
	public float dienTich() {
		return (float)Math.PI * r * r;
	}

	@Override
	public String toString() {
		return (super.toString() + ", Ban kinh: " + r);
	}
	
	

}
