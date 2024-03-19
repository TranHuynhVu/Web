package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewQLNS extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField textField;
	private JTable table;
	private Container lblNewLabel_5;

	public ViewQLNS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Quan Ly Nha Sach");
		setSize(1200,650);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 255, 255)));
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(0, 0, 1190, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/logo (100x80).png")));
		lblNewLabel.setBounds(10, 10, 100, 80);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(120, 10, 950, 80);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("QUẢN LÝ THƯ VIỆN");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(0, 5, 940, 33);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 28));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TRƯỜNG ĐẠI HỌC SƯ PHẠM KỸ THUẬT - ĐẠI HỌC ĐÀ NẲNG");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(0, 43, 950, 33);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 28));
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(1080, 31, 100, 39);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 98, 270, 515);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(250, 250, 210));
		panel_3.setBounds(10, 10, 250, 60);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tra cứu");
		lblNewLabel_1.setBounds(10, 0, 108, 60);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_4.setBounds(200, 0, 40, 60);
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/iconSearch(40x40).png")));
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(250, 250, 210));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 80, 250, 60);
		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Danh sách mượn");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 0, 180, 60);
		panel_3_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_4_1.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/iconBook(40x40).png")));
		lblNewLabel_4_1.setBounds(200, 0, 40, 60);
		panel_3_1.add(lblNewLabel_4_1);
		
		lblNewLabel_5 = new JLabel("Tìm Kiếm");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_5.setBounds(311, 143, 88, 30);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(437, 120, 696, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 10));
		comboBox.addItem("Danh mục sách");
		comboBox.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox.setBackground(new Color(192, 192, 192));
		comboBox.setBounds(437, 180, 328, 30);
		contentPane.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial", Font.BOLD, 10));
		comboBox_1.addItem("Thể loại");
		comboBox_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_1.setBackground(new Color(192, 192, 192));
		comboBox_1.setBounds(793, 180, 197, 30);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_1 = new JButton("Làm mới");
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1.setBounds(1019, 180, 114, 30);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_4.setBounds(267, 233, 923, 1);
		contentPane.add(panel_4);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Tên sách", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Danh mục", "Thể loại", "Tóm tắc nội dung"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(280, 244, 896, 288);
		contentPane.add(scrollPane);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 250, 205));
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5.setBounds(962, 545, 214, 50);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Xem chi tiết");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(82, 0, 111, 50);
		panel_5.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/book1(40x40).png")));
		lblNewLabel_7.setBounds(22, 3, 40, 47);
		panel_5.add(lblNewLabel_7);
		
	
		
	
		
		
	}
}
