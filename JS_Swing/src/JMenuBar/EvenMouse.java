package JMenuBar;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EvenMouse implements MouseListener{
	private View_JMenuBar view_JMenuBar;
	
	
	public EvenMouse(View_JMenuBar view_JMenuBar) {
		this.view_JMenuBar = view_JMenuBar;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON3) {
			view_JMenuBar.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
