package tests;

import java.awt.Color;

import javax.swing.JFrame;

import drawings.CompositeDrawableBuilder;
import drawings.Drawable;
import drawings.DrawingsPanel;
import drawings.builders.DrawableBuilderVersion1;
import drawings.generators.CircleGenerator;
import drawings.generators.FlowerGenerator;
import drawings.generators.TriangleGenerator;

/**
 * Realizzare il Test0011: Implementare un componente CompositeDrawableBuilder munito di una funzionalità che consenta di convertire 
 * una Stringa in un Elemento Disegnabile. Il formato delle stringhe deve essere
 * NomeComponente Colore ParametriComponente
 * Ad esempio
 * 
 * Cerchio Rosso 100 100 20
 * Fiore Blu 100 100 6 20
 * Triangolo Giallo 10 10 100 10 10 200 
 * Dopo aver scritto altre 10 Stringhe analoghe, implementare il Test0011 in modo 
 * che verifichi il funzionamento del componente sulle 3 stringhe di esempio e sulle aggiuntive 10 stringhe aggiuntive.
 * 
 * Nota: La soluzione di questo test (Esercizio 5.5) è fornita in concomitanza alla soluzione del Test0012 (Esercizio 5.6)  
 */
public class Test0011 {

	public static void main(String[] args) {
		
		DrawingsPanel panel=new DrawingsPanel();
		
		//Composizione/Definizione del Builder
		/* Nota: per fare un lavoro completo, bisognerebbe prevedere un insieme completo 
		 * di drawableGenerator e di colori..
		 */
		CompositeDrawableBuilder builder=new CompositeDrawableBuilder(new DrawableBuilderVersion1());
		builder.addGenerator("Cerchio", new CircleGenerator());
		builder.addGenerator("Triangolo", new TriangleGenerator());
		builder.addGenerator("Fiore", new FlowerGenerator());
		builder.addColor("Rosso", Color.RED);
		builder.addColor("Blu", Color.BLUE);
		builder.addColor("Giallo", Color.YELLOW);
		builder.addColor("Verde", Color.GREEN);
		
		//Test del Builder
		Drawable builtDrawable1=builder.build("Cerchio Rosso 100 100 20");
		panel.addDrawable(builtDrawable1);
		Drawable builtDrawable2=builder.build("Fiore Blu 100 100 6 20");
		panel.addDrawable(builtDrawable2);
		Drawable builtDrawable3=builder.build("Triangolo Giallo 10 10 100 10 10 200");
		panel.addDrawable(builtDrawable3);

		//Altri Test del Builder
		Drawable builtDrawable4=builder.build("Cerchio Rosso 100 200 20");
		panel.addDrawable(builtDrawable4);
		Drawable builtDrawable5=builder.build("Fiore Blu 300 100 2 20");
		panel.addDrawable(builtDrawable5);
		Drawable builtDrawable6=builder.build("Triangolo Verde 310 10 400 10 310 50");
		panel.addDrawable(builtDrawable6);
		
		JFrame frame=new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(800,400);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}