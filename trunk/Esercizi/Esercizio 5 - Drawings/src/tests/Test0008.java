package tests;

import java.awt.Color;

import javax.swing.JFrame;

import drawings.ColoredDrawable;
import drawings.CurveDrawable;
import drawings.DrawingsPanel;
import drawings.DropModel;
import drawings.StrokedDrawable;

public class Test0008 {
	
	public static void main(String[] args) {
		
		JFrame frame8 = new JFrame("Test0008");
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.setSize(400, 400);
		
		DrawingsPanel panel8 = new DrawingsPanel();
		
		
		
		ColoredDrawable gocciaRossa = new ColoredDrawable(Color.RED, new StrokedDrawable(new CurveDrawable(new DropModel(100, 100, 60, 60)), 3));
			panel8.addDrawable(gocciaRossa);
			
		StrokedDrawable gocciaIncolore = new StrokedDrawable(new CurveDrawable(new DropModel(50, 100, 60, 60)), 3);
			panel8.addDrawable(gocciaIncolore);
		
		ColoredDrawable gocciaVerde = new ColoredDrawable(Color.GREEN, new StrokedDrawable(new CurveDrawable(new DropModel(100, 200, 60, 60)), 3));
			panel8.addDrawable(gocciaVerde);

		ColoredDrawable gocciaBlu = new ColoredDrawable(Color.BLUE, new StrokedDrawable(new CurveDrawable(new DropModel(200, 100, 60, 60)), 3));
			panel8.addDrawable(gocciaBlu);
		
		ColoredDrawable gocciaGialla = new ColoredDrawable(Color.YELLOW, new StrokedDrawable(new CurveDrawable(new DropModel(200, 200, 60, 60)), 3));
			panel8.addDrawable(gocciaGialla);
			
		ColoredDrawable gocciaArancione = new ColoredDrawable(Color.ORANGE, new StrokedDrawable(new CurveDrawable(new DropModel(100, 300, 60, 60)), 3));
			panel8.addDrawable(gocciaArancione);
			
		ColoredDrawable gocciaBianca = new ColoredDrawable(Color.WHITE, new StrokedDrawable(new CurveDrawable(new DropModel(200, 300, 60, 60)), 3));
			panel8.addDrawable(gocciaBianca);
			
			
			
		frame8.getContentPane().add(panel8);
		frame8.setVisible(true);
		
		
		
	}

}
