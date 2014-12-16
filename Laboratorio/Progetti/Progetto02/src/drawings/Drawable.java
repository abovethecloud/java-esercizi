package drawings;

import java.awt.Graphics;

/** E' l'Interfaccia che astrae l'operazione di disegno. */
public interface Drawable {

	/** Disegna il parametro passato */
	public void draw(Graphics g);
}
