package objectInGame;

import javax.imageio.ImageIO;

public class obj_boots extends superObject{
	public obj_boots() {
		name = "boots";
		try {
			img = ImageIO.read(getClass().getResource("/Object/boots.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		collision = true;
	}
}
