package JMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JMenu;

public class Controller_JMenuBar implements ActionListener{
	private View_JMenuBar view_JMenuBar;
	
	public Controller_JMenuBar(View_JMenuBar view_JMenuBar) {
		this.view_JMenuBar = view_JMenuBar;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String srcString = e.getActionCommand();// ép sự kiện sang  chuổi
		AbstractButton evenButton = (AbstractButton) e.getSource(); // ép sự kiện thành button
		
		if(srcString.equals("Exit")) {
			System.exit(0);
		}else if(srcString.equals("Open/Close ToolBar")) {
			Boolean checkBoolean = evenButton.getModel().isSelected();
			if(checkBoolean)
				view_JMenuBar.insertToolBar();
			else {
				view_JMenuBar.removeToolBar();			}
		}else{
			view_JMenuBar.changeText("Bạn đã ấn: "+srcString);
		}
		
		
	}
	
}
