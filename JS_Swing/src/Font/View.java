package Font;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame {
	private Model md;
	private JLabel textJLabel;
	public View() {
		md = new Model();
		init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Change Button");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial", Font.BOLD, 40);
		ActionListener actionListener = new Controller(this);
		
		JPanel centerJPanel = new JPanel();
		centerJPanel.setLayout(new GridLayout(2,2,10,10));
		
		JButton jb1 = new JButton("1");
		jb1.setFont(font);
		jb1.addActionListener(actionListener);
		
		JButton jb2 = new JButton("2");
		jb2.setFont(font);
		jb2.addActionListener(actionListener);
		
		JButton jb3 = new JButton("3");
		jb3.setFont(font);
		jb3.addActionListener(actionListener);
		
		JButton jb4 = new JButton("4");
		jb4.setFont(font);
		jb4.addActionListener(actionListener);
		
		centerJPanel.add(jb1);
		centerJPanel.add(jb2);
		centerJPanel.add(jb3);
		centerJPanel.add(jb4);
		
		JPanel footerJPanel = new JPanel();
		footerJPanel.setLayout(new BorderLayout());
		
		textJLabel = new JLabel("-----", JLabel.CENTER);
		textJLabel.setFont(font);
		footerJPanel.add(textJLabel, BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(centerJPanel, BorderLayout.CENTER);
		this.add(textJLabel, BorderLayout.SOUTH);
	}
	
	public void changeVL_1() {
		md.changeValue_1();
		textJLabel.setText("Button "+md.getValue());
	}
	public void changeVL_2() {
		md.changeValue_2();
		textJLabel.setText("Button "+md.getValue());
	}
	public void changeVL_3() {
		md.changeValue_3();
		textJLabel.setText("Button "+md.getValue());
	}
	public void changeVL_4() {
		md.changeValue_4();
		textJLabel.setText("Button "+md.getValue());
	}
	
}
