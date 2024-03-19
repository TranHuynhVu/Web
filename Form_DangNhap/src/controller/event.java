package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.View_DangNhap;

public class event implements ActionListener{
	public View_DangNhap view_DangNhap;
	
	public event(View_DangNhap view_DangNhap) {
		this.view_DangNhap = view_DangNhap;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String tenNut = e.getActionCommand();
		
		if(tenNut.equals("Login")) {
			if(view_DangNhap.getLogin() != null) {
				view_DangNhap.setVisible(false);
				
			}else {
				JOptionPane.showMessageDialog(view_DangNhap, "Sai thông tin tài khoản hoặc mật khẩu");
			}
		}
		
	}

}
