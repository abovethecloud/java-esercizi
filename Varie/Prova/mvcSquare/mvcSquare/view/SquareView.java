package mvcSquare.view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import mvcSquare.model.Square;

@SuppressWarnings("serial")
public class SquareView extends JPanel implements Observer {

	private Square square;
	
	public SquareView(Square square) {
		super();
		this.square = square;
		square.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	private void draw(Graphics g) {
		int x = square.getX();
		int y = square.getY();
		int l = square.getL();
		g.drawRect(x, y, l, l);
	}

}
