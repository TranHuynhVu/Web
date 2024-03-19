package bai2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.security.auth.x500.X500Principal;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class giaodien1 extends JFrame {

	private JPanel contentPane;
	protected JTextField ida;
	protected JLabel lblNewLabel_2;
	protected JTextField idb;
	protected JLabel lblNewLabel_3;
	protected JTextField idc;
	protected JTextArea idketqua;
	protected JButton btnNewButton;
	protected JButton btnXa;
	protected JButton btnNewButton_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giaodien1 frame = new giaodien1();
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
	public giaodien1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 588);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		suKienEnter sk = new suKienEnter(this);
		JLabel lblNewLabel = new JLabel("Giải phương trình bậc hai");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 22, 534, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("a=");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(124, 101, 32, 36);
		contentPane.add(lblNewLabel_1);
		
		ida = new JTextField();
		ida.addKeyListener(sk);
		ida.setFont(new Font("Arial", Font.BOLD, 20));
		ida.setBounds(166, 100, 246, 37);
		contentPane.add(ida);
		ida.setColumns(10);
		
		lblNewLabel_2 = new JLabel("b=");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(124, 165, 32, 36);
		contentPane.add(lblNewLabel_2);
		
		idb = new JTextField();
		idb.addKeyListener(sk);
		idb.setFont(new Font("Arial", Font.BOLD, 20));
		idb.setColumns(10);
		idb.setBounds(166, 164, 246, 37);
		contentPane.add(idb);
		
		lblNewLabel_3 = new JLabel("c=");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3.setBounds(124, 235, 32, 36);
		contentPane.add(lblNewLabel_3);
		
		idc = new JTextField();
		idc.addKeyListener(sk);
		idc.setFont(new Font("Arial", Font.BOLD, 20));
		idc.setColumns(10);
		idc.setBounds(166, 234, 246, 37);
		contentPane.add(idc);
		
	
		
		btnNewButton = new JButton("Giải");
		btnNewButton.addKeyListener(sk);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GiaiPT();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(87, 307, 85, 37);
		contentPane.add(btnNewButton);
		
		btnXa = new JButton("Xóa");
		btnXa.addKeyListener(sk);
		btnXa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ida.setText("");
				idb.setText("");
				idc.setText("");
				idketqua.setText("");
			}
		});
		btnXa.setFont(new Font("Arial", Font.BOLD, 16));
		btnXa.setBounds(227, 307, 85, 37);
		contentPane.add(btnXa);
		
		btnNewButton_1_1 = new JButton("Thoát");
		btnNewButton_1_1.addKeyListener(sk);
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				exit();
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(377, 307, 85, 37);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Kết quả");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(53, 367, 78, 19);
		contentPane.add(lblNewLabel_4);
		
		idketqua = new JTextArea();
		idketqua.setBounds(54, 405, 443, 109);
		contentPane.add(idketqua);
	}
	
	public void GiaiPT() {
		String x,x1,x2;
		int a,b,c;
		DecimalFormat df = new DecimalFormat("#.##");
			
		try {
				a = Integer.parseInt(ida.getText());
				b = Integer.parseInt(idb.getText());
				c = Integer.parseInt(idb.getText());
				float denta = b*b - 4*a*c;
				if(denta < 0) {
					JOptionPane.showMessageDialog(null, "phương trình vô nghiệm");
				}else if(denta == 0){
					 x = df.format(-b/(2*a));
					 idketqua.setText("Trần Huỳnh Vũ"+"\n"+"Phương trình có một nghiệm"+"\n"+"x = "+String.valueOf(x));
				}else {
					x1 = df.format((-b + Math.sqrt(denta))/2*a);
					x2 = df.format((-b - Math.sqrt(denta))/2*a);
					idketqua.setText("Trần Huỳnh Vũ"+"\n"+"Phương trình có hai nghiệm"+"\n"+"x1 = "+String.valueOf(x1)+"\n"+"x2 = "+String.valueOf(x2));
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Lỗi nhập a, b, c");
			}
	}
	public void exit() {
		System.exit(0);
	}
}