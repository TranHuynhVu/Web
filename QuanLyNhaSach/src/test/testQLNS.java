package test;

import java.awt.EventQueue;
import java.util.ArrayList;

import dao.DAOSach;
import modol.Sach;
import view.ViewQLNS;

public class testQLNS {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewQLNS frame = new ViewQLNS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
