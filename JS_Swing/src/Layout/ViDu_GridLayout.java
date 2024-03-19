package Layout;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {

	public ViDu_GridLayout() {
		this.setTitle("ViDu GridLayout");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null); // can giua
		
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_1 = new GridLayout(4,4);
		GridLayout gridLayout_2 = new GridLayout(4,4,10,10);
		this.setLayout(gridLayout_1);
		
		for (int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i+"");
			this.add(jButton);
			jButton.setBackground(Color.RED);		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_GridLayout();
	}
}
