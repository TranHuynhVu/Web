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
import java.awt.Image;
import java.awt.ScrollPane;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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

import dao.DAODanhMuc;
import dao.DAOSach;
import dao.DAOTheLoai;
import dao.DaoChiTietMuon;
import modol.ChiTietMuon;
import modol.DanhMuc;
import modol.Sach;
import modol.TheLoai;
import javax.swing.ScrollPaneConstants;
import java.awt.SystemColor;
import javax.swing.table.TableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import com.toedter.calendar.JDateChooser;

import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.ComponentOrientation;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.CaretEvent;

public class ViewQLNS extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private DefaultTableModel dfTable;
	public static ArrayList<Sach> arrSach;
	public static int indexTableRowClick = -1;
	public static int indexTableRowClickDanhSachMuon = -1;
	private static ViewXemChiTiet viewXemChiTiet;
	private JPanel idPanelTraCuu = new JPanel();
	private JTextField idTimKiem;
	public JTable table;
	private int indexFocus = 1;
	private JPanel idTraCuu;
	private JPanel idDanhSachMuon;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_4_1;
	private ArrayList<DanhMuc> arrDanhMuc;
	private JComboBox idcomboBoxDanhMuc;
	private JComboBox idcomboBoxTheLoai;
	private ArrayList<TheLoai> arrTheLoai;
	private String itemDanhMucSelect;
	private String itemTheLoaiSelect;
	private JTable idTableDanhSachMuon;
	private static DefaultTableModel dfTableDanhSachMuon;
	private JTextField textField;
	private JPanel idPanelDanhSachMuon;
	public ArrayList<Sach> arrChiTietMuon;
	private JDateChooser dateChooser;
	private JPanel idThongTinCaNhan;
	private static JLabel idSSM;
	private static ArrayList<Sach> arrsachMuon = new ArrayList<Sach>();
	public ViewQLNS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Quan Ly Nha Sach");
		setSize(1200,641);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		arrChiTietMuon = new ArrayList<Sach>();
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 153, 255));
		panel.setBounds(0, 0, 1190, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 100, 80);
		
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/img/imgMenu/logo(100x100).png")); // Thay đổi đường dẫn tới ảnh của bạn
	    Image image = imageIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH); // Đặt kích thước và chế độ mượt
	    ImageIcon iconADD = new ImageIcon(image);
	    lblNewLabel.setIcon(iconADD);
	    
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 255));
		panel_1.setForeground(SystemColor.desktop);
		panel_1.setBounds(120, 10, 936, 80);
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
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(153, 153, 153));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(1060, 35, 100, 39);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 0, 5, (Color) new Color(160, 160, 160)));
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(0, 98, 270, 515);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		idTraCuu = new JPanel();
		idTraCuu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idTraCuu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				indexFocus = 1;
				setFocusIndex(indexFocus);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				idTraCuu.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
			}
		});
		idTraCuu.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		idTraCuu.setBackground(SystemColor.controlShadow);
		idTraCuu.setBounds(0, 5, 265, 60);
		panel_2.add(idTraCuu);
		idTraCuu.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Tra cứu");
		lblNewLabel_1.setBounds(10, 0, 180, 60);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		idTraCuu.add(lblNewLabel_1);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_4.setBounds(200, 0, 55, 60);
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/icons8-find3-48.png")));
		idTraCuu.add(lblNewLabel_4);
		
		idDanhSachMuon = new JPanel();
		idDanhSachMuon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idDanhSachMuon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				indexFocus = 2;
				setFocusIndex(indexFocus);
			
	
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				idDanhSachMuon.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
			}
		});
		idDanhSachMuon.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		idDanhSachMuon.setBackground(SystemColor.scrollbar);
		idDanhSachMuon.setLayout(null);
		idDanhSachMuon.setBounds(0, 65, 265, 60);
		panel_2.add(idDanhSachMuon);
		
		lblNewLabel_1_1 = new JLabel("Danh sách mượn");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 0, 210, 60);
		idDanhSachMuon.add(lblNewLabel_1_1);
		
		lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_4_1.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/icons8-repository-48.png")));
		lblNewLabel_4_1.setBounds(200, 0, 55, 60);
		idDanhSachMuon.add(lblNewLabel_4_1);
		
		idThongTinCaNhan = new JPanel();
		idThongTinCaNhan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				indexFocus = 3;
				setFocusIndex(indexFocus);
			}
		});
		idThongTinCaNhan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idThongTinCaNhan.setLayout(null);
		idThongTinCaNhan.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		idThongTinCaNhan.setBackground(SystemColor.scrollbar);
		idThongTinCaNhan.setBounds(0, 445, 265, 60);
		panel_2.add(idThongTinCaNhan);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Thông tin cá nhân");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(10, 0, 210, 60);
		idThongTinCaNhan.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_4_1_1.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/icons8-user-48.png")));
		lblNewLabel_4_1_1.setBounds(200, 0, 55, 60);
		idThongTinCaNhan.add(lblNewLabel_4_1_1);
		idPanelTraCuu.setBorder(null);
		idPanelTraCuu.setBackground(new Color(255, 255, 102));
		
		idPanelTraCuu.setBounds(271, 98, 919, 506);
		idPanelTraCuu.setLayout(null);
		contentPane.add(idPanelTraCuu);
		
		JLabel lblNewLabel_5 = new JLabel("Tìm Kiếm");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_5.setBounds(40, 10, 88, 30);
		idPanelTraCuu.add(lblNewLabel_5);
		
		idTimKiem = new JTextField();
		idTimKiem.getDocument().addDocumentListener(new DocumentListener() {
			
			private String getTextTimKiem;

			@Override
			public void removeUpdate(DocumentEvent e) {
				 Document document = e.getDocument();
			        try {
			            // Lấy toàn bộ văn bản trong Document
			            getTextTimKiem = document.getText(0, document.getLength());
			            System.out.println("Full Text: " + getTextTimKiem);
			            
			            getDuLieuTimKiem(getTextTimKiem);

//			            // Lấy phần văn bản mới được chèn
//			            int offset = e.getOffset();
//			            int length = e.getLength();
//			            String insertedText = document.getText(offset, length);
//			            System.out.println("Inserted Text: " + insertedText);

			            // Thực hiện xử lý với dữ liệu chèn vào
			        } catch (Exception ex) {
			            ex.printStackTrace();
			        }
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				  Document document = e.getDocument();

			        try {
			            // Lấy toàn bộ văn bản trong Document
			            getTextTimKiem = document.getText(0, document.getLength());
			            System.out.println("Full Text: " + getTextTimKiem);
			            
			            getDuLieuTimKiem(getTextTimKiem);

//			            // Lấy phần văn bản mới được chèn
//			            int offset = e.getOffset();
//			            int length = e.getLength();
//			            String insertedText = document.getText(offset, length);
//			            System.out.println("Inserted Text: " + insertedText);

			            // Thực hiện xử lý với dữ liệu chèn vào
			        } catch (Exception ex) {
			            ex.printStackTrace();
			        }
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		idTimKiem.setColumns(10);
		idTimKiem.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		idTimKiem.setBounds(165, 10, 696, 30);
		idPanelTraCuu.add(idTimKiem);
		
		idcomboBoxDanhMuc = new JComboBox();
		idcomboBoxDanhMuc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idcomboBoxDanhMuc.setModel(new DefaultComboBoxModel(new String[] {"Danh mục"}));
		idcomboBoxDanhMuc.setFont(new Font("Arial", Font.BOLD, 12));
		idcomboBoxDanhMuc.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		idcomboBoxDanhMuc.setBackground(new Color(255, 255, 255));
		idcomboBoxDanhMuc.setBounds(165, 64, 328, 30);
		idcomboBoxDanhMuc.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				itemDanhMucSelect = String.valueOf(e.getItem());
				if(e.getStateChange() == ItemEvent.SELECTED) {
					DeleteTable(dfTable);					
					for (Sach sach : arrSach) {
						if(sach.getDanhMuc().equals(itemDanhMucSelect) && sach.getTheLoai().equals(itemTheLoaiSelect)) {
							String addSach[] = {sach.getMaSach(),sach.getTenSach(),sach.getTacGia(),sach.getNhaXB(),String.valueOf(sach.getNamXB()),sach.getDanhMuc(),sach.getTheLoai(),sach.getTTND()};
							dfTable.addRow(addSach);
						}
					}						
				}			
			}
		});
	
		idPanelTraCuu.add(idcomboBoxDanhMuc);
		
		idcomboBoxTheLoai = new JComboBox();
		idcomboBoxTheLoai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idcomboBoxTheLoai.setModel(new DefaultComboBoxModel(new String[] {"Thể loại"}));
		idcomboBoxTheLoai.setFont(new Font("Arial", Font.BOLD, 12));
		idcomboBoxTheLoai.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		idcomboBoxTheLoai.setBackground(new Color(255, 255, 255));
		idcomboBoxTheLoai.setBounds(521, 64, 197, 30);
		idPanelTraCuu.add(idcomboBoxTheLoai);
		idcomboBoxTheLoai.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				itemTheLoaiSelect = String.valueOf(e.getItem());
				if(e.getStateChange() == ItemEvent.SELECTED) {
					DeleteTable(dfTable);					
					for (Sach sach : arrSach) {
						if(sach.getDanhMuc().equals(itemDanhMucSelect) && sach.getTheLoai().equals(itemTheLoaiSelect)) {
							String addSach[] = {sach.getMaSach(),sach.getTenSach(),sach.getTacGia(),sach.getNhaXB(),String.valueOf(sach.getNamXB()),sach.getDanhMuc(),sach.getTheLoai(),sach.getTTND()};
							dfTable.addRow(addSach);
						}
					}						
				}			
			}
		});
		
		JButton idbtnLamMoi = new JButton("Làm mới");
		idbtnLamMoi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idbtnLamMoi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				idTimKiem.setText("");
				idcomboBoxDanhMuc.setSelectedIndex(0);
				idcomboBoxTheLoai.setSelectedIndex(0);
				DeleteTable(dfTable);
				getDfView();
			}
		});
		idbtnLamMoi.setBorder(UIManager.getBorder("Button.border"));
		idbtnLamMoi.setForeground(Color.BLACK);
		idbtnLamMoi.setFont(new Font("Arial", Font.BOLD, 12));
		idbtnLamMoi.setBackground(new Color(255, 255, 255));
		idbtnLamMoi.setBounds(747, 64, 114, 30);
		idPanelTraCuu.add(idbtnLamMoi);
		
		dfTable = new DefaultTableModel();
		String dfTableColumn[] = {"Mã sách","Tên sách","tác giả","Nhà xuất bản","Năm xuất bản","Danh mục","Thể loại","Tóm tắc nội dung"};
		
		for(int i = 0; i < dfTableColumn.length; i++) {
			dfTable.addColumn(dfTableColumn[i]);
		}
		
		table = new JTable(dfTable);
		table.setRowHeight(30);
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(0, 0, 890, 1);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(22, 141, 863, 288);
		idPanelTraCuu.add(scrollPane);
		
		JButton idXCT = new JButton();
		idXCT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idXCT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				indexTableRowClick = table.getSelectedRow();
				viewXemChiTiet = new ViewXemChiTiet();
				if(indexTableRowClick != -1) {
					 Sach sach = arrSach.get(indexTableRowClick);
				
					 viewXemChiTiet.idTensach.setText(sach.getTenSach());
					 viewXemChiTiet.idTenTacGia.setText(sach.getTacGia()); 
					 ((JLabel) viewXemChiTiet.idNhaXuatBan).setText(sach.getNhaXB());
					 viewXemChiTiet.idNamXuatBan.setText(String.valueOf(sach.getNamXB()));
					 viewXemChiTiet.idDanhMuc.setText(sach.getDanhMuc());
					 viewXemChiTiet.idTheLoai.setText(sach.getTheLoai());
					 viewXemChiTiet.idTTND.setText(sach.getTTND());
					
					 viewXemChiTiet.setVisible(true);
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				idXCT.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
			}
		});
		idXCT.setLayout(null);
		idXCT.setBackground(new Color(153, 153, 153));
		idXCT.setBounds(672, 433, 214, 50);
		idPanelTraCuu.add(idXCT);
		
		JLabel idXemChiTiet_1 = new JLabel("Xem chi tiết");
		idXemChiTiet_1.setBackground(Color.WHITE);
		idXemChiTiet_1.setHorizontalAlignment(SwingConstants.RIGHT);
		idXemChiTiet_1.setFont(new Font("Arial", Font.BOLD, 20));
		idXemChiTiet_1.setBounds(82, 0, 111, 50);
		idXCT.add(idXemChiTiet_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/book1(40x40).png")));
		lblNewLabel_7.setBounds(22, 3, 40, 47);
		idXCT.add(lblNewLabel_7);
		
		idPanelDanhSachMuon = new JPanel();
		idPanelDanhSachMuon.setBackground(new Color(255, 255, 102));
		idPanelDanhSachMuon.setBounds(271, 98, 919, 506);
		contentPane.add(idPanelDanhSachMuon);
		idPanelDanhSachMuon.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Thông tin sách được mượn");
//		ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("/img/imgMenu/graduate.gif")); // Thay đổi đường dẫn tới ảnh của bạn
//	    Image image2 = imageIcon2.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH); // Đặt kích thước và chế độ mượt
//	    ImageIcon iconADD2 = new ImageIcon(image2);
		lblNewLabel_6.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/icons8-storytelling-48.png")));
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_6.setBounds(10, 7, 414, 48);
		idPanelDanhSachMuon.add(lblNewLabel_6);
		
		
		dfTableDanhSachMuon = new DefaultTableModel();
		for(int i = 0; i < dfTableColumn.length; i++) {
			dfTableDanhSachMuon.addColumn(dfTableColumn[i]);
		}
		idTableDanhSachMuon = new JTable(dfTableDanhSachMuon);
		idTableDanhSachMuon.setFont(new Font("Arial", Font.PLAIN, 15));
	
		JScrollPane scrollPane_1 = new JScrollPane(idTableDanhSachMuon);
		scrollPane_1.setBounds(10, 79, 895, 211);
		idPanelDanhSachMuon.add(scrollPane_1);
		
		JLabel lblNewLabel_8 = new JLabel("Sách mượn: ");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_8.setBounds(52, 313, 98, 40);
		idPanelDanhSachMuon.add(lblNewLabel_8);
		
		JButton idbtnXoa = new JButton("Xóa");
		idbtnXoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idbtnXoa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				indexTableRowClickDanhSachMuon = idTableDanhSachMuon.getSelectedRow();
				if(arrsachMuon.size()> 0 && indexTableRowClickDanhSachMuon > -1) {			
					dfTableDanhSachMuon.removeRow(indexTableRowClickDanhSachMuon);
					arrsachMuon.remove(indexTableRowClickDanhSachMuon);
					JOptionPane.showMessageDialog(null, "Bạn đã xóa 1 sách",
														"Thành công",
														JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi!",
														"Lỗi",
														JOptionPane.ERROR_MESSAGE);
				}
				String i = String.valueOf(arrsachMuon.size()) ;
				idSSM.setText(i);
			}
		});
		idbtnXoa.setBackground(new Color(255, 204, 153));
		idbtnXoa.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		idbtnXoa.setHorizontalAlignment(SwingConstants.CENTER);
		idbtnXoa.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/icons8-trash-can-20.png")));
		idbtnXoa.setFont(new Font("Arial", Font.BOLD, 16));
		idbtnXoa.setBounds(777, 313, 92, 40);
		idPanelDanhSachMuon.add(idbtnXoa);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(153, 153, 153)));
		lblNewLabel_11.setBounds(0, 374, 919, 1);
		idPanelDanhSachMuon.add(lblNewLabel_11);
		
		JLabel lblNewLabel_10 = new JLabel("Chọn ngày hẹn trả:");
		lblNewLabel_10.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/icons8-schedule-48.png")));
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_10.setBounds(10, 417, 258, 40);
		idPanelDanhSachMuon.add(lblNewLabel_10);
		
