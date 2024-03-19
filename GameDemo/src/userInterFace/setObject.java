package userInterFace;

import java.awt.Graphics2D;

import objectInGame.obj_Key;
import objectInGame.obj_boots;
import objectInGame.obj_chest;
import objectInGame.obj_door;
import objectInGame.superObject;

public class setObject {
	GameJPane gameJPane;
	public setObject(GameJPane gameJPane) {
		this.gameJPane = gameJPane;
	}
	
	public void Setoject() {
		gameJPane.superObjects[0] = new obj_Key();
		gameJPane.superObjects[0].worldX = gameJPane.tileSize * 23;
		gameJPane.superObjects[0].worldY = gameJPane.tileSize * 7;
		
		gameJPane.superObjects[1] = new obj_Key();
		gameJPane.superObjects[1].worldX = gameJPane.tileSize * 11;
		gameJPane.superObjects[1].worldY = gameJPane.tileSize * 32;
		
		gameJPane.superObjects[2] = new obj_chest();
		gameJPane.superObjects[2].worldX = gameJPane.tileSize * 10;
		gameJPane.superObjects[2].worldY = gameJPane.tileSize * 8;
		
		gameJPane.superObjects[3] = new obj_door();
		gameJPane.superObjects[3].worldX = gameJPane.tileSize * 10;
		gameJPane.superObjects[3].worldY = gameJPane.tileSize * 12;
		
		gameJPane.superObjects[4] = new obj_boots();
		gameJPane.superObjects[4].worldX = gameJPane.tileSize * 36;
		gameJPane.superObjects[4].worldY = gameJPane.tileSize * 40;
	}
	
}
