package mvc.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import mvc.model.Circle;

/**
 * CircleController è una classe che mi consente di controllare lo spostamento
 * disegnato con la CircleView. L'obiettivo è quello di assicurarsi che il
 * cerchio venga spostato solamente quando il mio mouse effettua il Drag SOPRA
 * al cerchio, e non ovunque nel pannello. Creiamo una variabile booleana
 * "dragging" che mi dirà se sto effettuando il dragg.
 * 
 * @author cl410940
 *
 */
public class CircleController implements MouseListener, MouseMotionListener {

	private Circle circle;
	private boolean dragging;
	private int distx, disty;

	public CircleController(Circle circle) {
		super();
		this.circle = circle;
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent event) {
		// TODO Auto-generated method stub

	}

	/**
	 * Questo metodo scatta nel momento in cui il mouse viene trascinato sul
	 * pannello (quindi si sposta mentre avviene la pressione del tasto
	 * sinistro). ATTENZIONE perché a differenza di quanto il nome possa lasciar
	 * pensare, non so se sto effettivamente trascinando il cerchio. Per
	 * effettuare la verifica devo controllare se al momento della pressione del
	 * tasto sinistro il mouse si trovava all'interno dell'area del cerchio.
	 * Questo viene fatto dal metodo mousePressed.
	 * 
	 * @param distx
	 *            Indica la distanza (sulle ascisse) del punto di pressione del
	 *            mouse dal centro del cerchio. Distanza che deve rimanere
	 *            costante per tutta la durata del trascinamento
	 */
	@Override
	public void mouseDragged(MouseEvent event) {

		int xMouse = event.getX();
		int yMouse = event.getY();

		/*
		 * Se sto trascinando il cerchio, aggiorno la sua posizione. Aggiornando
		 * la posizione al cerchio, ciò viene notificato all'observer (la VISTA
		 * del cerchio), e il cerchio verrà ridisegnato
		 */
		if (dragging) {
			circle.setX(xMouse - distx);
			circle.setY(yMouse - disty);

		}
	}

	@Override
	public void mouseMoved(MouseEvent event) {
		// TODO Auto-generated method stub

	}

	/**
	 * Questo metodo verifica, alla pressione del mouse, che il mouse si trovi
	 * all'interno del cerchio, e dunque da inizio al trascinamento settando
	 * dragging = true. Imposta anche la distanza del mouse dal centro del
	 * cerchio, per far si che resti costante per la durata del trascinamento.
	 */
	@Override
	public void mousePressed(MouseEvent event) {

		int xMouse = event.getX();
		int yMouse = event.getY();

		int x = circle.getX();
		int y = circle.getY();

		int ray = circle.getRay();

		distx = xMouse - x;
		disty = yMouse - y;

		if ((distx) * (distx) + (disty) * (disty) <= ray * ray) {
			dragging = true;
		} else {
			dragging = false;
		}

	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// TODO Auto-generated method stub

	}

}
