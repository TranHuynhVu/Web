package objectInGame;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;

import userInterFace.GameJPane;

public class superObject {
	public BufferedImage img;
	public String name;
	public int worldX;
	public int worldY;
	public Rectangle rectangle = new Rectangle(0, 0, 48, 48);
	public int rectangleXDefaultX = 0;
	public int rectangleYDefaultY = 0;
	public boolean collision = false;
	
	public void draw(GameJPane gp, Graphics2D g2) {
		int screenX = worldX - (gp.player.worldX - gp.player.screenX);
		int screenY = worldY - (gp.player.worldY - gp.player.screenY);
		if(worldX > gp.player.worldX - gp.player.screenX - gp.tileSize && 
		   worldX < gp.player.worldX + gp.player.screenX + gp.tileSize &&
		   worldY > gp.player.worldY - gp.player.screenY - gp.tileSize &&
		   worldY < gp.player.worldY + gp.player.screenY + gp.tileSize) {
			
			g2.drawImage(img, screenX, screenY, gp.tileSize, gp.tileSize, null);
		}
	}
}
