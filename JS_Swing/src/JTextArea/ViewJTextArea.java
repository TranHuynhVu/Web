package JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewJTextArea extends JFrame{
	private ModelJTextArea modelJTextArea;
	private JTextArea jTextArea;
	private JTextField jTextField;
	private JLabel ketquaJLabel;
	
	
	public ViewJTextArea() {
		modelJTextArea = new ModelJTextArea();
		init();
	}
	
	public void init() {
		this.setTitle("JTextArea");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 40);
		ControllerJTextArea controllerJTextArea = new ControllerJTextArea(this);
		
		JLabel vanbanJLabel = new JLabel("Văn bản");
		vanbanJLabel.setFont(font);
		
		jTextArea = new JTextArea(100, 100);
		jTextArea.setFont(font);
		
		//JScroll
		JScrollPane jScrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JLabel tukhoaJLabel = new JLabel("Từ khoá");
		tukhoaJLabel.setFont(font);
		
		jTextField = new JTextField(50);
		jTextField.setFont(font);
		
		JPanel centerJPanel = new JPanel();
		centerJPanel.setLayout(new GridLayout(4,1,20,20));
		centerJPanel.add(vanbanJLabel);
		centerJPanel.add(jScrollPane);
		centerJPanel.add(tukhoaJLabel);
		centerJPanel.add(jTextField);
		
		JButton thongkeButton = new JButton("Thống kê");
		thongkeButton.addActionListener(controllerJTextArea);
		thongkeButton.setFont(font);
		thongkeButton.setBackground(Color.BLACK);
		thongkeButton.setForeground(Color.WHITE);
		
		ketquaJLabel = new JLabel("Kết quả: ");
		ketquaJLabel.setFont(font);
		
		JPanel footerJPanel = new JPanel();
		footerJPanel.setLayout(new GridLayout(1,2,10,10));
		footerJPanel.add(thongkeButton);
		footerJPanel.add(ketquaJLabel);
		
		this.setLayout(new BorderLayout(10,10));
		this.add(centerJPanel, BorderLayout.CENTER);
		this.add(footerJPanel, BorderLayout.SOUTH);
		
		
		this.setVisible(true);
	}
	
	public void timkiemString() {
		String vanbanString = jTextArea.getText();
		String timkiemString = jTextField.getText();
		
		modelJTextArea.setVanBan(vanbanString);
		modelJTextArea.setTimKiem(timkiemString);
		
		ketquaJLabel.setText("Kết quả: "+modelJTextArea.timkiem());
	}
}
