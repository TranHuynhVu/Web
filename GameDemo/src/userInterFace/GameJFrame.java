package userInterFace;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class GameJFrame extends JFrame{
	private GameJPane gameJPane;
	public GameJFrame() {
		this.setTitle("Mega Man");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // Tắc khả năng thay đổi kích thước của JFrame
	
		gameJPane = new GameJPane();
		this.add(gameJPane);	
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		gameJPane.accsetGame();
		gameJPane.startThread();
		
	}
	
	public static void main(String[] args) {
		new GameJFrame();
	}
}
