package drawings;

import java.awt.Color;

/**
 * Classe che funge da Singleton. Istanzia un ed un solo oggetto per questa
 * classe di tipo statico. E' utilizzata per conservare alcuni settings di
 * default, ovvero LARGHEZZA (1) e COLORE (NERO). I settings verranno utilizzati
 * per modificare il tipo Graphics
 * 
 * 
 * @author Claudio
 *
 * @see ColoredDrawable
 * @see StrokedDrawable
 */
public class DefaultSettings {

	private static DefaultSettings settings = new DefaultSettings();

	/**
	 * Costruttore di default. Non fa nulla di particolare, ma 
	 * settings = new DefaultSettings() viene istanziato.
	 */
	private DefaultSettings() {
	}

	/**
	 * Metodo che permette l'accesso ai settings contenuti in DefaultSettings.
	 * 
	 * @return settings = new DefaultSettings()
	 */
	public static DefaultSettings getSettings() {
		return settings;
	}

	/*
	 * Istanze delle caratteristiche del settings di base: LARGHEZZA: 1 COLORE:
	 * NERO
	 */
	private int width = 1;
	private Color color = Color.BLACK;

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
