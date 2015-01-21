package drawings;

import java.awt.Color;
import java.awt.Graphics;

/**
 * E' una classe decorator. Assegna un colore ad un Drawable.
 * Al momento della chiamata di draw, chiama la
 * funzione specifica di disegno del particolare tipo di drawable,
 * utilizzando come impostazione di colore quello assegnato.
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

	/**
	 * Questo metodo Draw disegna il drawable secondo le sue particolari
	 * istruzioni, settando prima il colore al colore scelto nel
	 * ColoredDrawable. Dopo il disegno si cura anche di ripristinare il colore
	 * di default con la chiamata ai DefaultSettings.
	 */
	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(color);
		drawable.draw(graphics);
		graphics.setColor(DefaultSettings.getSettings().getColor());
	}
}
