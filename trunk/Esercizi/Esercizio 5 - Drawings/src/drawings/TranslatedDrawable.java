package drawings;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Il meccanismo di questa classe è IDENTICO a quello di StrokedDrawable.
 * TranslatedDrawable contiene un Drawable, il quale verrà diseganto invece che
 * col normale metodo draw, con il proprio metodo draw a cui viene passato un
 * Graphics2D con proprietà di traslare il grafico nel centro specificato. A
 * seguire il centro viene resettato all'origine.
 * 
 * @author claudio
 *
 */
public class TranslatedDrawable implements Drawable{
	
	private Drawable drawable;
	private int translationX;
	private int translationY;
	
	
	public Drawable getDrawable() {
		return drawable;
	}
	
	public void setDrawable(Drawable drawable) {
		this.drawable = drawable;
	}
	
	public int getTranslationX() {
		return translationX;
	}
	
	public void setTranslationX(int translationX) {
		this.translationX = translationX;
	}
	
	public int getTranslationY() {
		return translationY;
	}
	
	public void setTranslationY(int translationY) {
		this.translationY = translationY;
	}

	public TranslatedDrawable(Drawable drawable, int translationX, int translationY) {
		super();
		this.drawable = drawable;
		this.translationX = translationX;
		this.translationY = translationY;
	}
	
	/**
	 * Override del metodo draw (BUONO perché il draw del Drawable viene
	 * chiamato, semplicmente gli viene passato un Graphics2D già traslato.
	 */
	@Override
	public void draw(Graphics graphics) {
		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.translate(translationX, translationY);
		drawable.draw(graphics2D);
		graphics2D.translate(-translationX, -translationY);
		
		
		
	}
	
	

}
