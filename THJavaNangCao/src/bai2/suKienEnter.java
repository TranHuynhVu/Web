package bai2;

import java.awt.Button;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

public class suKienEnter implements KeyListener{
	public giaodien1 gd1;

	
	public suKienEnter(giaodien1 gd1) {
		this.gd1 = gd1;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_ENTER ) {
			
			if(e.getSource() == gd1.ida) {
				gd1.idb.requestFocus();
			}
			if(e.getSource() == gd1.idb) {
				gd1.idc.requestFocus();
			}
			if(e.getSource() == gd1.idc) {
				gd1.ida.requestFocus();
			}
			
			
			if(e.getSource() == gd1.btnNewButton) {
				gd1.GiaiPT();
			}else if(e.getSource() == gd1.btnXa) {
				gd1.ida.setText("");
				gd1.idb.setText("");
				gd1.idc.setText("");
				gd1.idketqua.setText("");
			}else if(e.getSource() == gd1.btnNewButton_1_1) {
				gd1.exit();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
