package campoMinato.view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import campoMinato.model.Campo;

/**
 * Questa classe è un pannello specifico per contenere un Campo di caselle, che
 * viene Osservato.
 * 
 * @author claudio
 *
 */
@SuppressWarnings("serial")
public class CampoView extends JPanel implements Observer {

	private Campo campo;

	/**
	 * Il costruttore prende in entrata un campo e lo osserva. Osserva anche
	 * tutte le singole caselle, per ridisegnarsi non appena cambia qualcosa.
	 * 
	 * @param campo
	 */
	public CampoView(Campo campo) {
		this.campo = campo;
		campo.addObserver(this);
		for (int i = 0; i < campo.getCampoDiCaselle().length; i++) {
			for (int j = 0; j < campo.getCampoDiCaselle().length; j++) {
				campo.getCampoDiCaselle()[i][j].addObserver(this);
			}
		}
	}

	/**
	 * Il metodo paintComponent viene chiamato al momento del disegno del
	 * pannello ed è indispensabile chiamarlo (con repaint) al momento
	 * dell'arrivo di una notifica dall'Observable
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		campo.draw(g);
	}

	/**
	 * Quando arriva una notifica dagli Observable, ridisegna il pannello
	 */
	@Override
	public void update(Observable o, Object arg) {
		
		repaint();
	}

}
