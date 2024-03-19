package userInterFace;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DICHUYEN implements KeyListener{
	public boolean up,down,left,right;
	public GameJPane gameJPane;
	public DICHUYEN(GameJPane gameJPane) {
		this.gameJPane = gameJPane;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_W) {
			up = true;
		}
		if(key == KeyEvent.VK_S) {
			down = true;
		}
		if(key == KeyEvent.VK_A) {
			left = true;
		}
		if(key == KeyEvent.VK_D) {
			right = true;
		}
		if(key == KeyEvent.VK_P) {
			if(gameJPane.gameState == gameJPane.gamePlay)
				gameJPane.gameState = gameJPane.gamePause;
			else if(gameJPane.gameState == gameJPane.gamePause)
					gameJPane.gameState = gameJPane.gamePlay;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_W) {
			up = false;
		}
		if(key == KeyEvent.VK_S) {
			down = false;
		}
		if(key == KeyEvent.VK_A) {
			left = false;
		}
		if(key == KeyEvent.VK_D) {
			right = false;
		}
		
	}

}
