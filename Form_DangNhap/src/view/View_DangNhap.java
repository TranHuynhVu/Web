package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.event;
import dao.UserDao;
import modol.User;
import java.awt.event.ActionListener;

public class View_DangNhap extends JFrame {
	public event eventLisener;
	private JTextField userNameJTextField;
	private JTextField passwordJTextField;
	public View_DangNhap() {
		setTitle("From Login");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		eventLisener = new event(this);
		
		Font font_arial = new Font("Arial", Font.PLAIN, 25);

		getContentPane().setLayout(new GridLayout(4, 1));
		
		JPanel userNameJPanel = new JPanel(new FlowLayout());
		JLabel userNameJLabel = new JLabel("UserName: ");
		userNameJLabel.setFont(font_arial);
		userNameJTextField = new JTextField(10);
		userNameJTextField.setFont(font_arial);
		userNameJPanel.add(userNameJLabel);
		userNameJPanel.add(userNameJTextField);
		
		JPanel passwordJPanel = new JPanel(new FlowLayout());
		JLabel passwordJLabel = new JLabel("PassWord: ");
		passwordJLabel.setFont(font_arial);
		passwordJTextField = new JTextField(10);
		passwordJTextField.setFont(font_arial);
		passwordJPanel.add(passwordJLabel);
		passwordJPanel.add(passwordJTextField);
		
		JPanel user_pass = new JPanel(new FlowLayout());
		user_pass.add(userNameJPanel);
		user_pass.add(passwordJPanel);
		
		JButton loGinJButton = new JButton("Login");
		loGinJButton.addActionListener(eventLisener);
		loGinJButton.setFont(font_arial);
		loGinJButton.addActionListener(eventLisener);
		JButton newLoginJButton = new JButton("New Account");
		newLoginJButton.setFont(font_arial);
		
		JPanel login_newlogin = new JPanel(new FlowLayout());
		login_newlogin.add(newLoginJButton);
		login_newlogin.add(loGinJButton);
		
		
		getContentPane().add(new JPanel());
		getContentPane().add(user_pass);
		getContentPane().add(login_newlogin);
		
	}
	
	public User getLogin() {
		String username = userNameJTextField.getText();
		String password = passwordJTextField.getText();
		
		User user = UserDao.getUserDao().selectById(new User(username, password));
		
		if(user != null) {
			return user;
		}
		return null;
	}

}
