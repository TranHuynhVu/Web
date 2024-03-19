package Layout;


import java.awt.FlowLayout;
import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {

	public ViDu_FlowLayout() {
		this.setTitle("FlowLayput");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);// Căn giữa cữa sổ chương trình
		
		
		// set layout
		 FlowLayout fl = new FlowLayout();
		 FlowLayout fl_1 = new FlowLayout(FlowLayout.CENTER);
		 FlowLayout fl_2 = new FlowLayout(FlowLayout.CENTER, 50, 100);
		 
//		 this.setLayout(fl);
		 this.setLayout(fl_1);
//		 this.setLayout(fl_2);
		   
		 JButton jb_1 = new JButton("1");
		 JButton jb_2 = new JButton("2");
		 JButton jb_3 = new JButton("3");
		 
		 // add thành phần
		 this.add(jb_1);
		 this.add(jb_2);
		 this.add(jb_3);
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}
}
