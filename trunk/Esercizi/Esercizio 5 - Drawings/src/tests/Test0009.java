package tests;

import java.awt.Color;

import javax.swing.JFrame;

import drawings.Circle;
import drawings.ColoredDrawable;
import drawings.CompositeDrawable;
import drawings.CurveDrawable;
import drawings.DefaultSettings;
import drawings.DrawingsPanel;
import drawings.DropModel;
import drawings.FlowerModel;
import drawings.Rectangle;
import drawings.SpiralModel;
import drawings.StrokedDrawable;
import drawings.Triangle;

public class Test0009 {
	
	public static void main(String[] args) {
		
		// Creo il frame e imposto i settings
		JFrame frame9 = new JFrame("Test0009");
		frame9.setSize(500, 500);
		frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creo il pannello
		DrawingsPanel panel9 = new DrawingsPanel();
		
		/*
		 * Inizio ad istanziare tutti gli oggetti uniformi:
		 */
		Circle circle = new Circle(100, 50, 50);
		Rectangle rectangle = new Rectangle(50, 150, 100, 100);
		Triangle triangle = new Triangle(200, 200, 100, 50, 50, 50);
		FlowerModel flowerCurve = new FlowerModel(100, 350, 10, 50);
		DropModel dropCurve = new DropModel(300, 100, 60, 60);
		
		
		// Istanzio un CompositeDrawable, a cui aggiungo gli oggetti uniformi
		CompositeDrawable compositeDrawable = new CompositeDrawable();
		
			compositeDrawable.getDrawables().add(circle);
			compositeDrawable.getDrawables().add(rectangle);
			compositeDrawable.getDrawables().add(triangle);
			compositeDrawable.getDrawables().add(new CurveDrawable(flowerCurve));
			compositeDrawable.getDrawables().add(new CurveDrawable(dropCurve));



			
		// Setto i settings predefiniti
		DefaultSettings.getSettings().setColor(Color.RED);
		DefaultSettings.getSettings().setWidth(2);
		
		// Coloro e imposto la larghezza del tratto a tutto il compositeDrawable
		StrokedDrawable strColCompDrawable = new StrokedDrawable(
				new ColoredDrawable(	( DefaultSettings.getSettings().getColor() ),
						compositeDrawable), DefaultSettings.getSettings().getWidth());
		
		
		// Creo anche la spirale, con impostazioni a se:
		SpiralModel spiralCurve = new SpiralModel(200, 200, 10, 100);

		StrokedDrawable strColSpiral = new StrokedDrawable(new ColoredDrawable(Color.GREEN, new CurveDrawable(spiralCurve)), 1);
		
		// Aggiungo i Drawables al pannello
		panel9.addDrawable(strColCompDrawable);
		panel9.addDrawable(strColSpiral);
		
		
		frame9.getContentPane().add(panel9);
		frame9.setVisible(true);
		
		
		
	}

}
