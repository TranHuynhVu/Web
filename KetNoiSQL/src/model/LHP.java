package model;

public class LHP {
	private String malhp;
	private String tenlhp;
	private int sotc;
	
	public LHP() {
		super();
	}

	public LHP(String malhp, String tenlhp, int sotc) {
		super();
		this.malhp = malhp;
		this.tenlhp = tenlhp;
		this.sotc = sotc;
	}

	public String getMalhp() {
		return malhp;
	}

	public void setMalhp(String malhp) {
		this.malhp = malhp;
	}

	public String getTenlhp() {
		return tenlhp;
	}

	public void setTenlhp(String tenlhp) {
		this.tenlhp = tenlhp;
	}

	public int getSotc() {
		return sotc;
	}

	public void setSotc(int sotc) {
		this.sotc = sotc;
	}

	@Override
	public String toString() {
		return "LHP [malhp=" + malhp + ", tenlhp=" + tenlhp + ", sotc=" + sotc + "]";
	}
	
}
