package Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller_Color implements ActionListener{
	private View view;
	
	public Controller_Color(View view) {
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String colorValue = e.getActionCommand();
		
		switch(colorValue) {
			case "DO": view.setColor_DO();break;
						
			case "VANG": view.setColor_VANG();break;
			case "XANH": view.setColor_XANH();break;
			case "BG_DO": view.setColor_BGDO();break;
			case "BG_VANG": view.setColor_BGVANG();break;
			case "BG_XANH": view.setColor_BGXANH();break;
		}
	
	}
	
}
