package JTextField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View_JTextField extends JFrame{
	private Model_JTextField model_JTextField;
	private JTextField jTextField_answer;
	private JTextField jTextField_firstValue;
	private JTextField jTextField_secondValue;
	
	public View_JTextField() {
		model_JTextField = new Model_JTextField();
		init();
	}
	
	public void init() {
		this.setTitle("JTextField");
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial", Font.BOLD, 30);
		Controller_JTextField controller_JTextField = new Controller_JTextField(this);
		
		JLabel jLabel_firstValue = new JLabel("First Value");
		jLabel_firstValue.setFont(font);
		
		JLabel jLabel_secondValue= new JLabel("Second Value");
		jLabel_secondValue.setFont(font);
		
		JLabel jLabel_answer = new JLabel("Answer");
		jLabel_answer.setFont(font);
		
		jTextField_firstValue = new JTextField(20);
		jTextField_firstValue.setFont(font);
		
		jTextField_secondValue = new JTextField(20);
		jTextField_secondValue.setFont(font);
		
		jTextField_answer = new JTextField(20);
		jTextField_answer.setFont(font);
		
		JPanel jPanel_1 = new JPanel();
		jPanel_1.setLayout(new GridLayout(3,2,20,20));
		jPanel_1.add(jLabel_firstValue);
		jPanel_1.add(jTextField_firstValue);
		jPanel_1.add(jLabel_secondValue);
		jPanel_1.add(jTextField_secondValue);
		jPanel_1.add(jLabel_answer);
		jPanel_1.add(jTextField_answer);
		
		JPanel  jPanel_2 = new JPanel();
		jPanel_2.setLayout(new GridLayout(2,2,10,10));
		
		JButton plusJButton = new JButton("+");
		plusJButton.setFont(font);
		plusJButton.addActionListener(controller_JTextField);
		
		JButton minusJButton = new JButton("-");
		minusJButton.setFont(font);
		minusJButton.addActionListener(controller_JTextField);
		
		JButton multiplyJButton = new JButton("*");
		multiplyJButton.setFont(font);
		multiplyJButton.addActionListener(controller_JTextField);
		
		JButton divisionJButton = new JButton("/");
		divisionJButton.setFont(font);
		divisionJButton.addActionListener(controller_JTextField);
		
		jPanel_2.add(plusJButton);
		jPanel_2.add(minusJButton);
		jPanel_2.add(multiplyJButton);
		jPanel_2.add(divisionJButton);
		
		this.setLayout(new BorderLayout(10,10));
		this.add(jPanel_1, BorderLayout.CENTER);
		this.add(jPanel_2, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void plus_answer() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		model_JTextField.setFirstValue(firstValue);
		model_JTextField.setSecondValue(secondValue);
		model_JTextField.plus();
		jTextField_answer.setText(model_JTextField.getAnswer()+"");
	}
	public void minus_answer() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		model_JTextField.setFirstValue(firstValue);
		model_JTextField.setSecondValue(secondValue);
		model_JTextField.minus();
		jTextField_answer.setText(model_JTextField.getAnswer()+"");
	}
	public void multiply_answer() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		model_JTextField.setFirstValue(firstValue);
		model_JTextField.setSecondValue(secondValue);
		model_JTextField.multiply();
		jTextField_answer.setText(model_JTextField.getAnswer()+"");
	}
	public void division_answer() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		model_JTextField.setFirstValue(firstValue);
		model_JTextField.setSecondValue(secondValue);
		model_JTextField.division();
		jTextField_answer.setText(model_JTextField.getAnswer()+"");
	}
}
