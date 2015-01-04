package tests;

import javax.swing.JFrame;

import drawings.Circle;
import drawings.DrawingsPanel;
import drawings.Rectangle;
import drawings.Triangle;

/**
 * Lancia una Finestra e ci Disegna dei Cerchi,
 * o dei Rettangoli o dei Triangoli
 */
public class Test0002 {

	public static void main(String[] args) {
		
		DrawingsPanel panel=new DrawingsPanel();
		
		panel.addDrawable(new Circle(20, 20, 10));
		panel.addDrawable(new Circle(100, 20, 10));
		panel.addDrawable(new Rectangle(100, 100, 20, 20));
		panel.addDrawable(new Rectangle(50, 100, 20, 20));
		panel.addDrawable(new Triangle(20, 100, 30,100,20,110));
		panel.addDrawable(new Triangle(40, 40, 40, 50, 50, 40));
		
		JFrame frame=new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
