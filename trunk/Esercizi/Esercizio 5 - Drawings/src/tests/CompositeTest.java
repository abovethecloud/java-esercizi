package tests;

import javax.swing.JFrame;

import drawings.Circle;
import drawings.CompositeDrawable;
import drawings.DrawingsPanel;

public class CompositeTest {
	
	public static void main(String[] args) {
		
		CompositeDrawable comp = new CompositeDrawable();
		
		comp.getDrawables().add(new Circle(100, 100, 100, true));
		comp.getDrawables().add(new Circle(200, 100, 10, false));

		
		DrawingsPanel panel = new DrawingsPanel();
		panel.addDrawable(comp);
		
		JFrame frame = new JFrame("PROVA");
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		
	}

}
