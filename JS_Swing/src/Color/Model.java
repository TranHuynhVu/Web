package Color;

import java.awt.Color;

public class Model {
	private Color textColor;
	private Color backgroudColor;
	private boolean opaque;
	
	public Model() {
		this.textColor = Color.BLACK;
		this.backgroudColor = Color.WHITE;
		this.opaque = true;
	}
	public Color getTextColor() {
		return textColor;
	}
	public void setTextColor(Color textColor) {
		this.textColor = textColor;
	}
	public Color getBackgroudColor() {
		return backgroudColor;
	}
	public void setBackgroudColor(Color backgroudColor) {
		this.backgroudColor = backgroudColor;
	}
	public boolean isOpaque() {
		return opaque;
	}
	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
}
