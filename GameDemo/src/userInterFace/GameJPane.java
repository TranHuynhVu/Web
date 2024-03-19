package userInterFace;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.zip.Inflater;

import javax.swing.JPanel;
import javax.swing.ToolTipManager;

import entity.Player;
import objectInGame.superObject;
import tile.TileMap;

public class GameJPane extends JPanel implements Runnable{
	
	// SCREEN SETTING
	final int originalTileSize = 16; // 16x16 kích thướt một ô 
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale; // 48x48 kích thướt mới của một ô
    public final int maxScreenCol = 16; // 16 columns
	public final int maxScreenRow = 12; // 12 row
	public final int screenWidth = tileSize * maxScreenCol; // chiều dài màn hình gameOject
	public final int screenHeight = tileSize * maxScreenRow; // chiều rộng màn hình gameOject
	
	Thread gameThread;
	DICHUYEN dichuyen = new DICHUYEN(this);
	
	public TileMap tileMap = new TileMap(this);
	public CollisionCheck collisionCheck = new CollisionCheck(this);
	public Player player = new Player(this, dichuyen);
	public superObject superObjects[] = new superObject[10];
	public setObject setObject = new setObject(this);
	public Sound sound = new Sound();
	public Sound soundSE = new Sound();
	public UI ui = new UI(this);
	// World Map
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	public final int worldWidth = maxWorldCol * tileSize;
	public final int worldHeight = maxWorldRow * tileSize;
	
	public int gameState;
	public int gamePlay = 1;
	public int gamePause = 2;
	
	final int FPS = 60; // 60 khung hình trên giây
	
	public GameJPane() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight)); // set kích thướt màn hình gameOject
		this.setBackground(Color.BLACK);
		this.addKeyListener(dichuyen);
		this.setFocusable(true); // sử lý các sự kiện focus như nhập vào từ bàn phím
		this.setDoubleBuffered(true); // giúp cải thiện về đồ họa
	}

	public void startThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	public void accsetGame() {
		setObject.Setoject();
		playSoundMain(0);
		gameState = gamePlay;
	}
	
	@Override
	public void run() {
		double drawInterval = 1000000000/FPS; // sau 0.0166s một khung hình sẽ được tạo
		double nextTime = System.nanoTime() + drawInterval; //thời gian vẻ một khung hình tiếp theo
		while(gameThread != null) {		
			// 1 UPDATE: Cập nhật lại thông tin ví dụ như vị trí nhân vật
			update();
			
			// 2 DRAW: Vẽ lên màn hình với thông tin đã cập nhật
			repaint();
			
			
			try {
				double timeSleep = nextTime - System.nanoTime(); 
				timeSleep = timeSleep / 1000000; // đổi đơn vị nano giây thành mili giây(vì hàm sleep là đơn vị mili giây)
				if(timeSleep < 0)
					timeSleep = 0;
				gameThread.sleep((long) timeSleep);
				
				nextTime += drawInterval;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void update() {
		if(gameState == gamePlay)
			player.update();
		if(gameState == gamePause) {
			
		}
			
	}					
				

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		tileMap.draw(g2);
		
		for(int i = 0; i < superObjects.length; i++) {
			if(superObjects[i] != null)
				superObjects[i].draw(this, g2);
		}
		
		player.draw(g2);
		
		ui.draw(g2);
	}

	public void playSoundMain(int i) {
		sound.setSound(i);
		sound.play();
		sound.loop();
	}

	public void playSound(int i) {
		soundSE.setSound(i);
		soundSE.play();
	}
	
	public void stopSound() {
		sound.stop();
	}
	
}
