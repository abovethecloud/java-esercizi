package drawings;

import java.awt.Color;
import java.awt.Graphics;

/**
 * E' una classe che funge da decorator. Partendo da un Drawable, gli viene
 * assegnato il colore. Al momento della chiamata di draw, verr� chiamata la
 * funzione specifica di disegno del drawable, ma verr� colorata con il colore
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

	/**
	 * Questo metodo Draw disegna il drawable secondo le sue particolari
	 * istruzioni, settando per� prima il colore al colore scelto nel
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
