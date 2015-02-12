package campoMinato.view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import campoMinato.model.Casella;

public class CasellaView extends JPanel implements Observer {

	private Casella casella;

	/**
	 * Il costruttore prende in entrata una casella e la osserva
	 * 
	 * @param casella
	 */
	public CasellaView(Casella casella) {
		this.casella = casella;
		casella.addObserver(this);
	}

	/**
	 * Il metodo paintComponent viene chiamato al momento del disegno del
	 * pannello ed è indispensabile chiamarlo (con repaint) al momento
	 * dell'arrivo di una notifica dall'Observable
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		casella.draw(g);
	}

	/**
	 * Quando arriva una notifica dagli Observable, ridisegna il pannello
	 */
	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}

}
