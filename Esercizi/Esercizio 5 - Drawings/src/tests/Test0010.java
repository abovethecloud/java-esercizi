package tests;

import javax.swing.JFrame;

import drawings.CurveDrawable;
import drawings.DrawingsPanel;
import drawings.SpiralModel;
import drawings.TranslatedDrawable;

public class Test0010 {
	
	public static int translationX = 50;
	public static int translationY = 50;

	public static void main(String[] args) {
		
		DrawingsPanel panel = new DrawingsPanel();
		
		CurveDrawable spiral = new CurveDrawable(new SpiralModel(50, 50, 10, 50));
		
		
		// Questo ciclo for è molto furbo: modifica la posizione lungo le
		// ascisse (X) ogni passaggio di 100 fino ad un massimo di 400. Poi
		// reinizia da 0 fino a 400 e cosi' via... Nel contempo i/5 (essendo INTERO)
		// procede a scalino, incrementando di 100 ogni 5 passaggi.
		// Le spirali si disporranno a rettangolo allungato orizzontalmente.
		for (int i = 0; i < 10; i++) {
			int x = translationX + (i%5)*100;
			int y = translationY + (i/5)*100;
			panel.addDrawable(new TranslatedDrawable(spiral, x, y));
			
		}
		
		JFrame frame = new JFrame("Test0010");
		frame.setSize(630, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		
	}

}
