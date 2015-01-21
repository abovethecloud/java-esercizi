package drawings;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import tests.Test0004;

/**
 * Classe Decorator di un qualunque Drawable (può anche essere un
 * CompositeDrawable o ColoredDrawable). Aggiunge l'effetto pennello di disegno
 * dei bordi, con un determinato diametro dato dal parametro width.
 * 
 * @author Claudio
 * 
 * @see Drawable
 * @see Test0004
 *
 */
public class StrokedDrawable implements Drawable {

	private Drawable drawable;
	private int width;

	public StrokedDrawable(Drawable drawable, int width) {
		super();
		this.drawable = drawable;
		this.width = width;
	}

	/**
	 * Cambia le impostazioni di "graphics", trasformandolo in tipo Graphics2D e
	 * aggiungendo l'effetto pennello (che resterà memorizzato in graphics e
	 * diverrà visibile se presente al momento della chiamata di draw
	 * (generalmente dovuta ad un paintComponent))
	 * Dopo aver chiamato il metodo draw, riprende i settings originali.
	 */
	@Override
	public void draw(Graphics graphics) {

		/*
		 * Casting di "graphics" dal tipo Graphics al tipo Graphics2D (che
		 * estende Graphics), che permette di utilizzare funzioni come il
		 * pennello.
		 */
		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.setStroke(new BasicStroke(width));
		drawable.draw(graphics);
		graphics2D.setStroke(new BasicStroke(DefaultSettings.getSettings()
				.getWidth()));
	}
}
