package mvcSquare.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import mvcSquare.model.Square;

public class SquareControl implements MouseListener, MouseMotionListener {

	private Square square;
	private boolean dragging = false;
	private int distX, distY;
	
	public SquareControl(Square square) {
		this.square = square;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		int x = square.getX();
		int y = square.getY();
		int l = square.getL();
		
		// Recupero la posizione in cui ho premuto il mouse
		int xMouse = e.getX();
		int yMouse = e.getY();

		
		distX = xMouse - x;
		distY = yMouse - y;

		distX = xMouse - x;
		distY = yMouse - y;
		
		// System.out.println(xMouse);
		// System.out.println(x);

		// dragging = false;

		/*
		 * Controllo se il Mouse è all'interno del mio quadrato. Se lo è, salvo
		 * la distanza del punto di pressione del mouse dai lati del quadrato
		 */
//		if ( (x<=xMouse && xMouse<=(x+l)) && (y<=yMouse && yMouse>=(y+l)) ) {
//			dragging = true;
//		}
		if (xMouse >= x && xMouse <= (x+l) && yMouse >= y && yMouse <= (y+l)) {
			dragging = true;
		}
		else
			dragging = false;
			
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		// AGGIORNO la posizione del mouse
		int xMouse = e.getX();
		int yMouse = e.getY();
		
		// Se sto trascinando, sposto le coordinate del quadrato
		if (dragging = true) {
			square.setX(xMouse - distX);
			square.setY(yMouse - distY);
			
		}
	}
	

	
	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

}