//		textField = new JTextField();
//		textField.setFont(new Font("Arial", Font.BOLD, 20));
//		textField.setBounds(279, 423, 96, 28);
//		idPanelDanhSachMuon.add(textField);
//		textField.setColumns(10);
		
		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dateChooser.getCalendarButton().setFont(new Font("Arial", Font.BOLD, 10));
		dateChooser.setFont(new Font("Arial", Font.BOLD, 10));
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBounds(259, 423, 116, 28);
		idPanelDanhSachMuon.add(dateChooser);
		
		JButton btnNewButton_1 = new JButton("Xác nhận");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    java.util.Date utilDate = dateChooser.getDate();
			    indexTableRowClickDanhSachMuon = idTableDanhSachMuon.getSelectedRow();
			    if (utilDate == null) {
			    	if(indexTableRowClickDanhSachMuon < 0) {
			    		JOptionPane.showMessageDialog(null, "Vui lòng chọn sách", "Lỗi", JOptionPane.ERROR_MESSAGE); 		
			    	}else {
			    		 JOptionPane.showMessageDialog(null, "Lỗi nhập ngày", "Lỗi", JOptionPane.ERROR_MESSAGE);   
					}
			       
			    } else {
			        LocalDate NgayTra = utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); // ép ngày Date thành LocalDate
			        LocalDate NgayMuon = LocalDate.now();
			        if (ChronoUnit.DAYS.between(NgayMuon, NgayTra) > 0) {
			        	Sach sach = arrsachMuon.get(indexTableRowClickDanhSachMuon);
			        	ChiTietMuon chiTietMuon = new ChiTietMuon("2211505312", sach.getMaSach(), NgayMuon, NgayTra);
			        	if(DaoChiTietMuon.getDaoChiTietMuon().SelectById(chiTietMuon) == 1) {
			        		DaoChiTietMuon.getDaoChiTietMuon().Insert(chiTietMuon);
			        		dfTableDanhSachMuon.removeRow(indexTableRowClickDanhSachMuon);
			        		JOptionPane.showMessageDialog(null, "Mượn thành công","Success",JOptionPane.INFORMATION_MESSAGE);
			        	}else {
							JOptionPane.showMessageDialog(null, "Sách đã được mượn","Lỗi",JOptionPane.ERROR_MESSAGE);
						}
			        	
			        } else {
			        	JOptionPane.showMessageDialog(null, "Lỗi nhập ngày", "Lỗi", JOptionPane.ERROR_MESSAGE);
			        }
			    }
			}
		});
		btnNewButton_1.setBackground(new Color(255, 204, 204));
		btnNewButton_1.setIcon(new ImageIcon(getClass().getResource("/img/imgMenu/icons8-tick-32.png")));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1.setBounds(722, 417, 183, 34);
		idPanelDanhSachMuon.add(btnNewButton_1);
		
		idSSM = new JLabel("0");
		idSSM.setFont(new Font("Arial", Font.BOLD, 16));
		idSSM.setBounds(166, 313, 45, 40);
		idPanelDanhSachMuon.add(idSSM);
		
		setFocusIndex(indexFocus);
		getDfView();
		
	}
	
	public void setFocusIndex(int index) {
		if(index == 1) {
			idTraCuu.setBackground(SystemColor.controlShadow);
			idTraCuu.setBorder(new MatteBorder(1, 1, 0, 0, (Color) new Color(0, 0, 0)));	
			idPanelTraCuu.setVisible(true);
			
		}else {
			idTraCuu.setBackground(SystemColor.scrollbar);
			idTraCuu.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));	
			idPanelTraCuu.setVisible(false);
			
		}
		if(index == 2) {
			idDanhSachMuon.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
			idDanhSachMuon.setBackground(SystemColor.controlShadow);
			idPanelDanhSachMuon.setVisible(true);

		}else {
			idDanhSachMuon.setBackground(SystemColor.scrollbar);
			idDanhSachMuon.setBorder(new MatteBorder(1, 1, 1,1, (Color) new Color(0, 0, 0)));
			idPanelDanhSachMuon.setVisible(false);

		}
		if(index == 3) {
			idThongTinCaNhan.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
			idThongTinCaNhan.setBackground(SystemColor.controlShadow);
			
		}else {
			idThongTinCaNhan.setBackground(SystemColor.scrollbar);
			idThongTinCaNhan.setBorder(new MatteBorder(1, 1, 1,1, (Color) new Color(0, 0, 0)));
		
		}

	}
	
	public void DeleteTable(DefaultTableModel df) {
		while (df.getRowCount() > 0) {	
			df.removeRow(0);
		}
	}
	
	public void getDuLieuTimKiem(String tk) {
		DeleteTable(dfTable);
		
		for (Sach sach : arrSach) {
			if(sach.getTenSach().toLowerCase().contains(tk.trim().toLowerCase())) {
				String addSach[] = {sach.getMaSach(),sach.getTenSach(),sach.getTacGia(),sach.getNhaXB(),String.valueOf(sach.getNamXB()),sach.getDanhMuc(),sach.getTheLoai(),sach.getTTND()};
				dfTable.addRow(addSach);
			}
		}
	}
	
	public void getDfView() {

		arrDanhMuc = new ArrayList<DanhMuc>();
		arrDanhMuc = DAODanhMuc.getDaoDanhMuc().SelectAll();
		for (DanhMuc danhMuc : arrDanhMuc) {
			idcomboBoxDanhMuc.addItem(danhMuc.getTenDanhMuc());
		}
		
		arrTheLoai = new ArrayList<TheLoai>();
		arrTheLoai = DAOTheLoai.getDAOTheLoai().SelectAll();
		for (TheLoai theLoai : arrTheLoai) {
			idcomboBoxTheLoai.addItem(theLoai.getTenTheLoai());
		}
		arrSach = new ArrayList<Sach>();
		arrSach = DAOSach.getDaoSach().SelectAll();
		for (Sach sach : arrSach) {
			String addSach[] = {sach.getMaSach(),sach.getTenSach(),sach.getTacGia(),sach.getNhaXB(),String.valueOf(sach.getNamXB()),sach.getDanhMuc(),sach.getTheLoai(),sach.getTTND()};
			dfTable.addRow(addSach );
		}
	}
		
	
	public static void setTableChiTietMuon() {
		Sach sach = arrSach.get(indexTableRowClick);
		if(!CheckChiTietMuon(sach)) {
			arrsachMuon.add(sach);
			String addSach[] = {sach.getMaSach(),sach.getTenSach(),sach.getTacGia(),sach.getNhaXB(),String.valueOf(sach.getNamXB()),sach.getDanhMuc(),sach.getTheLoai(),sach.getTTND()};
			dfTableDanhSachMuon.addRow(addSach );

		}	
		String i = String.valueOf(arrsachMuon.size()) ;
		idSSM.setText(i);
	}
	
	public static void setArrChiTierMuon() {
	
	}
	
//	public void UpdateTableChiTietMuon() {
//		arrChiTietMuon = new ArrayList<ChiTietMuon>();
//		arrChiTietMuon = DaoChiTietMuon.getDaoChiTietMuon().SelectAll();
//		
//	}
	public static boolean CheckChiTietMuon(Sach sach) {
		boolean index = false;
		for (Sach Sach1 : arrsachMuon) {
			if(Sach1.getMaSach().equals(sach.getMaSach())) {
				JOptionPane.showMessageDialog(viewXemChiTiet, "Sách này đã có trong Danh sách mượn");
				index = true;
				break;
			}
		}
		if(index == false) {
	
			JOptionPane.showMessageDialog(viewXemChiTiet, "Thêm thành công");
		}
		return index;
	}
}
