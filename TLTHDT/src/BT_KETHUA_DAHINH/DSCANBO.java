package BT_KETHUA_DAHINH;

import java.util.ArrayList;

public class DSCANBO {
	private ArrayList<CANBO> dsCanbo;

	public DSCANBO() {
		dsCanbo = new ArrayList<CANBO>();
	}

	public DSCANBO(ArrayList<CANBO> dsCanbo) {
		this.dsCanbo = dsCanbo;
	}
	
	public void insert(CANBO cb) {
		dsCanbo.add(cb);
	}
	
	public void update(CANBO cb) {
		dsCanbo.remove(cb);
		dsCanbo.add(cb);
	}
	
	public void delete(CANBO cb) {
		dsCanbo.remove(cb);
	}	
}
