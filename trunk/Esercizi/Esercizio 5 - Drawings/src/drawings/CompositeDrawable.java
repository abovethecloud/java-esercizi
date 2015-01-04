package drawings;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Contiene un ArrayList<Drawable> al quale possono essere aggiunti elementi
 * mediante getDrawables().add(...). Il metodo draw permette il disegno in
 * blocco di tutti i Drawable contenuti nell'ArrayList.
 * 
 * @author Claudio
 */
public class CompositeDrawable implements Drawable {

	/**
	 * Commento Javadoc di prova su un attributo private: Inizializza
	 * l'ArrrayList di Drawable di 10 elementi vuoti.
	 */
	private ArrayList<Drawable> drawables = new ArrayList<Drawable>();

	/**
	 * Il costruttore di default è da inserire necessariamente in maniera
	 * esplicita perché altrimenti qualunque classe che estenda questa classe
	 * padre, non troverà il costruttore di default per inizializzare la classe
	 * padre.
	 */
	public CompositeDrawable() {
		drawables = new ArrayList<Drawable>();
	}

	/**
	 * Costruttore aggiunto da Claudio. Può servire per impostare a priori
	 * l'ArrayList di drawables.
	 * 
	 * @param drawables
	 */
	public CompositeDrawable(ArrayList<Drawable> drawables) {
		super();
		this.drawables = drawables;
	}

	/**
	 * Questo metodo consente di agire sull'ArrayList drawables con tutti i
	 * metodi previsti da ArrayList, tra cui ".add(...)"
	 * 
	 * @return drawables
	 */
	public ArrayList<Drawable> getDrawables() {
		return drawables;
	}

	/**
	 * Disegna, uno ad uno, tutti i Drawable contenuti nell'ArrayList
	 */
	@Override
	public void draw(Graphics graphics) {
		// drawable1.draw(graphics);
		// drawable2.draw(graphics);
		for (int i = 0; i < drawables.size(); i++) {
			drawables.get(i).draw(graphics);
		}
	}

}
