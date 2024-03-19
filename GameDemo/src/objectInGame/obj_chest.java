package objectInGame;

import javax.imageio.ImageIO;

public class obj_chest extends superObject{
	public obj_chest() {
		name = "Chest";
		try {
			img = ImageIO.read(getClass().getResource("/Object/chest (OLD).png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		collision = true;
	}
}
