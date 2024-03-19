package view;

import javax.swing.UIManager;

public class Main {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			View_DangNhap vw=new View_DangNhap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
