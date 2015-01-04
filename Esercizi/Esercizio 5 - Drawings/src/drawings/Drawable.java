package drawings;

import java.awt.Graphics;

/**
 * Un generico elemento disegnabile
 * 
 * @author Alessandro
 */
public interface Drawable {

	/**
	 * Disegna questo disegnabile su un Graphics
	 * 
	 * @param graphics Il Graphics su cui disegnare
	 */
	public void draw(Graphics graphics);
}
