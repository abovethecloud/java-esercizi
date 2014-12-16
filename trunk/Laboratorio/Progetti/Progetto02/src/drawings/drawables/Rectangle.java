package drawings.drawables;

import java.awt.Graphics;

import drawings.Drawable;

/** E' una classe che implementa l'interfaccia Drawable */
public class Rectangle implements Drawable {

	private int x,y,width,height;
	
	/** Il costruttore del Rettangolo accetta come parametri la posizione e le dimensioni
	 * del rettangolo\n ciao*/
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		//g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
	}

}
