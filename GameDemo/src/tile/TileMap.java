package tile;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.temporal.ValueRange;

import javax.imageio.ImageIO;

import userInterFace.GameJPane;

public class TileMap{
	GameJPane gp;
	public Tile[] tiles;
	public int[][] mapDemo;
	
	public TileMap(GameJPane gp) {
		this.gp = gp;
		mapDemo = new int[gp.maxWorldRow][gp.maxWorldCol];
		tiles = new Tile[50];
		
		getTiles();
		loadMap("/Maps/worldV2.txt");
	}
	
	public void getTiles() {
		try {
			tiles[0] = new Tile();
			tiles[0].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));
			tiles[1] = new Tile();
			tiles[1].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));			
			tiles[2] = new Tile();
			tiles[2].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));		
			tiles[3] = new Tile();
			tiles[3].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));	
			tiles[4] = new Tile();	
			tiles[4].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));			
			tiles[5] = new Tile();
			tiles[5].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));			
			tiles[6] = new Tile();
			tiles[6].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));		
			tiles[7] = new Tile();
			tiles[7].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));		
			tiles[8] = new Tile();
			tiles[8].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));	
			tiles[9] = new Tile();
			tiles[9].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));		
			tiles[10] = new Tile();
			tiles[10].img = ImageIO.read(getClass().getResource("/tiles/grass00.png"));
		
			tiles[11] = new Tile();
			tiles[11].img = ImageIO.read(getClass().getResource("/tiles/grass01.png"));
		
			tiles[12] = new Tile();
			tiles[12].img = ImageIO.read(getClass().getResource("/tiles/water00.png"));
			tiles[12].collision = true;
			
			tiles[13] = new Tile();
			tiles[13].img = ImageIO.read(getClass().getResource("/tiles/water01.png"));
			tiles[13].collision = true;
			
			tiles[14] = new Tile();
			tiles[14].img = ImageIO.read(getClass().getResource("/tiles/water02.png"));
			tiles[14].collision = true;
			
			tiles[15] = new Tile();
			tiles[15].img = ImageIO.read(getClass().getResource("/tiles/water03.png"));
			tiles[15].collision = true;
			
			tiles[16] = new Tile();
			tiles[16].img = ImageIO.read(getClass().getResource("/tiles/water04.png"));
			tiles[16].collision = true;
			
			tiles[17] = new Tile();
			tiles[17].img = ImageIO.read(getClass().getResource("/tiles/water05.png"));
			tiles[17].collision = true;
			
			tiles[18] = new Tile();
			tiles[18].img = ImageIO.read(getClass().getResource("/tiles/water06.png"));
			tiles[18].collision = true;
			
			tiles[19] = new Tile();
			tiles[19].img = ImageIO.read(getClass().getResource("/tiles/water07.png"));
			tiles[19].collision = true;
			
			tiles[20] = new Tile();
			tiles[20].img = ImageIO.read(getClass().getResource("/tiles/water08.png"));
			tiles[20].collision = true;
			
			tiles[21] = new Tile();
			tiles[21].img = ImageIO.read(getClass().getResource("/tiles/water09.png"));
			tiles[21].collision = true;
			
			tiles[22] = new Tile();
			tiles[22].img = ImageIO.read(getClass().getResource("/tiles/water10.png"));
			tiles[22].collision = true;
			
			tiles[23] = new Tile();
			tiles[23].img = ImageIO.read(getClass().getResource("/tiles/water11.png"));
			tiles[23].collision = true;
			
			tiles[24] = new Tile();
			tiles[24].img = ImageIO.read(getClass().getResource("/tiles/water12.png"));
			tiles[24].collision = true;
			
			tiles[25] = new Tile();
			tiles[25].img = ImageIO.read(getClass().getResource("/tiles/water13.png"));
			tiles[25].collision = true;
			
			tiles[26] = new Tile();
			tiles[26].img = ImageIO.read(getClass().getResource("/tiles/road00.png"));
			
			tiles[27] = new Tile();
			tiles[27].img = ImageIO.read(getClass().getResource("/tiles/road01.png"));
			
			tiles[28] = new Tile();
			tiles[28].img = ImageIO.read(getClass().getResource("/tiles/road02.png"));
		
			tiles[29] = new Tile();
			tiles[29].img = ImageIO.read(getClass().getResource("/tiles/road03.png"));
		
			tiles[30] = new Tile();
			tiles[30].img = ImageIO.read(getClass().getResource("/tiles/road04.png"));
		
			tiles[31] = new Tile();
			tiles[31].img = ImageIO.read(getClass().getResource("/tiles/road05.png"));
		
			tiles[32] = new Tile();
			tiles[32].img = ImageIO.read(getClass().getResource("/tiles/road06.png"));
		
			tiles[33] = new Tile();
			tiles[33].img = ImageIO.read(getClass().getResource("/tiles/road07.png"));
		
			tiles[34] = new Tile();
			tiles[34].img = ImageIO.read(getClass().getResource("/tiles/road08.png"));
		
			tiles[35] = new Tile();
			tiles[35].img = ImageIO.read(getClass().getResource("/tiles/road09.png"));
		
			tiles[36] = new Tile();
			tiles[36].img = ImageIO.read(getClass().getResource("/tiles/road10.png"));
			
			tiles[37] = new Tile();
			tiles[37].img = ImageIO.read(getClass().getResource("/tiles/road11.png"));
			
			tiles[38] = new Tile();
			tiles[38].img = ImageIO.read(getClass().getResource("/tiles/road12.png"));
			
			tiles[39] = new Tile();
			tiles[39].img = ImageIO.read(getClass().getResource("/tiles/earth.png"));
			
			tiles[40] = new Tile();
			tiles[40].img = ImageIO.read(getClass().getResource("/tiles/wall.png"));
			tiles[40].collision = true;
			
			tiles[41] = new Tile();
			tiles[41].img = ImageIO.read(getClass().getResource("/tiles/tree.png"));
			tiles[41].collision = true;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadMap(String nmap) {
		try {
			// đọc tập tin 
			InputStream is = getClass().getResourceAsStream(nmap);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			for(int i = 0; i < gp.maxWorldRow; i++) {
				String line = br.readLine();
				for(int j = 0; j < gp.maxWorldCol; j++) {
					String[] numString = line.split(" ");
					int number = Integer.parseInt(numString[j]);
					mapDemo[i][j] = number;
				}
			}
			br.close();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void draw(Graphics2D g2) {
//		while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
//			int worldX = worldCol * gp.tileSize;
//			int worldY = worldRow * gp.tileSize;
//			int screenX = worldX - gp.player.worldX + gp.player.screenX;
//			int screenY = worldY - gp.player.worldY + gp.player.screenY;
//		
//			g2.drawImage(tiles[mapDemo[worldRow][worldCol]].img, screenX, screenY, gp.tileSize, gp.tileSize, null);
//			worldCol++;
//		
//			if(worldCol == gp.maxWorldRow) {
//				worldCol = 0;
//				worldRow++;
//			
//			}
//		}
	
		for(int i = 0; i < gp.maxWorldRow; i++) {
			for(int j = 0; j < gp.maxWorldCol; j++) {
				int worldX = j * gp.tileSize;
				int worldY = i * gp.tileSize;
				int screenX = worldX - (gp.player.worldX - gp.player.screenX);
				int screenY = worldY - (gp.player.worldY - gp.player.screenY);
				if(worldX > gp.player.worldX - gp.player.screenX - gp.tileSize && 
				   worldX < gp.player.worldX + gp.player.screenX + gp.tileSize &&
				   worldY > gp.player.worldY - gp.player.screenY - gp.tileSize &&
				   worldY < gp.player.worldY + gp.player.screenY + gp.tileSize) {
					
					g2.drawImage(tiles[mapDemo[i][j]].img, screenX, screenY, gp.tileSize, gp.tileSize, null);
				}
			}
		}
	}
}
