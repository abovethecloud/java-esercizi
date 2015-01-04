package drawings;

import java.awt.Color;

/**
 * 
 * @author Alessandro
 *
 * @see ColoredDrawable
 * @see StrokedDrawable
 */
public class DefaultSettings {
	
	private static DefaultSettings settings=
		new DefaultSettings();

	private DefaultSettings(){
		
	}
	
	public static DefaultSettings getSettings() {
		return settings;
	}
	
	private int width=1;
	private Color color=Color.BLACK;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
