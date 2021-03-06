package drawings.generators;

import java.util.ArrayList;

import drawings.Circle;
import drawings.Drawable;
import drawings.IDrawableGenerator;

public class CircleGenerator implements IDrawableGenerator{
	
	@Override
	public Drawable generate(ArrayList<String> parameters) {
		
		int x = new Integer(parameters.get(0));
			// Oppure: x = Integer.parseInt(parameters.get(0));
		
		int y = new Integer(parameters.get(1));
			//Oppure: y = Integer.parseInt(parameters.get(1));
		
		int radius = new Integer(parameters.get(2));
			// Oppure: radius = Integer.parseInt(parameters.get(2));
		
		return new Circle(x, y, radius);
	}
	
	

}
