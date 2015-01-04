package drawings;

import java.awt.Color;
import java.awt.Graphics;

/**
 * E' una classe che funge da decorator. Partendo da un Drawable, gli viene
 * assegnato il colore. Al momento della chiamata di draw, verrà chiamata la
 * funzione specifica di disegno del drawable, ma verrà colorata con il colore
 * assegnato.
 * 
 * @author Claudio
 * 
 */
public class ColoredDrawable implements Drawable {

	private Color color;
	private Drawable drawable;

	public ColoredDrawable(Color color, Drawable drawable) {
		super();
		this.color = color;
		this.drawable = drawable;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(color);
		drawable.draw(graphics);
		graphics.setColor(DefaultSettings.getSettings().getColor());
	}
}
