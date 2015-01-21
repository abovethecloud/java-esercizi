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
	 * Costruttore di default. Non fa nulla di particolare, 
	 * settings = new DefaultSettings() e' gia' istanziato.
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

	/**
	 * Per poter modificare la larghezza "width" devo chiamare: DefaultSettings.getSettings().setWidth
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	public Color getColor() {
		return color;
	}

	/**
	 * Per poter modificare il colore "color" devo chiamare: DefaultSettings.getSettings().setColor
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
