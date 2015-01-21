package drawings;

import java.awt.Graphics;

/**
 * Classe astratta che implementa Drawable e vi aggiunge una funzionalità
 * (assomiglia ad un Decorator), ovvero il parametro filled, che può determinare
 * se la Shape dovrà essere piena o vuota (di default vengono disegnate figure
 * vuote)
 * 
 * @author Claudio
 */
public abstract class Shape implements Drawable {

	private boolean filled;

	public Shape(boolean filled) {
		super();
		this.filled = filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public boolean isFilled() {
		return filled;
	}

	/**
	 * Metodo astratto draw di disegno. In realtà non è necessario definire così
	 * draw. Essendo una classe astratta che implementa l'interfaccia, avrei
	 * anche potuto non scrivere nulla e lasciare sottinteso che si trattase di
	 * un metodo da implementare in qualunque classe estenda la classe astratta.
	 * 
	 */
	@Override
	public abstract void draw(Graphics graphics);
}
