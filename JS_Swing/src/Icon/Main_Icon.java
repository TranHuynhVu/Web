package Icon;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.MenuBar;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main_Icon extends JFrame{
	
	public Main_Icon() {
		this.setTitle("Icon");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu newjMenu = new JMenu("New");
		newjMenu.setFont(new Font("Arial", Font.BOLD, 24));
		// set icon
		newjMenu.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(Main_Icon.class.getResource("icon_new.png"))));
		JMenu saveJMenu = new JMenu("Save");
		saveJMenu.setFont(new Font("Arial", Font.BOLD, 24));
		saveJMenu.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(Main_Icon.class.getResource("icon_new.png"))));
		JMenu dowloadjMenu = new JMenu("Dowload");
		dowloadjMenu.setFont(new Font("Arial", Font.BOLD, 24));
		dowloadjMenu.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(Main_Icon.class.getResource("icon_new.png"))));
		JMenuItem openfilejJMenuItem = new JMenuItem("Open File");
		JMenuItem printJMenuItem = new JMenuItem("Print");
		
		newjMenu.add(openfilejJMenuItem);
		newjMenu.add(printJMenuItem);
		menuBar.add(newjMenu);
		menuBar.add(saveJMenu);
		menuBar.add(dowloadjMenu);
		
		
		
		this.setJMenuBar(menuBar);
		
		JButton clickJButton = new JButton("Click me!");
		clickJButton.setFont(new Font("Arial", Font.BOLD, 20));
		
		this.add(clickJButton, BorderLayout.SOUTH);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main_Icon();
	}
}