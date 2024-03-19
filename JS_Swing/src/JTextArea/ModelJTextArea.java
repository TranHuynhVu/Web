package JTextArea;

public class ModelJTextArea {	
	private static String vanBan = "Tran huynh vu vu";
	private static String timKiem = "vu vu";
	private String ketQua;
	
	public ModelJTextArea() {
		this.vanBan = "";
		this.timKiem = "";
		this.ketQua = "";
	}

	public String getVanBan() {
		return vanBan;
	}

	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}

	public String getTimKiem() {
		return timKiem;
	}

	public void setTimKiem(String timKiem) {
		this.timKiem = timKiem;
	}

	public String getKetQua() {
		return ketQua;
	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}
	
	public int timkiem() {
		int dem = 0;
		int i = vanBan.indexOf(timKiem);
		while(true) {
			if(i == -1) {
				break;
			}else {
				dem++;
				i = vanBan.indexOf(timKiem,i+1);
			}	
		}
		return dem;
	}
}
