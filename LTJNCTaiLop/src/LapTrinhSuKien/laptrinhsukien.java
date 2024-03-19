package LapTrinhSuKien;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class laptrinhsukien extends JFrame {
	public JButton vietNamJButton;
	public JButton englishjButton;
	public JLabel xinChaoJLabel;
	public JPanel jp;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					laptrinhsukien frame = new laptrinhsukien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public laptrinhsukien() {
		setTitle("Lap Trinh Su Kien");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		suKien sKien = new suKien(this);		
		setLayout(new GridBagLayout());
			
		jp = new JPanel(new GridLayout(1, 5));
		
		xinChaoJLabel = new JLabel("Xin Chao",JLabel.CENTER);

		vietNamJButton = new JButton("Viet Nam");
		vietNamJButton.addActionListener(sKien);
		vietNamJButton.addMouseListener(sKien);
		englishjButton = new JButton("English");
		englishjButton.addActionListener(sKien);
		englishjButton.addMouseListener(sKien);

		englishjButton.addActionListener(sKien);
		
		
		jp.add(new JPanel());
		jp.add(xinChaoJLabel);
		jp.add(vietNamJButton);
		jp.add(englishjButton);
		jp.add(new JPanel());
	
		
		add(jp);
	
	}

}
