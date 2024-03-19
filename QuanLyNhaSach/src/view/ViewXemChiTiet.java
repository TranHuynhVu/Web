package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import modol.Sach;

public class ViewXemChiTiet extends JFrame {

	private JPanel contentPane;
	public JTextArea idTTND;
	public JLabel idTheLoai;
	public JLabel idDanhMuc;
	public JLabel idNamXuatBan;
	public Component idNhaXuatBan;
	public JLabel idTenTacGia;
	public JLabel idTensach;
	
	public ViewXemChiTiet() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, -47, 493, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 102));
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		idTensach = new JLabel("");
		idTensach.setForeground(new Color(0, 0, 128));
		idTensach.setHorizontalAlignment(SwingConstants.CENTER);
		idTensach.setFont(new Font("Arial", Font.BOLD, 20));
		idTensach.setBounds(10, 9, 444, 40);
		contentPane.add(idTensach);
		
		JLabel lblNewLabel_1 = new JLabel("Nhà xuất bản:");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(39, 128, 107, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Năm xuất bản:");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(39, 178, 107, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Danh mục:");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(39, 228, 107, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Thẻ loại:");
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(39, 278, 107, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tóm tắc nội dung:");
		lblNewLabel_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(39, 327, 142, 18);
		contentPane.add(lblNewLabel_5);
		
		idTenTacGia = new JLabel("");
		idTenTacGia.setForeground(new Color(0, 0, 128));
		idTenTacGia.setFont(new Font("Arial", Font.PLAIN, 15));
		idTenTacGia.setBounds(191, 82, 248, 15);
		contentPane.add(idTenTacGia);
		
		idNhaXuatBan = new JLabel("");
		idNhaXuatBan.setForeground(new Color(0, 0, 128));
		idNhaXuatBan.setFont(new Font("Arial", Font.PLAIN, 15));
		idNhaXuatBan.setBounds(191, 128, 248, 15);
		contentPane.add(idNhaXuatBan);
		
		idNamXuatBan = new JLabel("");
		idNamXuatBan.setForeground(new Color(0, 0, 128));
		idNamXuatBan.setFont(new Font("Arial", Font.PLAIN, 15));
		idNamXuatBan.setBounds(191, 178, 248, 13);
		contentPane.add(idNamXuatBan);
		
		idDanhMuc = new JLabel("");
		idDanhMuc.setForeground(new Color(0, 0, 128));
		idDanhMuc.setFont(new Font("Arial", Font.PLAIN, 15));
		idDanhMuc.setBounds(191, 228, 248, 15);
		contentPane.add(idDanhMuc);
		
		idTheLoai = new JLabel("");
		idTheLoai.setForeground(new Color(0, 0, 128));
		idTheLoai.setFont(new Font("Arial", Font.PLAIN, 15));
		idTheLoai.setBounds(191, 278, 248, 15);
		contentPane.add(idTheLoai);
		
		
		JLabel lblNewLabel_6 = new JLabel("Tên tác giả:");
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(39, 82, 107, 15);
		contentPane.add(lblNewLabel_6);
		
		idTTND = new JTextArea();
		idTTND.setBorder(new MatteBorder(0, 7, 7, 0, (Color) new Color(255, 255, 255)));
		idTTND.setLineWrap(true);
		idTTND.setWrapStyleWord(true);
		idTTND.setEditable(false);
		idTTND.setFont(new Font("Arial", Font.PLAIN, 15));
		idTTND.setForeground(new Color(0, 0, 128));
		JScrollPane tTNDScrollPane = new JScrollPane(idTTND);
		tTNDScrollPane.setBounds(191, 327, 248, 123);
		contentPane.add(tTNDScrollPane);
		
		JButton btnNewButton = new JButton("Thêm vào danh sach mượn");
		btnNewButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewQLNS.setTableChiTietMuon();;			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(39, 479, 277, 40);
// chinh kich thuoc icon
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/img/imgMenu/plus.png")); // Thay đổi đường dẫn tới ảnh của bạn
	    Image image = imageIcon.getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH); // Đặt kích thước và chế độ mượt
	    ImageIcon iconADD = new ImageIcon(image);
	    btnNewButton.setIcon(iconADD);
	    
//	    try {
//			BufferedImage bufferedImage = ImageIO.read(new File("F:\\download\\plus.png"));
//			btnNewButton.setIcon(new ImageIcon(bufferedImage));
//		} catch (IOException e) {
//			e.printStackTrace();
//		} // Thay đổi đường dẫn tới ảnh của bạn
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Thoát");

		btnNewButton_1.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1.setBounds(325, 479, 114, 40);
		ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("/img/imgMenu/no.png")); // Thay đổi đường dẫn tới ảnh của bạn
	    Image image2 = imageIcon2.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH); // Đặt kích thước và chế độ mượt
	    ImageIcon iconADD2 = new ImageIcon(image2);
	    btnNewButton_1.setIcon(iconADD2);
		contentPane.add(btnNewButton_1);
	}
}
