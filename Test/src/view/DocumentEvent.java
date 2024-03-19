package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.event.DocumentListener;

public class DocumentEvent implements KeyListener {
	private View_DangNhap vw;
	public DocumentEvent(View_DangNhap vw) {
		this.vw=vw;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		this.vw.passwordJTextField.setEchoChar('\u2022');
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
