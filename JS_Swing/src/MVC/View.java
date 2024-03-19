package MVC;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame {
	private Modol modol;
	private JButton upButton;
	private JButton downButton;
	private Label valueLabel;
	private JButton resetButton;

	public View(){
		modol = new Modol();
		this.init();
		this.setVisible(true);
	}
	
	public void  init() {
		this.setTitle("Counter");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Controller ctl = new Controller(this);
		
		upButton = new JButton("UP");
		upButton.addActionListener(ctl);
		
		downButton = new JButton("DOWN");
		downButton.addActionListener(ctl);
		
		resetButton = new JButton("RESET");
		resetButton.addActionListener(ctl);
		
		valueLabel = new Label(modol.getValue() + "", Label.CENTER);
		
		JPanel  jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout(5,5));
		jPanel.add(upButton, BorderLayout.WEST);
		jPanel.add(downButton, BorderLayout.EAST);
		jPanel.add(valueLabel, BorderLayout.CENTER);	
		jPanel.add(resetButton, BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	
	public void UpVL() {
		modol.UpValue();
		valueLabel.setText(modol.getValue() + "");
	}
	
	public void DownVL() {
		modol.DownValue();
		valueLabel.setText(modol.getValue() + "");
	}
	
	public void ResetVL() {
		modol.RessetValue();
		valueLabel.setText(modol.getValue() + "");
	}
	
}
