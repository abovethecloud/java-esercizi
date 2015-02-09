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
		super();
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

		


		if ( (xMouse >= x) && (xMouse <= (x+l)) && (yMouse >= y) && (yMouse <= (y+l))) {
			distX = xMouse - x;
			distY = yMouse - y;
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
		if (dragging) {
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
