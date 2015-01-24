package tests;

import javax.swing.JFrame;
import javax.swing.JPanel;

import drawings.CompositeDrawableBuilder;
import drawings.Drawable;
import drawings.DrawingsPanel;

public class Test0011 {
	
	public static void main(String[] args) {
		
		DrawingsPanel panel = new DrawingsPanel();
		
		CompositeDrawableBuilder draw1 = new CompositeDrawableBuilder("Cerchio Rosso 100 100 20");
		
		draw1.convertString();
		
		panel.addDrawable(draw1);
		
		
		JFrame frame = new JFrame("Test0011");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
	}

}
