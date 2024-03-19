package Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private View view;

	
	public Controller(View view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String getVL = e.getActionCommand();
		
		if(getVL.equals("1"))
			view.changeVL_1();
		else if (getVL.equals("2")) {
			view.changeVL_2();
		}else if (getVL.equals("3")) {
			view.changeVL_3();
		}else {
			view.changeVL_4();
		}
		
	}
	
	
}
