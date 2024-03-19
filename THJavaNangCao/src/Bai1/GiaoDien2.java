package Bai1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDien2 extends JFrame {

	private JPanel contentPane;
	private JCheckBox BongDa;
	private JCheckBox BoiLoi;
	private JCheckBox BongBan;
	private JCheckBox CauLong;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien2 frame = new GiaoDien2();
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
	public GiaoDien2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bạn thích môn thể thao nào ?");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(95, 32, 209, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
				String id = "";
			
				if(BongDa.isSelected()) {
					 id += BongDa.getText() +"\n";
				}
				if(BoiLoi.isSelected()) {
					 id += BoiLoi.getText() +"\n";
				}
				if(BongBan.isSelected()) {
					 id += BongBan.getText() +"\n";
				}
				if(CauLong.isSelected()) {
					 id += CauLong.getText() +"\n";
				}
				textArea.setText(id);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(432, 32, 85, 39);
		contentPane.add(btnNewButton);
		
		BongDa = new JCheckBox("Bóng đá");
		BongDa.setFont(new Font("Arial", Font.BOLD, 16));
		BongDa.setBounds(133, 87, 93, 21);
		contentPane.add(BongDa);
		
		BoiLoi = new JCheckBox("Bơi lội");
		BoiLoi.setFont(new Font("Arial", Font.BOLD, 16));
		BoiLoi.setBounds(133, 140, 93, 21);
		contentPane.add(BoiLoi);
		
		BongBan = new JCheckBox("Bóng bàn");
		BongBan.setFont(new Font("Arial", Font.BOLD, 16));
		BongBan.setBounds(133, 195, 107, 21);
		contentPane.add(BongBan);
		
		CauLong = new JCheckBox("Cầu lông");
		CauLong.setFont(new Font("Arial", Font.BOLD, 16));
		CauLong.setBounds(133, 257, 93, 21);
		contentPane.add(CauLong);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.BOLD, 16));
		textArea.setBounds(368, 87, 229, 191);
		contentPane.add(textArea);
	}
}
