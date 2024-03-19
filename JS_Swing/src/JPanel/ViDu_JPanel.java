package JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.geom.IllegalPathStateException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViDu_JPanel extends JFrame{
	
	public ViDu_JPanel() {
		this.setTitle("JPanel");
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JTextField jTextField = new JTextField(100);
		JPanel textJPanel = new JPanel();
		textJPanel.setLayout(new BorderLayout());
		textJPanel.add(jTextField, BorderLayout.CENTER);
		
		
		JButton jButton_0 = new JButton("0");
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8 = new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_bang = new JButton("=");
		
		JPanel jbuttonJPanel = new JPanel();
		jbuttonJPanel.setLayout(new GridLayout(5,3));
		jbuttonJPanel.add(jButton_0);
		jbuttonJPanel.add(jButton_1);
		jbuttonJPanel.add(jButton_2);
		jbuttonJPanel.add(jButton_3);
		jbuttonJPanel.add(jButton_4);
		jbuttonJPanel.add(jButton_5);
		jbuttonJPanel.add(jButton_6);
		jbuttonJPanel.add(jButton_7);
		jbuttonJPanel.add(jButton_8);
		jbuttonJPanel.add(jButton_9);
		jbuttonJPanel.add(jButton_nhan);
		jbuttonJPanel.add(jButton_chia);
		jbuttonJPanel.add(jButton_cong);
		jbuttonJPanel.add(jButton_tru);
		jbuttonJPanel.add(jButton_bang);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(textJPanel, BorderLayout.NORTH);
		this.add(jbuttonJPanel, BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_JPanel();
	}
}
