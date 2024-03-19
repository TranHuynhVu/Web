package Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_BoderLayout extends JFrame {
	
	public ViDu_BoderLayout() {
		this.setTitle("ViDu BorderLayout");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		
		BorderLayout bdLayout = new BorderLayout();
		BorderLayout bdLayout2 = new BorderLayout(15,15);
		this.setLayout(bdLayout2);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		
		this.add(btn1,BorderLayout.NORTH);
		this.add(btn2,BorderLayout.WEST);
		this.add(btn3,BorderLayout.CENTER);
		this.add(btn4,BorderLayout.SOUTH);
		this.add(btn5,BorderLayout.EAST);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ViDu_BoderLayout();
	}
}
