package drawings;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * Questa classe estende JPanel e vi aggiunge qualche funzione utile al disegno: un ArrayList di Drawables e un override di paintComponent
 * 
 * @author claudio
 *
 */
public class DrawingsPanel extends JPanel{

	private ArrayList<Drawable> drawables=
		new ArrayList<Drawable>();
	
	public void addDrawable(Drawable drawable){
		drawables.add(drawable);
	}
	
	/**
	 * Questo metodo fa l'override (BUONO) di paintComponent di JPanel.
	 * Viene chiamato in automatico quando nel frame di appartenenza viene settata a true la visibilità.
	 * In questo modo NON è necessario passare esplicitamente un elemento grafico di tipo Graphics.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < drawables.size(); i++) {
			drawables.get(i).draw(g);
		}
	}
}
