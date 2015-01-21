package drawings;

import java.awt.Graphics;

/**
 * Un cerchio dato il centro (x,y), il raggio radius e (eventualmente) il valore
 * di filled, che rappresenta se il cerchio è pieno o vuoto
 * 
 * @author Claudio
 */
public class Circle extends Shape implements Drawable {

	private int x, y;
	private int radius;

	/**
	 * Costruttore che disegna il cerchio dati SOLO centro e raggio. In
	 * automatico setta filled a false chiamando il costruttore della classe
	 * padre Shape [Shape(false) -> filled = false] con super(false).
	 * 
	 * @param x
	 *            ascissa centro cerchio
	 * @param y
	 *            ordinata centro cerchio
	 * @param radius
	 *            raggio cerchio
	 */
	public Circle(int x, int y, int radius) {
		super(false);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/**
	 * Costruttore che disegna il cerchio dati centro, raggio e "filled".
	 * "filled" indica se il cerchio sarà pieno o vuoto. Setta filled al valore
	 * booleano passato al costruttore chiamando il costruttore della classe
	 * padre Shape [Shape(...) -> filled = ...] con super(...).
	 * 
	 * @param x
	 *            ascissa centro cerchio
	 * @param y
	 *            ordinata centro cerchio
	 * @param radius
	 *            raggio cerchio
	 * @param filled
	 *            valore booleano che determina il riempimento del cerchio
	 */
	public Circle(int x, int y, int radius, boolean filled) {
		super(filled);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Disegna un cerchio pieno o vuoto a seconda del valore di super.filled.
	 * Per conoscere il vlaore booleano di super.filled chiamo il metodo della
	 * classe Padre isFilled.
	 */
	public void draw(Graphics graphics) {
		if (isFilled()) {
			graphics.fillOval(x - radius, y - radius, radius << 1, radius << 1);
		} else {
			graphics.drawOval(x - radius, y - radius, radius << 1, radius << 1);
		}
	}
}
