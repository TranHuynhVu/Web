package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import objectInGame.obj_Key;
import objectInGame.obj_boots;
import userInterFace.CollisionCheck;
import userInterFace.DICHUYEN;
import userInterFace.GameJPane;

public class Player extends Entity{
	GameJPane gameJPane;
	DICHUYEN dichuyen;
	
	public final int screenX;
	public final int screenY;
	public int hasKey = 0;
	
	public Player(GameJPane gameJPane, DICHUYEN dichuyen) {
		this.gameJPane = gameJPane;
		this.dichuyen = dichuyen;
		
		screenX = gameJPane.screenWidth/2 - (gameJPane.tileSize/2);
		screenY = gameJPane.screenHeight/2 - (gameJPane.tileSize/2);
		
		readable = new Rectangle();
		readable.x = 10;
		readable.y = 18;
		readableDefaultX = 10;
		readableDefaultY = 18;
		readable.width = 28;
		readable.height = 30;
		
		SetDefaultValue();
		getImage();
	}
	
	public void getImage() {
		try {
			up1 = ImageIO.read(getClass().getResource("/Player2/up1.png"));
			up2 = ImageIO.read(getClass().getResource("/Player2/up2.png"));
			up3 = ImageIO.read(getClass().getResource("/Player2/up3.png"));
			up4 = ImageIO.read(getClass().getResource("/Player2/up4.png"));
			up5 = ImageIO.read(getClass().getResource("/Player2/up5.png"));
			
			down1 = ImageIO.read(getClass().getResource("/Player2/down1.png"));
			down2 = ImageIO.read(getClass().getResource("/Player2/down2.png"));
			down3 = ImageIO.read(getClass().getResource("/Player2/down3.png"));
			down4 = ImageIO.read(getClass().getResource("/Player2/down4.png"));
			down5 = ImageIO.read(getClass().getResource("/Player2/down5.png"));
			
			left1 = ImageIO.read(getClass().getResource("/Player2/left1.png"));
			left2 = ImageIO.read(getClass().getResource("/Player2/left2.png"));
			left3 = ImageIO.read(getClass().getResource("/Player2/left3.png"));
			left4 = ImageIO.read(getClass().getResource("/Player2/left4.png"));
			left5 = ImageIO.read(getClass().getResource("/Player2/left5.png"));
			
			right1 = ImageIO.read(getClass().getResource("/Player2/right1.png"));
			right2 = ImageIO.read(getClass().getResource("/Player2/right2.png"));
			right3 = ImageIO.read(getClass().getResource("/Player2/right3.png"));
			right4 = ImageIO.read(getClass().getResource("/Player2/right4.png"));
			right5 = ImageIO.read(getClass().getResource("/Player2/right5.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void SetDefaultValue() {
		worldX = gameJPane.tileSize * 23;
		worldY = gameJPane.tileSize * 21;
		speed = 4;
		direction = "down";
	}
	
	public void update() {
		if(dichuyen.up == true || dichuyen.down == true || dichuyen.left == true || dichuyen.right == true) {
			if(dichuyen.up == true) {
				direction = "up";
			}else if(dichuyen.down == true) {
				direction = "down";
			}else if(dichuyen.left == true) {
				direction = "left";
			}else if(dichuyen.right == true) {
				direction = "right";
			}
			
			collisionOn = false;
			gameJPane.collisionCheck.checkTile(this);
			int index = gameJPane.collisionCheck.check_Ocject(this,true);
			checkIndex(index);
			if(collisionOn == false) {
				switch (direction) {
				case "up": worldY -= speed;
							break;
				case "down":worldY += speed;
							break;
				case "left": worldX -= speed;
							break;
				case "right": worldX += speed;
							break;	
				}
			}
			
			imgCount++;
			if(imgCount > 10) {
				if(numberImg == 1) {
					numberImg = 2;
				}else if (numberImg == 2) {
					numberImg = 3;
				}else if (numberImg == 3) {
					numberImg = 4;
				}else if (numberImg == 4) {
					numberImg = 5;
				}else if (numberImg == 5) {
					numberImg = 1;
				}
				imgCount = 0;
			}
		}
	}
	public void checkIndex(int  index) {
		if(index != 999) {
			String name = gameJPane.superObjects[index].name;
			switch(name) {
			case "Key":	hasKey++;
						gameJPane.playSound(1);
						gameJPane.superObjects[index] = null;
						gameJPane.ui.showMess(new obj_Key());
						break;
			case "Chest":	if(hasKey > 0) {
								hasKey--;
								gameJPane.playSound(2);
								gameJPane.superObjects[index] = null;
								
							}
							break;
			case "door":	gameJPane.playSound(4);
							gameJPane.superObjects[index] = null;			
							break;
			case "boots":	speed += 1.5;
							gameJPane.playSound(3);
							gameJPane.superObjects[index] = null;
							gameJPane.ui.showMess(new obj_boots());
							break;
			}
		}
	}
	
	public void draw(Graphics2D g2) {
		BufferedImage imgBufferedImage = null;
		
		switch(direction) {
		case "up":	if(numberImg == 1) {
						imgBufferedImage = up1;
					}
					if(numberImg == 2) {
						imgBufferedImage = up2;
					}
					if(numberImg == 3) {
						imgBufferedImage = up3;
					}
					if(numberImg == 4) {
						imgBufferedImage = up4;
					}
					if(numberImg == 5) {
						imgBufferedImage = up5;
					}
					break;
		case "down":	if(numberImg == 1) {
							imgBufferedImage = down1;
						}
						if(numberImg == 2) {
							imgBufferedImage = down2;
						}
						if(numberImg == 3) {
							imgBufferedImage = down3;
						}
						if(numberImg == 4) {
							imgBufferedImage = down4;
						}
						if(numberImg == 5) {
							imgBufferedImage = down5;
						}
						break;
		case "left":	if(numberImg == 1) {
							imgBufferedImage = left1;
						}
						if(numberImg == 2) {
							imgBufferedImage = left2;
						}
						if(numberImg == 3) {
							imgBufferedImage = left3;
						}
						if(numberImg == 4) {
							imgBufferedImage = left4;
						}
						if(numberImg == 5) {
							imgBufferedImage = left5;
						}
						break;
		case "right":	if(numberImg == 1) {
							imgBufferedImage = right1;
						}
						if(numberImg == 2) {
							imgBufferedImage = right2;
						}
						if(numberImg == 3) {
							imgBufferedImage = right3;
						}
						if(numberImg == 4) {
							imgBufferedImage = right4;
						}
						if(numberImg == 5) {
							imgBufferedImage = right5;
						}
						break;
		}
		g2.drawImage(imgBufferedImage, screenX, screenY, gameJPane.tileSize, gameJPane.tileSize, null);
//		g2.setColor(Color.white);
//		g2.fillRect(x, y, gameJPane.tileSize, gameJPane.tileSize);
	}
}
