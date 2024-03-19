package userInterFace;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;

import objectInGame.obj_Key;
import objectInGame.superObject;

public class UI {
	GameJPane gameJPane;
	Font font; 
	BufferedImage imgKey;
	BufferedImage messengerImg;
	boolean messengerImgOn = false;
	int countImg = 0;
	public Graphics2D g2;
	
	public UI(GameJPane gameJPane) {
		this.gameJPane = gameJPane;
		
		font = new Font("Arial",Font.PLAIN,80);
		
		obj_Key key = new obj_Key();
		imgKey = key.img;
	}
	
	public void showMess(superObject obj) {
		this.messengerImg = obj.img;
		this.messengerImgOn = true;
	}
	
	public void draw(Graphics2D g2) {
		/*
		g2.setFont(font);
		g2.drawImage(imgKey, gameJPane.tileSize/2, gameJPane.tileSize/2, gameJPane.tileSize,gameJPane.tileSize,null);
		g2.setColor(Color.white);
		g2.drawString("x"+gameJPane.player.hasKey, 74, 65);
		
		if(messengerImgOn == true) {
			g2.drawImage(messengerImg, gameJPane.tileSize/2, gameJPane.tileSize*5, gameJPane.tileSize, gameJPane.tileSize,null);
			countImg++;
		}
		if(countImg > 180) {
			messengerImgOn = false;
			countImg = 0;
		}
		*/
		this.g2 = g2;
		g2.setFont(font);
		g2.setColor(Color.WHITE);
		
		if(gameJPane.gameState == gameJPane.gamePlay) {
			
		}
		if(gameJPane.gameState == gameJPane.gamePause) {
			drawGamePause();
		}
	}
	
	public void drawGamePause() {
		String text = "Pause";
		int lengh = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();// lấy độ dài pixel của chuỗi text
		int y = gameJPane.screenHeight/2;
		int x = gameJPane.screenWidth/2 - lengh/2;
		
		g2.drawString(text, x, y);
		
	}
}
