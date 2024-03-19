package mouselistener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Controller_mouselistener implements MouseListener, MouseMotionListener {
	
	public View_mouselistener view_mouselistener;
	
	public Controller_mouselistener(View_mouselistener view_mouselistener) {
		this.view_mouselistener = view_mouselistener;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		view_mouselistener.click();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		view_mouselistener.enter();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		view_mouselistener.exit();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		view_mouselistener.update(x, y);


	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		view_mouselistener.update(x, y);
		
	}

}
