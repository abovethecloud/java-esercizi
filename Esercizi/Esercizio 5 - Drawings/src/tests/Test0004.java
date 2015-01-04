package tests;

import java.awt.Color;

import javax.swing.JFrame;

import drawings.Circle;
import drawings.ColoredDrawable;
import drawings.DrawingsPanel;
import drawings.Rectangle;
import drawings.StrokedDrawable;
import drawings.Triangle;

/**
 * Lancia una Finestra e ci Disegna,
 * un Cerchio Rosso ed un Rettangolo Blu,
 * con Spessore Assegnato
 */
public class Test0004 {

	public static void main(String[] args) {
		
		DrawingsPanel panel=new DrawingsPanel();

		panel.addDrawable(
				new StrokedDrawable(
				new ColoredDrawable(
					Color.RED, new Circle(100, 100, 20)),10));
		panel.addDrawable(
				new StrokedDrawable(
				new ColoredDrawable(
					Color.BLUE, new Rectangle(10, 10, 10, 10)),
					2));
		
		JFrame frame=new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
