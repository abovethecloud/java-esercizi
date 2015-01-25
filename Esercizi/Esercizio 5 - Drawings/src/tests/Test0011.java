package tests;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import drawings.BuilderDrawable1;
import drawings.DirectorBuilderDrawable;
import drawings.Drawable;
import drawings.DrawingsPanel;
import drawings.generators.CircleGenerator;

public class Test0011 {
	
	public static void main(String[] args) {
		
		// Creo il direttore
		DirectorBuilderDrawable director = new DirectorBuilderDrawable(new BuilderDrawable1());
		
		// Aggiungo un generatore e qualche colore
		director.addGenerator("Cerchio", new CircleGenerator());
		director.addColor("Rosso", Color.RED);
		director.addColor("Verde", Color.GREEN);
		director.addColor("Giallo", Color.YELLOW);
		director.addColor("Blu", Color.BLUE);
		
		// Passo la stringa al Direttore che la farà assemblare in base al builder e al generator appropriato
		Drawable draw = director.build("Cerchio Rosso 100 100 50");
		
		// Creo pannello e aggiungo il drawable
		DrawingsPanel panel = new DrawingsPanel();
		panel.addDrawable(draw);
		
		// Creo il frame, aggiusto i settings e vi aggiungo il panel
		JFrame frame = new JFrame("Test0011");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	
		
	}

}
