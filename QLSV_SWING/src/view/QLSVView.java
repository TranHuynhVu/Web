package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.UserDataHandler;
import org.w3c.dom.html.HTMLBodyElement;

import controller.QLSVControler;

import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class QLSVView extends JFrame {
	public QLSVModel qlsvModel;
	public QLSVControler qlsvControler;
	public JTextField msv_jTextField;
	public JTextField toan_jTextField;
	public JTextField hoTen_jTextField;
	public JTextField ly_jTextField;
	public JComboBox queQuan_JComboBox2;
	public JTextField hoa_jTextField;
	public JTextField ngaySinh_jTextField;
	public JTextField diemTb_jTextField;
	public ButtonGroup gioiTinh_ButtonGroup;
	private JTable table1_jTable;
	public JRadioButton nam_jRadioButton;
	public QLSVView() {
		qlsvControler = new QLSVControler(this);
		qlsvModel = new QLSVModel();
		this.setTitle("Quản Lý Sinh Viên");
		this.setSize(700,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		Font font_Arial = new Font("Arial", Font.BOLD, 18);
		this.setLayout(new BorderLayout(20,20));
		
//MenuBar			
		JMenuBar jMenuBar = new JMenuBar();
		jMenuBar.setFont(font_Arial);
		
		JMenu file_JMenu = new JMenu("File");
		JMenuItem open_jMenuItem = new JMenuItem("Open");
		JMenuItem close_jMenuItem = new JMenuItem("Close");
		JMenuItem exit_jMenuItem = new JMenuItem("Exit");
		
		file_JMenu.add(open_jMenuItem);
		file_JMenu.add(close_jMenuItem);
		file_JMenu.addSeparator();
		file_JMenu.add(exit_jMenuItem);
		
		JMenu about_jJMenu = new JMenu("About");
		JMenuItem aboutMe_jMenuItem = new JMenuItem("About me");
		about_jJMenu.add(aboutMe_jMenuItem);
		
		jMenuBar.add(file_JMenu);
		jMenuBar.add(about_jJMenu);
		
		this.setJMenuBar(jMenuBar);
		
//MenuBar	

//BoderLayout NORTH
//		FlowLayout headerFlowLayout = new FlowLayout();
//		headerFlowLayout.setHgap(20);
		
		JPanel header_JPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		header_JPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel queQuan_JLabel = new JLabel("Quê quán");
		queQuan_JLabel.setFont(font_Arial);
		JComboBox queQuan_JComboBox = new JComboBox();
		queQuan_JComboBox.setPreferredSize(new Dimension(180, 25));//set width  height cho JComboBox
		queQuan_JComboBox.addItem("");
		ArrayList<Tinh> arrTinhs = Tinh.getTinh();
		for (Tinh tinh : arrTinhs) {
			queQuan_JComboBox.addItem(tinh);
		}
		queQuan_JComboBox.setFont(font_Arial);
		
		JLabel msv_jLabel = new JLabel("Mã sinh viên");
		msv_jLabel.setFont(font_Arial);
		JTextArea msv_jTextArea = new JTextArea();
		msv_jTextArea.setPreferredSize(new Dimension(180, 25));// set width  height cho textArea
		msv_jTextArea.setFont(font_Arial);
		 
		JButton timKiem_jButton = new JButton("Tìm Kiếm");
		
		header_JPanel.add(queQuan_JLabel);
		header_JPanel.add(queQuan_JComboBox);	
		header_JPanel.add(msv_jLabel);
		header_JPanel.add(msv_jTextArea);
		header_JPanel.add(timKiem_jButton);
//BoderLayout NORTH
		
//BoderLayout CENTER
		JPanel center_JPanel = new JPanel(new GridLayout(2,1,10,10));
		
		//table 1
//		JPanel table1_jPanel = new JPanel();
		table1_jTable = new JTable();
		table1_jTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] {"Mã sinh viên","Họ tên","Quê quán","Ngày sinh","Giới tính","Điểm Toán","Điểm Lý","Điểm Hóa"}));
		JScrollPane table1_jScrollBar = new JScrollPane(table1_jTable);
		table1_jScrollBar.setBorder(new TitledBorder(null, "Danh sách học sinh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
//		table1_jPanel.add(table1_jScrollBar);
		//table 2

		JPanel table2_jPanel = new JPanel(new GridLayout(5,4,5,5));
		table2_jPanel.setBorder(new TitledBorder(null, "Thông tin thí sinh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel msv_jLabel2 = new JLabel("Mã sinh viên");
		msv_jTextField = new JTextField();
		
		JLabel toan_jLabel = new JLabel("Toán");
		toan_jTextField = new JTextField();
		
		JLabel hoTen_jLabel = new JLabel("Họ tên");
		hoTen_jTextField = new JTextField();
		
		JLabel ly_jLabel = new JLabel("Lý");
		ly_jTextField = new JTextField();
		
		JLabel queQuan_jLabel = new JLabel("Quê quán");
		queQuan_JComboBox2 = new JComboBox();
		queQuan_JComboBox2.addItem("");
		queQuan_JComboBox2.setPreferredSize(new Dimension(180, 25));//set width  height cho JComboBox
		for (Tinh tinh : arrTinhs) {
			queQuan_JComboBox2.addItem(tinh);
		}
		
		JLabel hoa_jLabel = new JLabel("Hóa");
		hoa_jTextField = new JTextField();
		
		JLabel ngaySinh_jLabel = new JLabel("Ngày sinh");
		ngaySinh_jTextField = new JTextField();
		
		JLabel diemTb_jLabel = new JLabel("Điểm trung bình");
		diemTb_jTextField = new JTextField();
		
		JLabel gioiTinh_jLabel = new JLabel("Giới tính");
		
		nam_jRadioButton = new JRadioButton("Nam");
		nam_jRadioButton.setSelected(true);
		JRadioButton nu_jRadioButton = new JRadioButton("Nữ");
		
		gioiTinh_ButtonGroup = new ButtonGroup();
		gioiTinh_ButtonGroup.add(nam_jRadioButton);
		gioiTinh_ButtonGroup.add(nu_jRadioButton);
		
		JLabel null_jLabel = new JLabel();
		
		table2_jPanel.add(msv_jLabel2);
		table2_jPanel.add(msv_jTextField);
		table2_jPanel.add(toan_jLabel);
		table2_jPanel.add(toan_jTextField);
		table2_jPanel.add(hoTen_jLabel);
		table2_jPanel.add(hoTen_jTextField);
		table2_jPanel.add(ly_jLabel);
		table2_jPanel.add(ly_jTextField);
		table2_jPanel.add(queQuan_jLabel);
		table2_jPanel.add(queQuan_JComboBox2);
		table2_jPanel.add(hoa_jLabel);
		table2_jPanel.add(hoa_jTextField);
		table2_jPanel.add(ngaySinh_jLabel);
		table2_jPanel.add(ngaySinh_jTextField);
		table2_jPanel.add(diemTb_jLabel);
		table2_jPanel.add(diemTb_jTextField);
		table2_jPanel.add(gioiTinh_jLabel);
		table2_jPanel.add(nam_jRadioButton);
		table2_jPanel.add(nu_jRadioButton);
		table2_jPanel.add(null_jLabel);
			
		
		center_JPanel.add(table1_jScrollBar);
		center_JPanel.add(table2_jPanel);

//BoderLayout CENTER
		
//BoderLayout SOUTH
		
		FlowLayout SOUTH_FlowLayout = new FlowLayout();
		SOUTH_FlowLayout.setHgap(60);
		JPanel SOUTH_JPanel = new JPanel();
		SOUTH_JPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		SOUTH_JPanel.setLayout(SOUTH_FlowLayout);
		
		JButton insert_jButton = new JButton("Insert");
		insert_jButton.addActionListener(qlsvControler);
		
		JButton delete_jButton = new JButton("Delete");
		delete_jButton.addActionListener(qlsvControler);
		
		JButton edit_jButton = new JButton("Edit");
		edit_jButton.addActionListener(qlsvControler);
		
		JButton ok_jButton = new JButton("OK");
		ok_jButton.addActionListener(qlsvControler);
		
		JButton cancel_jButton = new JButton("Cancel");
		cancel_jButton.addActionListener(qlsvControler);
		
		SOUTH_JPanel.add(insert_jButton);
		SOUTH_JPanel.add(delete_jButton);
		SOUTH_JPanel.add(edit_jButton);
		SOUTH_JPanel.add(ok_jButton);
		SOUTH_JPanel.add(cancel_jButton);
		
//BoderLayout SOUTH
		
		this.add(center_JPanel,BorderLayout.CENTER);
		this.add(header_JPanel,BorderLayout.NORTH);
		this.add(SOUTH_JPanel,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void resetForm2() {
		msv_jTextField.setText("");
		hoTen_jTextField.setText("");
		toan_jTextField.setText("");
		ly_jTextField.setText("");
		hoa_jTextField.setText("");
		ngaySinh_jTextField.setText("");
		diemTb_jTextField.setText("");
		queQuan_JComboBox2.setSelectedIndex(-1);
		gioiTinh_ButtonGroup.clearSelection();
	}
	
	public void insert(ThiSinh ts) {
		qlsvModel.insert(ts);
		
		DefaultTableModel tableModol = (DefaultTableModel)table1_jTable.getModel();
		tableModol.addRow(new Object[] {ts.getMaThiSinh()+"",ts.getTenThiSinh()+"", ts.getQueQuan()+"", 
										ts.getNgaySinh().getDate()+"/"+(ts.getNgaySinh().getMonth()+1)+"/"+(ts.getNgaySinh().getYear()+1900),
										(ts.isGioiTinh()?"Nam":"Nữ"), ts.getDiem1()+"", ts.getDiem2()+"", ts.getDiem3()+""});
	}

	
}
