package objectInGame;

import javax.imageio.ImageIO;

import userInterFace.GameJPane;

public class obj_Key extends superObject{
	
	public obj_Key() {
		name = "Key";
		try {
			img = ImageIO.read(getClass().getResource("/Object/key.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		collision = true;
	}
}
