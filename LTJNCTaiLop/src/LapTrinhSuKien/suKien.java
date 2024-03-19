package LapTrinhSuKien;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.DefaultButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;


public class suKien implements ActionListener, MouseListener, KeyListener{
	private laptrinhsukien lap;
	
	public suKien(laptrinhsukien lap) {
		this.lap = lap;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String sk = e.getActionCommand();
		
		if(sk.equals("Viet Nam")) {
			lap.xinChaoJLabel.setText("Xin Chao");
			lap.xinChaoJLabel.setBackground(Color.red);
			lap.xinChaoJLabel.setOpaque(true);
		}else {
			lap.xinChaoJLabel.setText("Hello");
			lap.xinChaoJLabel.setOpaque(false);
		}
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		if(e.getSource() == lap.vietNamJButton) {
			lap.vietNamJButton.setIcon(new ImageIcon(getClass().getResource("icon_new.png")));
			lap.vietNamJButton.setText("");
//			JOptionPane.showMessageDialog(lap, "hello");
			
		}	else {
			lap.englishjButton.setBackground(Color.yellow);
			lap.englishjButton.setForeground(Color.white);
		}
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		if(e.getSource() == lap.vietNamJButton) {
			lap.vietNamJButton.setText("Viet Nam");
			lap.vietNamJButton.setForeground(null);
			lap.vietNamJButton.setIcon(null);
		}else {
			lap.englishjButton.setBackground(null);
			lap.englishjButton.setForeground(null);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
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
