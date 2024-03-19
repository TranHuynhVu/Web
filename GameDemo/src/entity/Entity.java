package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entity {
	public int worldX,worldY;
	public int speed;
	
	// Lưu trữ các hình ảnh
	public BufferedImage up1,up2,up3,up4,up5,down1,down2,down3,down4,down5,left1,left2,left3,left4,left5,right1,right2,right3,right4,right5;
	public String direction;
	
	// animation player
	public int imgCount = 0;
	public int numberImg = 1;
	
	public Rectangle readable;
	public int readableDefaultX,readableDefaultY;
	public boolean collisionOn = false;
}
