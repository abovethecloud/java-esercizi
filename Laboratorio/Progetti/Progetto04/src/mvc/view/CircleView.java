package mvc.view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import mvc.model.Circle;

public class CircleView extends JPanel implements Observer {

	private Circle circle;
	
	public CircleView(Circle circle) {
		super();
		this.circle = circle;
		circle.addObserver(this);	// Questo dice di notificare all'Observer qualunque modifica a questo cerchio.
	}

	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics); // Questo super. serve a richiamre il comportamento della classe Padre.
		int ray = circle.getRay();
		graphics.drawOval(circle.getX() - ray, circle.getY() - ray, 2 * ray, 2 * ray);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		
		repaint();	// Costringo a ridisegnare il pannello richiamando la PaintComponent
	}

}
