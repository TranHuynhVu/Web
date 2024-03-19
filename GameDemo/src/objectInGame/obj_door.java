package objectInGame;

import javax.imageio.ImageIO;

public class obj_door extends superObject{
	public obj_door() {
		name = "door";
		try {
			img = ImageIO.read(getClass().getResource("/Object/door.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		collision = true;
	}
}
