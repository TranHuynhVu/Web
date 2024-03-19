package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MouseEvent implements ActionListener{
	private View_DangNhap vw;
	public MouseEvent(View_DangNhap vw) {
		this.vw=vw;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();	
		if(s.equals("Login")) {
			System.out.println(this.vw.userNameJTextField.getText());
			System.out.println(this.vw.passwordJTextField.getText());
			if(this.vw.userNameJTextField.getText().equals("")||this.vw.passwordJTextField.getText()=="") {
				JOptionPane.showMessageDialog(this.vw,"Don't have anything !!");
			}
			else {
				this.vw.passwordJTextField.setEchoChar('\0');
			}
		}
		else {
			
			this.vw.passwordJTextField.setEchoChar('\u2022');
			System.out.println(this.vw.passwordJTextField.getText());
		}
		
	}
	
}
