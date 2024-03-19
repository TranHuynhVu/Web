package Bai1;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GiaoDien1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien1 frame = new GiaoDien1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GiaoDien1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("red");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(159, 33, 84, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Green");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(159, 81, 84, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("blue");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_2.setFont(new Font("Arial", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBounds(159, 135, 84, 21);
		panel.add(rdbtnNewRadioButton_2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Change Color");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					panel.setBackground(Color.red);
					rdbtnNewRadioButton.setBackground(Color.red);
					rdbtnNewRadioButton_1.setBackground(Color.red);
					rdbtnNewRadioButton_2.setBackground(Color.red);
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					panel.setBackground(Color.green);
					rdbtnNewRadioButton.setBackground(Color.green);
					rdbtnNewRadioButton_1.setBackground(Color.green);
					rdbtnNewRadioButton_2.setBackground(Color.green);
				}
				if(rdbtnNewRadioButton_2.isSelected()) {
					panel.setBackground(Color.BLUE);
					rdbtnNewRadioButton.setBackground(Color.BLUE);
					rdbtnNewRadioButton_1.setBackground(Color.BLUE);
					rdbtnNewRadioButton_2.setBackground(Color.BLUE);
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(111, 187, 188, 42);
		panel.add(btnNewButton);
		

	}
}
