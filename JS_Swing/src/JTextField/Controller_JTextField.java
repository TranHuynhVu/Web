package JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller_JTextField implements ActionListener{
	private View_JTextField view_JTextField;
	
	public Controller_JTextField( View_JTextField view_JTextField) {
		this.view_JTextField = view_JTextField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String ans = e.getActionCommand();
		
		switch(ans) {
		case "+": view_JTextField.plus_answer();;
				  break;
		case "-": view_JTextField.minus_answer();
				  break;
		case "*": view_JTextField.multiply_answer();
				  break;
		case "/": view_JTextField.division_answer();	  
		}
	}

}
