package mouselistener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View_mouselistener extends JFrame {
	private Model_mouselistener model_mouselistener;
	private JLabel xJLabel;
	private JLabel yJLabel;
	private JLabel clickJLabel;
	private JLabel ktmouseJLabel;
	private JPanel centerJPanel;
	
	public View_mouselistener() {
		this.model_mouselistener = new Model_mouselistener();
		init();
	}
	
	public void init() {
		this.setTitle("MouseListener");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
//		Controller_mouselistener controller_mouselistener = new Controller_mouselistener(this);
		MouseListener mouseListener = new Controller_mouselistener(this); 
		MouseMotionListener mouseMotionListener = new Controller_mouselistener(this); // Lắng nghe chuyển động của chuột
		
		centerJPanel = new JPanel();
		centerJPanel.setBackground(Color.GRAY);
		centerJPanel.addMouseMotionListener(mouseMotionListener);
		centerJPanel.addMouseListener(mouseListener);
		
		
		
		JPanel footerJPanel = new JPanel();
		footerJPanel.setLayout(new GridLayout(3,3));
		
		JLabel positionJLabel = new JLabel("Position:");
		xJLabel = new JLabel("x = ");
		yJLabel = new JLabel("y = ");
		JLabel numberJLabel = new JLabel("number of clicks: ");
		clickJLabel = new JLabel("");
		JLabel clone1JLabel = new JLabel();
		JLabel mouseJLabel = new JLabel("mouse is in component: ");
		ktmouseJLabel = new JLabel("");
		JLabel clone2jJLabel = new JLabel();		
		
		footerJPanel.add(positionJLabel);
		footerJPanel.add(xJLabel);
		footerJPanel.add(yJLabel);
		footerJPanel.add(numberJLabel);
		footerJPanel.add(clickJLabel);
		footerJPanel.add(clone1JLabel);
		footerJPanel.add(mouseJLabel);
		footerJPanel.add(ktmouseJLabel);
		footerJPanel.add(clone2jJLabel);
		
		this.setLayout(new BorderLayout());
		this.add(centerJPanel, BorderLayout.CENTER);
		this.add(footerJPanel, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	

	public void click() {
		model_mouselistener.click();
		this.clickJLabel.setText(model_mouselistener.getCount()+"");

	}
	
	public void enter() {
		model_mouselistener.enter();
		this.ktmouseJLabel.setText(model_mouselistener.getKtMouse()+"");

	}
	
	public void exit() {
		model_mouselistener.exit();
		this.ktmouseJLabel.setText(model_mouselistener.getKtMouse()+"");
	}
	
	public void update(int x, int y) {
		model_mouselistener.setX(x);
		model_mouselistener.setY(y);
		xJLabel.setText("x = "+model_mouselistener.getX());
		yJLabel.setText("y = "+model_mouselistener.getY());
	}
	
}
