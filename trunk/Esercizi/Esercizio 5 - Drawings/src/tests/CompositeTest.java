package tests;

import java.awt.Graphics;

import javax.swing.JFrame;

import drawings.Circle;
import drawings.CompositeDrawable;
import drawings.DrawingsPanel;

/**
 * Test che verifica la funzionalità di CommpositeDrawable aggiungendo elementi
 * ad un CompositeDrawable e disegnando.
 * 
 * @author claudio
 *
 */
public class CompositeTest {

	public static void main(String[] args) {

		// Istanzio un CompositeDrawable
		CompositeDrawable comp = new CompositeDrawable();

		// Aggiungo 2 cerchi (uno vuoto e uno colorato)
		comp.getDrawables().add(new Circle(100, 100, 100, false));
		comp.getDrawables().add(new Circle(200, 100, 10, true));

		/*
		 * Istanzio un pannello di tipo DrawingsPanel (ovvero apposta per il
		 * disegno) e aggiungo il CompositeDrawable. La particolarità di
		 * DrawingsPanel è quella di possedere il metodo addDrawable, che
		 * aggiunge il Drawable ad un ArrayList contenuto nel pannello. Lo
		 * disegno tutto chiamando paintComponent
		 */
		DrawingsPanel panel = new DrawingsPanel();
		panel.addDrawable(comp);

		// Creo un frame e aggiungo il pannello
		JFrame frame = new JFrame("PROVA");
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Aggiungo il pannello al frame e setto la visibilità
		frame.setVisible(true);

		frame.getContentPane().add(panel);
		frame.repaint();
		

		/* ATTENZIONE: setVisible !!!
		 * Il comando setVisible non solo rende visibile il pannello, ma disegna
		 * anche tutte le componenti chiamando il metodo paintComponent del
		 * pannello. Morale: Quando costruisco un pannello personalizzato per
		 * mezzo dell'ereditarietà applicata a JPanel, devo fare l'override
		 * BUONO (quello con super.paintComponent) del metodo paintComponent,
		 * dando le istruzioni per il disegno delle componenti del pannello.
		 * 
		 */

	}

}
