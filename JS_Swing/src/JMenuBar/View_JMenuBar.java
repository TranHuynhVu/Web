package JMenuBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class View_JMenuBar extends JFrame{
	private JLabel JLabel_Text;
	public JPopupMenu jPopupMenu;
	private JToolBar jToolBar;

	public View_JMenuBar() {
		init();
	}
	
	public void init() {
		this.setTitle("JMenuBar");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout());
		Controller_JMenuBar controller_JMenuBar = new Controller_JMenuBar(this);
		
		// Tạo thanh Menu
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu jMenu_file = new JMenu("File");
		JMenuItem jMenuItem_new = new JMenuItem("New");
		jMenuItem_new.addActionListener(controller_JMenuBar);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));// đặt phím tắc cho New
		JMenuItem jMenuItem_openfile = new JMenuItem("Open File");
		jMenuItem_openfile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK)); // đặt phím tắc cho Open
		jMenuItem_openfile.addActionListener(controller_JMenuBar);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(controller_JMenuBar);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK)); // đặt phím tắc cho Exit
		
		jMenu_file.add(jMenuItem_new);
		jMenu_file.add(jMenuItem_openfile);
		jMenu_file.addSeparator();// Thêm dấu gạch dưới
		jMenu_file.add(jMenuItem_exit);
		
		
		JMenu jMenu_View = new JMenu("View");
		
		JCheckBoxMenuItem jCheckBoxMenuItem_OpenClose = new JCheckBoxMenuItem("Open/Close ToolBar");
		jMenu_View.add(jCheckBoxMenuItem_OpenClose);
		jCheckBoxMenuItem_OpenClose.addActionListener(controller_JMenuBar);
		
		
		
		JMenu jMenu_Edit = new JMenu("Edit");
		
		JMenuItem jMenuItem_cut = new JMenuItem("Cut");
		jMenuItem_cut.addActionListener(controller_JMenuBar);
		
		JMenuItem jMenuItem_copy = new JMenuItem("Copy");
		jMenuItem_copy.addActionListener(controller_JMenuBar);
		
		JMenu jMenu_delete = new JMenu("Delete");
		JMenuItem jMenuItem_delete_deleteAll = new JMenuItem("Delete All");
		jMenuItem_delete_deleteAll.addActionListener(controller_JMenuBar);
		JMenuItem jMenuItem_delete_all = new JMenuItem("All");
		jMenuItem_delete_all.addActionListener(controller_JMenuBar);
		
		jMenu_delete.add(jMenuItem_delete_deleteAll);
		jMenu_delete.add(jMenuItem_delete_all);
		
		jMenu_Edit.add(jMenuItem_cut);
		jMenu_Edit.add(jMenuItem_copy);
		jMenu_Edit.add(jMenu_delete);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_View);
		jMenuBar.add(jMenu_Edit);
		
		// Thêm thanh Menu vào chương trình
		this.setJMenuBar(jMenuBar);
		
		
		// Tạo thanh ToolBar ( Thanh công cụ )
		jToolBar = new JToolBar();
		jToolBar.add(new JButton("Copy"));
		jToolBar.add(new JButton("Cut"));
		JButton paste_jtButton = new JButton("Paste");
		jToolBar.add(paste_jtButton);
		paste_jtButton.setToolTipText("Hay nhan vao day");// Set ghi chú
		paste_jtButton.setBackground(Color.red);
		paste_jtButton.setForeground(Color.white);
		
		// Thêm toolBar và chương trình
		
		
		//Tạo thanh Menu khi kích chuột phải
		jPopupMenu = new JPopupMenu();
		
		JMenuItem jMenu_Copy = new JMenuItem("Copy");
		jMenu_Copy.addActionListener(controller_JMenuBar);
		
		JMenu jMenu_Past = new JMenu("Past");		
		JMenuItem jmaItem_Past_Past1 = new JMenuItem("Past1"); 
		jmaItem_Past_Past1.addActionListener(controller_JMenuBar);
		JMenuItem jmaItem_Past_Past2 = new JMenuItem("Past2"); 
		jmaItem_Past_Past2.addActionListener(controller_JMenuBar);
		
		JMenuItem jMenu_Delete = new JMenuItem("Delete");
		jMenu_Delete.addActionListener(controller_JMenuBar);
		
		jMenu_Past.add(jmaItem_Past_Past1);
		jMenu_Past.add(jmaItem_Past_Past2);
		
		jPopupMenu.add(jMenu_Copy);
		jPopupMenu.add(jMenu_Past);
		jPopupMenu.add(jMenu_Delete);
		
		//  Thêm Thanh menu khi kích chuột vào chương trình
		this.add(jPopupMenu);
		
		EvenMouse evenMouse = new EvenMouse(this);
		this.addMouseListener(evenMouse);
		
		JLabel_Text = new JLabel("...", JLabel.CENTER);
		JLabel_Text.setFont(new Font("Arial", Font.BOLD, 40));
		
		
		this.add(JLabel_Text, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void changeText(String text) {
		this.JLabel_Text.setText(text);
		this.refact();
	}
	
	public void insertToolBar() {
		this.add(jToolBar, BorderLayout.NORTH);
		this.refact();
	}
	
	public void removeToolBar() {
		this.remove(jToolBar);
	}
	
	public void refact() {
		this.pack();
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
	}
}