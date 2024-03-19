package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private View view;
	
	public Controller(View v) {
		this.view = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String vlString = e.getActionCommand();
		
		if(vlString.equals("UP"))
			view.UpVL();
		else if (vlString.equals("DOWN")) 
			view.DownVL();
		else if (vlString.equals("RESET")) 
			view.ResetVL();
		
		
	}

}
