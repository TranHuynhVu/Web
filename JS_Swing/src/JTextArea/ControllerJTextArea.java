package JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerJTextArea implements ActionListener {
	private ViewJTextArea viewJTextArea;
	
	public ControllerJTextArea(ViewJTextArea viewJTextArea) {
		this.viewJTextArea = viewJTextArea;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String valueString = e.getActionCommand();
		
		if(valueString.equals("Thống kê")) {
			viewJTextArea.timkiemString();
		}

	}
}
