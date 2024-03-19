package userInterFace;

import entity.Entity;
import objectInGame.superObject;
import tile.TileMap;

public class CollisionCheck {
	GameJPane gameJPane;
	public CollisionCheck(GameJPane gameJPane) {
		this.gameJPane = gameJPane;
	}
	
	public int check_Ocject(Entity entity , boolean player) {
		int index = 999;
		for(int i = 0; i < gameJPane.superObjects.length; i++) {
			if(gameJPane.superObjects[i] != null) {
				
				entity.readable.x = entity.worldX + entity.readable.x;
				entity.readable.y = entity.worldY + entity.readable.y;
				
				gameJPane.superObjects[i].rectangle.x = gameJPane.superObjects[i].worldX + gameJPane.superObjects[i].rectangle.x;
				gameJPane.superObjects[i].rectangle.y = gameJPane.superObjects[i].worldY + gameJPane.superObjects[i].rectangle.y;
				
				switch(entity.direction) {
				case "up":	entity.readable.y -= entity.speed;
							if(entity.readable.intersects(gameJPane.superObjects[i].rectangle)) {
								if(gameJPane.superObjects[i].collision == true) {
									entity.collisionOn = true;
								}
								if(player == true) {
									index = i;
								}
							}
							break;
				case "down":	entity.readable.y += entity.speed;
								if(entity.readable.intersects(gameJPane.superObjects[i].rectangle)) {
									if(gameJPane.superObjects[i].collision == true) {
										entity.collisionOn = true;
									}
									if(player == true) {
										index = i;
									}
								}
								break;
				case "left":	entity.readable.x -= entity.speed;
								if(entity.readable.intersects(gameJPane.superObjects[i].rectangle)) {
									if(gameJPane.superObjects[i].collision == true) {
										entity.collisionOn = true;
									}
									if(player == true) {
										index = i;
									}
								}
								break;
				case "right":	entity.readable.x += entity.speed;
								if(entity.readable.intersects(gameJPane.superObjects[i].rectangle)) {
									if(gameJPane.superObjects[i].collision == true) {
										entity.collisionOn = true;
									}
									if(player == true) {
										index = i;
									}
								}
								break;
				}
				entity.readable.x = entity.readableDefaultX ;
				entity.readable.y = entity.readableDefaultY ;
				
				gameJPane.superObjects[i].rectangle.x = gameJPane.superObjects[i].rectangleXDefaultX;
				gameJPane.superObjects[i].rectangle.y = gameJPane.superObjects[i].rectangleYDefaultY;
			}
			
		}
		return index;
	}
	public void checkTile(Entity entity) {
		
		int entityLeftWorldX = entity.worldX + entity.readable.x;
		int entityRightWorldX = entity.worldX + entity.readable.x + entity.readable.width;
		int entityTopWorldY = entity.worldY + entity.readable.y;	
		int entityBottomWorldY = entity.worldY + entity.readable.y + entity.readable.height;
		
		int entityLeftCol = entityLeftWorldX/gameJPane.tileSize;
		int entitRightCol = entityRightWorldX/gameJPane.tileSize;
		int entityTopRow = entityTopWorldY/gameJPane.tileSize;
		int entityBottomRow = entityBottomWorldY/gameJPane.tileSize;
		
		int number1, number2;
		
		switch(entity.direction) {
		case "up":	entityTopRow = (entityTopWorldY - entity.speed)/gameJPane.tileSize;
					number1 = gameJPane.tileMap.mapDemo[entityTopRow][entityLeftCol];
					number2 = gameJPane.tileMap.mapDemo[entityTopRow][entitRightCol];
					if(gameJPane.tileMap.tiles[number1].collision == true || gameJPane.tileMap.tiles[number2].collision == true) {
						if(gameJPane.tileMap.tiles[number1].collision == true )
							gameJPane.player.worldX += 4;
						if(gameJPane.tileMap.tiles[number2].collision == true )
								gameJPane.player.worldX -= 4;
						entity.collisionOn = true;		
					}
					break;
		case "down":	entityBottomRow = (entityBottomWorldY + entity.speed)/gameJPane.tileSize;
						number1 = gameJPane.tileMap.mapDemo[entityBottomRow][entityLeftCol];
						number2 = gameJPane.tileMap.mapDemo[entityBottomRow][entitRightCol];
						if(gameJPane.tileMap.tiles[number1].collision == true || gameJPane.tileMap.tiles[number2].collision == true) {
							if(gameJPane.tileMap.tiles[number1].collision == true )
								gameJPane.player.worldX += 4;
							if(gameJPane.tileMap.tiles[number2].collision == true )
									gameJPane.player.worldX -= 4;
							entity.collisionOn = true;		
						}
						break;
		case "left":	entityLeftCol = (entityLeftWorldX - entity.speed)/gameJPane.tileSize;
						number1 = gameJPane.tileMap.mapDemo[entityTopRow][entityLeftCol];
						number2 = gameJPane.tileMap.mapDemo[entityBottomRow][entityLeftCol];
						if(gameJPane.tileMap.tiles[number2].collision == true || gameJPane.tileMap.tiles[number1].collision == true) {
							if(gameJPane.tileMap.tiles[number1].collision == true )
								gameJPane.player.worldY += 4;
							if(gameJPane.tileMap.tiles[number2].collision == true )
									gameJPane.player.worldY -= 4;
							entity.collisionOn = true;		
						}
						break;
		case "right":	entitRightCol = (entityRightWorldX + entity.speed)/gameJPane.tileSize;
						number1 = gameJPane.tileMap.mapDemo[entityTopRow][entitRightCol];
						number2 = gameJPane.tileMap.mapDemo[entityBottomRow][entitRightCol];
						if(gameJPane.tileMap.tiles[number2].collision == true || gameJPane.tileMap.tiles[number1].collision == true) {			
							if(gameJPane.tileMap.tiles[number1].collision == true )
								gameJPane.player.worldY += 4;
							if(gameJPane.tileMap.tiles[number2].collision == true )
									gameJPane.player.worldY -= 4;
							entity.collisionOn = true;		
						}
						break;
		}		
		
		
		
	}
	
}
