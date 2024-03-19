package Color;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import MVC.Controller;

public class View extends JFrame{
	private Model model;
	private JLabel text;
	private JPanel texJPanel;
	
	public View() {
		model = new Model();
		init();
		
	}
	
	public void init() {
		this.setTitle("Color");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 20);
		ActionListener actionListener = new Controller_Color(this);
		
		texJPanel = new JPanel();
		texJPanel.setLayout(new BorderLayout());
		text = new JLabel("Change Color", JLabel.CENTER);
		text.setFont(font);
		texJPanel.add(text, BorderLayout.CENTER);
		
		JPanel footerJPanel = new JPanel();
		footerJPanel.setLayout(new GridLayout(2,3,10,10));
	
		JButton jb1 = new JButton("DO");
		jb1.setFont(font);
		jb1.setForeground(Color.RED);
		jb1.addActionListener(actionListener);
		
		
		JButton jb2 = new JButton("VANG");
		jb2.setFont(font);
		jb2.setForeground(Color.YELLOW);
		jb2.addActionListener(actionListener);
		
		
		JButton jb3 = new JButton("XANH");
		jb3.setFont(font);
		jb3.setForeground(Color.GREEN);
		jb3.addActionListener(actionListener);
		
		
		JButton jb4 = new JButton("BG_DO");
		jb4.setFont(font);
		jb4.setBackground(Color.RED);
		jb4.addActionListener(actionListener);
		
		
		JButton jb5 = new JButton("BG_VANG");
		jb5.setFont(font);
		jb5.setBackground(Color.YELLOW);
		jb5.addActionListener(actionListener);
		
		
		JButton jb6 = new JButton("BG_XANH");
		jb6.setFont(font);
		jb6.setBackground(Color.GREEN);
		jb6.addActionListener(actionListener);
		
		footerJPanel.add(jb1);
		footerJPanel.add(jb2);
		footerJPanel.add(jb3);
		footerJPanel.add(jb4);
		footerJPanel.add(jb5);
		footerJPanel.add(jb6);
		
		this.setLayout(new BorderLayout());
		this.add(texJPanel,BorderLayout.CENTER);
		this.add(footerJPanel, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	public void setColor_DO() {
		model.setTextColor(Color.RED);
		text.setForeground(model.getTextColor());
	}
	public void setColor_VANG() {
		model.setTextColor(Color.YELLOW);
		text.setForeground(model.getTextColor());
	}
	public void setColor_XANH() {
		model.setTextColor(Color.green);
		text.setForeground(model.getTextColor());
	}
	public void setColor_BGDO() {
		model.setBackgroudColor(Color.RED);
		texJPanel.setBackground(model.getBackgroudColor());
	}
	public void setColor_BGVANG() {
		model.setBackgroudColor(Color.YELLOW);
		texJPanel.setBackground(model.getBackgroudColor());
	}
	public void setColor_BGXANH() {
		model.setBackgroudColor(Color.green);
		texJPanel.setBackground(model.getBackgroudColor());
	}
}
