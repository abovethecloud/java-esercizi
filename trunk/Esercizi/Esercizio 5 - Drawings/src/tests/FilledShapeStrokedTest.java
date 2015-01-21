package tests;

import java.awt.Color;

import javax.swing.JFrame;

import drawings.Circle;
import drawings.ColoredDrawable;
import drawings.DrawingsPanel;
import drawings.Rectangle;
import drawings.StrokedDrawable;

/**
 * Lancia una Finestra e ci Disegna, un Cerchio Rosso ed un Rettangolo Blu, con
 * Spessore Assegnato
 */
public class FilledShapeStrokedTest {

	public static void main(String[] args) {

		DrawingsPanel panel = new DrawingsPanel();

		// Verificato che non si riesce a utilizzare un colore diverso per il contorno e l'interno, con la conformazione attuale delle classi.
		panel.addDrawable(new ColoredDrawable(Color.red, new StrokedDrawable(new ColoredDrawable(Color.BLUE, new Circle(200, 200, 100, true)), 20)));
		
		panel.addDrawable(new StrokedDrawable(new ColoredDrawable(Color.BLUE, new Rectangle(100, 100, 100, 100)), 2));

		JFrame frame = new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
