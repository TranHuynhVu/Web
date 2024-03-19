package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.color.ColorSpace;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;


import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class View_DangNhap extends JFrame {
	protected JTextField userNameJTextField;
	protected JPasswordField passwordJTextField;
	protected JToggleButton btn_iconButton;
	private ActionListener ac;
	private KeyListener kl;
	public View_DangNhap() {
		setTitle("From Login");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.ac=new MouseEvent(this);
		this.kl=new DocumentEvent(this);
		Font font_arial = new Font("Arial", Font.PLAIN, 25);
		this.btn_iconButton=new JToggleButton();
//		this.passwordJTextField.setLayout(new BorderLayout());
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
		passwordJTextField =  new JPasswordField(10);
		passwordJTextField.setFont(font_arial);
		passwordJPanel.add(passwordJLabel);
		passwordJPanel.add(passwordJTextField);
		
		JPanel user_pass = new JPanel(new FlowLayout());
		user_pass.add(userNameJPanel);
		user_pass.add(passwordJPanel);
		
		JButton loGinJButton = new JButton("Login");
		loGinJButton.setFont(font_arial);
		JButton newLoginJButton = new JButton("New Account");
		newLoginJButton.setFont(font_arial);
		
		JPanel login_newlogin = new JPanel(new FlowLayout());
		login_newlogin.add(newLoginJButton);
		login_newlogin.add(loGinJButton);
		this.btn_iconButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View_DangNhap.class.getResource("eye-icon.png"))));
		getContentPane().add(new JPanel());
		getContentPane().add(user_pass);
		getContentPane().add(login_newlogin);
		
		btn_iconButton.setBounds(100, 100, 50, 50);
		passwordJPanel.add(btn_iconButton);
		
		//Event
		loGinJButton.addActionListener(ac);
		newLoginJButton.addActionListener(ac);
		this.passwordJTextField.addKeyListener(kl);
		this.setBackground(Color.white);
		this.setVisible(true);
		
	}

}
